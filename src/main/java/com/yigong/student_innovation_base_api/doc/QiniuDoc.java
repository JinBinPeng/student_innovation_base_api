package com.yigong.student_innovation_base_api.doc;

/**
 * 七牛接口文档代码
 * @author jinbin
 * @date 2017-09-16 20:19
 */
public class QiniuDoc {
    /**
     *  @apiDefine Qiniu
     */
    /**
     * @api {post} http://localhost:8080/base/api/qiniu/info 图片,Excel表存储
     * @apiGroup Qiniu
     * @apiUse Result
     * @apiSuccessExample Success-Response:
     * {
     * "success": true/false,
     * "msg": "error message", # optional
     * "file_path": "[real file path]"
     * }
     */
    void uploadInfoImages() {

    }

    /**
     * @api {post} http://localhost:8080/base/api/qiniu/getToken 获取七牛上传token
     * @apiGroup Qiniu
     * @apiUse Result
     * @apiSuccessExample Success-Response:
     * {
     * "七牛云上传token": "Bx4bezJT0vWnE_gjvLeggEv6xfXG5NgjuvAcit8w:UBNi861JTIA8VEXc_P4dFXuXCGY=:eyJzY29wZSI6InN0dWRlbnQtaW5ub3ZhdGlvbi1iYXNlIiwiZGVhZGxpbmUiOjE1MDcxOTQzMjh9"
     * }
     */
    void getQiniuToken() {

    }

}
