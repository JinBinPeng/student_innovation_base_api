package com.yigong.student_innovation_base_api.doc;

/**
 * 动态接口文档代码
 * @author jinbin
 * @date 2017-09-16 16:48
 */
public class DynamicDoc {
    /**
     *  @apiDefine Result
     *  @apiSuccess {String} msg 响应结果
     *  @apiSuccess {Number} code 响应代码
     *  @apiSuccess {String} error 错误信息
     *  @apiSuccess {Boolean} success 相应状态
     *  @apiSuccess {Object} data 主体信息
     */
    /**
     *  @apiDefine Dynamic
     *  @apiSuccess (data){String} dynamicId 动态ID
     *  @apiSuccess (data){String}  title 动态标题
     *  @apiSuccess (data){String}  content 动态内容
     *  @apiSuccess (data){String}  imageUrl 图片URL
     *  @apiSuccess (data){String}  announcerId 发布者ID
     *  @apiSuccess (data){Object}  announcer 发布者信息
     *  @apiSuccess (data){Long}  createTime 创建时间
     *  @apiSuccess (data){Long}  updateTime 更新时间
     *  @apiSuccess (data){Integer} delete 0表示未删除，1表示已删除
     */
    /**
     * @api {post} http://localhost:8080/base/api/dynamic 动态发布
     * @apiGroup Dynamic
     * @apiParam {String} title 动态标题
     * @apiParam {String} content 动态内容
     * @apiParam {String} imageUrl 图片URL
     * @apiSuccessExample Success-Request:
     * {
     * "title":"我是标题",
     * "content":"我是内容"
     * }
     * @apiUse Result
     * @apiSuccessExample Success-Response:
     * {
     * "msg": "发布动态成功",
     * "code": 200,
     * "data": {
     * "dynamicId": "ef0eb76c-9ad7-11e7-bbc4-e4f89cdc0d1f",
     * "title": "我是标题",
     * "content": "我是内容",
     * "imageUrl": null,
     * "announcerId": null,
     * "createTime": 2017,
     * "updateTime": 0,
     * "announcer": {
     * "userId": "cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f",
     * "memberName": "张三",
     * "password": "15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225",
     * "phoneNumber": "15820638000",
     * "department": "研发部",
     * "imageUrl": null,
     * "createTime": 1505553392,
     * "updateTime": 1505554379,
     * "delete": false,
     * "userLevel": 1
     * },
     * "delete": false
     * },
     * "success": true,
     * "error": null
     * }
     */
    void addDynamic() {

    }

    /**
     * @api {put} http://localhost:8080/base/api/dynamic/batchDelete 删除单个或多个动态信息
     * @apiGroup Dynamic
     * @apiParam {String} dynamicId 动态ID
     * @apiSuccessExample Success-Request:
     * {
     * "dynamicIds":[
     * "d74f4d41-7eab-11e7-983c-e4f89cdc0d1f",
     * "78e86813-7da6-11e7-983c-e4f89cdc0d1f",
     * "784b53e3-7da6-11e7-983c-e4f89cdc0d1f"
     * ]
     * }
     * @apiUse Result
     * @apiSuccessExample Success-Response:
     * {
     * "msg": "删除成功",
     * "code": 200,
     * "data": null,
     * "success": true,
     * "error": null
     * }
     */
    void batchDeleteDynamic() {

    }

    /**
     * @api {get} http://localhost:8080/base/api/dynamic 获取动态列表
     * @apiGroup Dynamic
     * @apiParam {int} pageNum 页码
     * @apiParam {int} pageSize 每页数量
     * @apiParam {boolean} all 是否获取所有
     * @apiParam {String} condition 搜索的条件，例如标题
     * @apiParamExample {json} example
     * api/dynamic?all=true&condition=标题
     * @apiUse Result
     * @apiSuccessExample Success-Response:
     * {
     * "msg": "根据搜索条件获取基地动态信息成功",
     * "code": 200,
     * "data": [
     * {
     * "dynamicId": "ef0eb76c-9ad7-11e7-bbc4-e4f89cdc0d1f",
     * "title": "我是标题",
     * "content": "我是内容",
     * "imageUrl": null,
     * "announcerId": null,
     * "createTime": 2017,
     * "updateTime": 0,
     * "announcer": {
     * "userId": "cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f",
     * "memberName": "张三",
     * "password": "15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225",
     * "phoneNumber": "15820638000",
     * "department": "研发部",
     * "imageUrl": null,
     * "createTime": 1505553392,
     * "updateTime": 1505554379,
     * "delete": false,
     * "userLevel": 1
     * },
     * "delete": false
     * },
     * {
     * "dynamicId": "10f2eb71-80a4-11e7-a658-e4f89cdc0d1f",
     * "title": "我是标题",
     * "content": "我是内容",
     * "imageUrl": null,
     * "announcerId": null,
     * "createTime": 2017,
     * "updateTime": 0,
     * "announcer": {
     * "userId": "5a71afab-7a75-11e7-9ddf-e4f89cdc0d1f",
     * "memberName": "锦斌",
     * "password": "8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92",
     * "phoneNumber": "15820638007",
     * "department": "研发部",
     * "imageUrl": null,
     * "createTime": 1502003010,
     * "updateTime": 1502009829,
     * "delete": false,
     * "userLevel": 2
     * },
     * "delete": false
     * },
     * {
     * "dynamicId": "10696e88-80a4-11e7-a658-e4f89cdc0d1f",
     * "title": "我是标题",
     * "content": "我是内容",
     * "imageUrl": null,
     * "announcerId": null,
     * "createTime": 2017,
     * "updateTime": 0,
     * "announcer": {
     * "userId": "5a71afab-7a75-11e7-9ddf-e4f89cdc0d1f",
     * "memberName": "锦斌",
     * "password": "8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92",
     * "phoneNumber": "15820638007",
     * "department": "研发部",
     * "imageUrl": null,
     * "createTime": 1502003010,
     * "updateTime": 1502009829,
     * "delete": false,
     * "userLevel": 2
     * },
     * "delete": false
     * },
     * {
     * "dynamicId": "0e96a6bc-80a4-11e7-a658-e4f89cdc0d1f",
     * "title": "我是标题",
     * "content": "我是内容",
     * "imageUrl": null,
     * "announcerId": null,
     * "createTime": 2017,
     * "updateTime": 0,
     * "announcer": {
     * "userId": "5a71afab-7a75-11e7-9ddf-e4f89cdc0d1f",
     * "memberName": "锦斌",
     * "password": "8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92",
     * "phoneNumber": "15820638007",
     * "department": "研发部",
     * "imageUrl": null,
     * "createTime": 1502003010,
     * "updateTime": 1502009829,
     * "delete": false,
     * "userLevel": 2
     * },
     * "delete": false
     * }
     * ],
     * "success": true,
     * "error": null
     * }
     */
    void listDynamic() {

    }
}
