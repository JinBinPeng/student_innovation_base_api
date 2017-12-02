package com.yigong.student_innovation_base_api.doc;

/**
 * 消息通知接口文档代码
 * @author jinbin
 * @date 2017-09-16 16:50
 */
public class NoticeDoc {
    /**
     *  @apiDefine Result
     *  @apiSuccess {String} msg 响应结果
     *  @apiSuccess {Number} code 响应代码
     *  @apiSuccess {String} error 错误信息
     *  @apiSuccess {Boolean} success 相应状态
     *  @apiSuccess {Object} data 主体信息
     */
    /**
     *  @apiDefine Notice
     *  @apiSuccess (data){String} noticeId 消息ID
     *  @apiSuccess (data){String}  senderId 发送者ID
     *  @apiSuccess (data){Object}  sender 发送者信息
     *  @apiSuccess (data){String}  receiverId 接受者ID
     *  @apiSuccess (data){Object}  receiver 接受者信息
     *  @apiSuccess (data){String}  title 消息标题
     *  @apiSuccess (data){String}  summary 消息摘要
     *  @apiSuccess (data){Long}  createTime 创建时间
     *  @apiSuccess (data){Long}  updateTime 更新时间
     *  @apiSuccess (data){Integer} read 是否已读，0：未读，1：已读
     */
    /**
     * @api {post} http://localhost:8080/base/api/notice 添加消息发送
     * @apiGroup Notice
     * @apiParam {String} senderId 发送者ID
     * @apiParam {Object} sender 发送者信息
     * @apiParam {String} receiverId 接受者ID
     * @apiParam {Object} receiver 接受者信息
     * @apiParam {String} title 消息标题
     * @apiParam {String} summary 消息摘要
     * @apiSuccessExample Success-Request:
     * {
     * "title":"我是标题",
     * "summary":"我是消息摘要",
     * "receiverId":"5a71afab-7a75-11e7-9ddf-e4f89cdc0d1f"
     * }
     * @apiUse Result
     * @apiSuccessExample Success-Response:
     * {
     * "msg": "发布消息通知成功",
     * "code": 200,
     * "data": {
     * "noticeId": "e32dd3aa-9adc-11e7-bbc4-e4f89cdc0d1f",
     * "senderId": null,
     * "sender": {
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
     * "receiverId": null,
     * "receiver": {
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
     * "title": "我是标题",
     * "summary": "我是消息摘要",
     * "read": null,
     * "createTime": 1505565885,
     * "updateTime": 0
     * },
     * "success": true,
     * "error": null
     * }
     */
    void addNotice() {

    }

    /**
     * @api {delete} http://localhost:8080/base/api/notice/{noticeId} 删除消息通知
     * @apiGroup Notice
     * @apiParam {String} noticeId 消息ID
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
    void deleteNotice() {

    }

    /**
     * @api {put} http://localhost:8080/base/api/notice/{noticeId} 消息从未读到已读
     * @apiGroup Notice
     * @apiParam {String} noticeId 消息ID
     * @apiUse Result
     * @apiSuccessExample Success-Response:
     * {
     * "msg": "消息通知已读",
     * "code": 200,
     * "data": {
     * "noticeId": "70bfc003-9add-11e7-bbc4-e4f89cdc0d1f",
     * "senderId": null,
     * "sender": {
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
     * "receiverId": null,
     * "receiver": {
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
     * "title": "我是标题",
     * "summary": "我是消息摘要",
     * "read": null,
     * "createTime": 1505566122,
     * "updateTime": 0
     * },
     * "success": true,
     * "error": null
     * }
     */
    void updateAttend() {

    }

    /**
     * @api {get} http://localhost:8080/base/api/notice 获取消息通知列表
     * @apiGroup Notice
     * @apiParam {int} pageNum 页码
     * @apiParam {int} pageSize 每页数量
     * @apiParam {boolean} all 是否获取所有
     * @apiParam {String} condition 搜索的条件，例如标题和摘要
     * @apiParamExample {json} example
     * api/notice?all=true&condition=标题
     * @apiUse Result
     * @apiSuccessExample Success-Response:
     * {
     * "msg": "获取第1页消息通知信息成功",
     * "code": 200,
     * "data": {
     * "pageNum": 1,
     * "pageSize": 5,
     * "size": 3,
     * "orderBy": null,
     * "startRow": 1,
     * "endRow": 3,
     * "total": 3,
     * "pages": 1,
     * "list": [
     * {
     * "noticeId": "70bfc003-9add-11e7-bbc4-e4f89cdc0d1f",
     * "senderId": null,
     * "sender": {
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
     * "receiverId": null,
     * "receiver": {
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
     * "title": "我是标题",
     * "summary": "我是消息摘要",
     * "read": null,
     * "createTime": 1505566122,
     * "updateTime": 0
     * },
     * {
     * "noticeId": "7045759a-9add-11e7-bbc4-e4f89cdc0d1f",
     * "senderId": null,
     * "sender": {
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
     * "receiverId": null,
     * "receiver": {
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
     * "title": "我是标题",
     * "summary": "我是消息摘要",
     * "read": null,
     * "createTime": 1505566121,
     * "updateTime": 0
     * },
     * {
     * "noticeId": "6c92cade-9add-11e7-bbc4-e4f89cdc0d1f",
     * "senderId": null,
     * "sender": {
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
     * "receiverId": null,
     * "receiver": {
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
     * "title": "我是标题",
     * "summary": "我是消息摘要",
     * "read": null,
     * "createTime": 1505566115,
     * "updateTime": 0
     * }
     * ],
     * "firstPage": 1,
     * "prePage": 0,
     * "nextPage": 0,
     * "lastPage": 1,
     * "isFirstPage": true,
     * "isLastPage": true,
     * "hasPreviousPage": false,
     * "hasNextPage": false,
     * "navigatePages": 8,
     * "navigatepageNums": [
     * 1
     * ]
     * },
     * "success": true,
     * "error": null
     * }
     */
    void listNotice() {

    }
}
