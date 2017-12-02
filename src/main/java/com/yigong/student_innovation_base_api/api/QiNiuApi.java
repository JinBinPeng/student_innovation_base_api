package com.yigong.student_innovation_base_api.api;

import com.alibaba.fastjson.JSONObject;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.util.Auth;
import com.qiniu.util.StringMap;
import com.yigong.student_innovation_base_api.annotation.PassToken;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * 七牛模块API
 * @author jinbin
 * @date 2017-09-24 12:30
 */
@RestController
@RequestMapping("base/api")
public class QiNiuApi {
    /**
     * @description 七牛相关属性
     **/
    @Value("${qiniu.accessKey}")
    String accessKey;
    @Value("${qiniu.secretKey}")
    String secretKey;
    @Value("${qiniu.bucketname}")
    String bucketname;
    @Value("${qiniu.url}")
    String url;
    //APP端获取七牛上传的token
    @PassToken
    @PostMapping("/qiniu/getToken")
    public JSONObject getQiniuToken() {
        //密钥配置
        Auth auth = Auth.create(accessKey, secretKey);
        //指定上传的Zone的信息,自动识别要上传的空间(bucket)的存储区域是华东、华北、华南。
        Zone zone = Zone.autoZone();
        Configuration configuration = new Configuration(zone);
        //创建上传对象
        UploadManager uploadManager = new UploadManager(configuration);
        // 上传文件添加时间戳，防止文件重名，七牛报错
        String datetime = String.valueOf(System.currentTimeMillis());
        //上传到七牛后保存的文件名
        String key = datetime + "yigong_student_innovation_base.png";
        String TOKEN = auth.uploadToken(bucketname);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("七牛云上传token", TOKEN);
        return jsonObject;
    }
    //在动态内容中添加图片，或者导入excel表
    @PassToken
    @PostMapping("/qiniu/info")
    public Object uploadInfoImages(@RequestParam MultipartFile file) throws IOException{
        Auth auth = Auth.create(accessKey, secretKey);
        //设置文件名，用时间戳防止上传文件名重复
        String fileName = String.valueOf(System.currentTimeMillis())+file.getOriginalFilename();
        byte[] bytes = file.getBytes();
        //构造一个带指定Zone对象的配置类,zone2对应的是华南地区
        Configuration cfg = new Configuration(Zone.zone2());
        //...生成上传凭证，然后准备上传
        UploadManager uploadManager = new UploadManager(cfg);
        Response response = uploadManager.put(bytes, "infos/" + fileName, auth.uploadToken(bucketname));
        StringMap map = response.jsonToMap();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("success", true);
        jsonObject.put("file_path", url + "/" + map.get("key"));
        return jsonObject;
    }
}
