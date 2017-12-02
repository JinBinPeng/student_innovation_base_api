package com.yigong.student_innovation_base_api.doc;

/**
 * 值班接口文档代码
 * @author jinbin
 * @date 2017-09-16 16:51
 */
public class AttendDoc {
    /**
     *  @apiDefine Result
     *  @apiSuccess {String} msg 响应结果
     *  @apiSuccess {Number} code 响应代码
     *  @apiSuccess {String} error 错误信息
     *  @apiSuccess {Boolean} success 相应状态
     *  @apiSuccess {Object} data 主体信息
     */
    /**
     *  @apiDefine Attend
     *  @apiSuccess (data){String} attendId 值班ID
     *  @apiSuccess (data){String}  checkTime 签到时间
     *  @apiSuccess (data){String}  attendTime 值班时间(星期)
     *  @apiSuccess (data){Long}  createTime 创建时间
     *  @apiSuccess (data){Long}  updateTime 更新时间
     *  @apiSuccess (data){String}  creatorId 值班创建者ID
     *  @apiSuccess (data){Object}  announcer 创建者信息
     *  @apiSuccess (data){String} attendMemberId 值班人员ID
     *  @apiSuccess (data){Object} userVo 值班人员信息集合
     *  @apiSuccess (data){String}  editorId 值班修改者ID
     *  @apiSuccess (data){Object}  editor 值班修改者信息
     */
    /**
     *  @apiDefine AttendDTO
     *  @apiSuccess (data){String}  checkTime 签到时间
     *  @apiSuccess (data){String}  attendTime 值班时间
     *  @apiSuccess (data){String}  attendMemberIds 值班人员的ID集合
     */
    /**
     * @api {post} http://localhost:8080/base/api/attend 添加值班信息
     * @apiGroup Attend
     * @apiParam {String}  checkTime 签到时间
     * @apiParam {String}  attendTime 值班时间
     * @apiParam {String} creatorId 值班创建者ID
     * @apiParam {Object}  announcer 创建者信息
     * @apiSuccessExample Success-Request:
     * {
     * "attendMemberIds": [
     * "5a71afab-7a75-11e7-9ddf-e4f89cdc0d1f",
     * "ccab4897-bb25-11e7-b018-e4f89cdc0d1f"
     * ],
     * "attendTime": "星期四",
     * "checkTime": "2017/11/2 10:44:30"
     * }
     * @apiUse Result
     * @apiSuccessExample Success-Response:
     * {
     * "msg": "发布值班安排成功",
     * "code": 200,
     * "data": [
     * {
     * "attendId": "831a7e36-bf7a-11e7-af40-e4f89cdc0d1f",
     * "checkTime": "2017/11/2 10:44:30",
     * "attendTime": "星期四",
     * "createTime": 1509591823,
     * "updateTime": 1509591823,
     * "creatorId": null,
     * "announcer": {
     * "userId": "cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f",
     * "memberName": "张三",
     * "password": "15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225",
     * "phoneNumber": "15820638000",
     * "department": "研发部",
     * "grade": "0",
     * "imageUrl": null,
     * "createTime": 1505553392,
     * "updateTime": 1505554379,
     * "delete": false,
     * "userLevel": 3
     * },
     * "attendMemberId": null,
     * "userVo": {
     * "userId": "5a71afab-7a75-11e7-9ddf-e4f89cdc0d1f",
     * "memberName": "锦斌",
     * "password": "8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92",
     * "phoneNumber": "15820638007",
     * "department": "研发部",
     * "grade": "0",
     * "imageUrl": null,
     * "createTime": 1502003010,
     * "updateTime": 1502009829,
     * "delete": false,
     * "userLevel": 2
     * },
     * "editorId": null,
     * "editor": null
     * },
     * {
     * "attendId": "834e317f-bf7a-11e7-af40-e4f89cdc0d1f",
     * "checkTime": "2017/11/2 10:44:30",
     * "attendTime": "星期四",
     * "createTime": 1509591823,
     * "updateTime": 1509591823,
     * "creatorId": null,
     * "announcer": {
     * "userId": "cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f",
     * "memberName": "张三",
     * "password": "15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225",
     * "phoneNumber": "15820638000",
     * "department": "研发部",
     * "grade": "0",
     * "imageUrl": null,
     * "createTime": 1505553392,
     * "updateTime": 1505554379,
     * "delete": false,
     * "userLevel": 3
     * },
     * "attendMemberId": null,
     * "userVo": {
     * "userId": "ccab4897-bb25-11e7-b018-e4f89cdc0d1f",
     * "memberName": "测试2",
     * "password": "8c6976e5b5410415bde908bd4dee15dfb167a9c873fc4bb8a81f6f2ab448a918",
     * "phoneNumber": "15820600002",
     * "department": "研发部",
     * "grade": "2015",
     * "imageUrl": null,
     * "createTime": 1509115663,
     * "updateTime": 0,
     * "delete": false,
     * "userLevel": 1
     * },
     * "editorId": null,
     * "editor": null
     * }
     * ],
     * "success": true,
     * "error": null
     * }
     */
    void addAttend() {

    }

    /**
     * @api {put} http://localhost:8080/base/api/attend 修改值班安排
     * @apiGroup Attend
     * @apiParam {String} attendId 值班ID
     * @apiParam {String} attendMemberId 值班人员ID
     * @apiParam {String}  checkTime 签到时间
     * @apiParam {String}  attendTime 值班时间
     * @apiParam {String} creatorId 值班创建者ID
     * @apiParam {Object}  announcer 创建者信息
     * @apiParam {String} editorId 值班修改者ID
     * @apiParam {Object}  editor 值班修改者信息
     * @apiSuccessExample Success-Request:
     * {
     * "attendId": "2b1a7776-bf78-11e7-af40-e4f89cdc0d1f",
     * "attendMemberId": "5a71afab-7a75-11e7-9ddf-e4f89cdc0d1f",
     * "attendTime": "星期五",
     * "checkTime": "2017/11/2 10:44:30"
     * }
     * @apiUse Result
     * @apiSuccessExample Success-Response:
     * {
     * "msg": "更新值班安排成功",
     * "code": 200,
     * "data": {
     * "attendId": "2b1a7776-bf78-11e7-af40-e4f89cdc0d1f",
     * "checkTime": "2017/11/2 10:44:30",
     * "attendTime": "星期五",
     * "createTime": 1509590816,
     * "updateTime": 1509591493,
     * "creatorId": null,
     * "announcer": {
     * "userId": "cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f",
     * "memberName": "张三",
     * "password": "15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225",
     * "phoneNumber": "15820638000",
     * "department": "研发部",
     * "grade": "0",
     * "imageUrl": null,
     * "createTime": 1505553392,
     * "updateTime": 1505554379,
     * "delete": false,
     * "userLevel": 3
     * },
     * "attendMemberId": null,
     * "userVo": {
     * "userId": "5a71afab-7a75-11e7-9ddf-e4f89cdc0d1f",
     * "memberName": "锦斌",
     * "password": "8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92",
     * "phoneNumber": "15820638007",
     * "department": "研发部",
     * "grade": "0",
     * "imageUrl": null,
     * "createTime": 1502003010,
     * "updateTime": 1502009829,
     * "delete": false,
     * "userLevel": 2
     * },
     * "editorId": null,
     * "editor": {
     * "userId": "cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f",
     * "memberName": "张三",
     * "password": "15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225",
     * "phoneNumber": "15820638000",
     * "department": "研发部",
     * "grade": "0",
     * "imageUrl": null,
     * "createTime": 1505553392,
     * "updateTime": 1505554379,
     * "delete": false,
     * "userLevel": 3
     * }
     * },
     * "success": true,
     * "error": null
     * }
     */
    void updateAttend() {

    }

    /**
     * @api {delete} http://localhost:8080/base/api/attend/{attendId} 删除值班安排
     * @apiGroup Attend
     * @apiParam {String} attendId 值班ID
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
    void deleteAttend() {

    }

    /**
     * @api {get} http://localhost:8080/base/api/attend 获取值班列表信息
     * @apiGroup Attend
     * @apiParam {int} pageNum 页码
     * @apiParam {int} pageSize 每页数量
     * @apiParam {boolean} all 是否获取所有
     * @apiParam {String} condition 搜索的条件，例如签到时间和值班时间
     * @apiParamExample {json} example
     * api/attend?all=true&condition=2017-09-16
     * @apiUse Result
     * @apiSuccessExample Success-Response:
     * {
     * "msg": "获取第1页基地值班信息成功",
     * "code": 200,
     * "data": {
     * "pageNum": 1,
     * "pageSize": 5,
     * "size": 2,
     * "orderBy": null,
     * "startRow": 1,
     * "endRow": 2,
     * "total": 2,
     * "pages": 1,
     * "list": [
     * {
     * "attendId": "831a7e36-bf7a-11e7-af40-e4f89cdc0d1f",
     * "checkTime": "2017/11/2 10:44:30",
     * "attendTime": "星期四",
     * "createTime": 1509591823,
     * "updateTime": 1509591823,
     * "creatorId": null,
     * "announcer": {
     * "userId": "cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f",
     * "memberName": "张三",
     * "password": "15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225",
     * "phoneNumber": "15820638000",
     * "department": "研发部",
     * "grade": "0",
     * "imageUrl": null,
     * "createTime": 1505553392,
     * "updateTime": 1505554379,
     * "delete": false,
     * "userLevel": 3
     * },
     * "attendMemberId": null,
     * "userVo": {
     * "userId": "5a71afab-7a75-11e7-9ddf-e4f89cdc0d1f",
     * "memberName": "锦斌",
     * "password": "8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92",
     * "phoneNumber": "15820638007",
     * "department": "研发部",
     * "grade": "0",
     * "imageUrl": null,
     * "createTime": 1502003010,
     * "updateTime": 1502009829,
     * "delete": false,
     * "userLevel": 2
     * },
     * "editorId": null,
     * "editor": null
     * },
     * {
     * "attendId": "834e317f-bf7a-11e7-af40-e4f89cdc0d1f",
     * "checkTime": "2017/11/2 10:44:30",
     * "attendTime": "星期四",
     * "createTime": 1509591823,
     * "updateTime": 1509591823,
     * "creatorId": null,
     * "announcer": {
     * "userId": "cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f",
     * "memberName": "张三",
     * "password": "15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225",
     * "phoneNumber": "15820638000",
     * "department": "研发部",
     * "grade": "0",
     * "imageUrl": null,
     * "createTime": 1505553392,
     * "updateTime": 1505554379,
     * "delete": false,
     * "userLevel": 3
     * },
     * "attendMemberId": null,
     * "userVo": {
     * "userId": "ccab4897-bb25-11e7-b018-e4f89cdc0d1f",
     * "memberName": "测试2",
     * "password": "8c6976e5b5410415bde908bd4dee15dfb167a9c873fc4bb8a81f6f2ab448a918",
     * "phoneNumber": "15820600002",
     * "department": "研发部",
     * "grade": "2015",
     * "imageUrl": null,
     * "createTime": 1509115663,
     * "updateTime": 0,
     * "delete": false,
     * "userLevel": 1
     * },
     * "editorId": null,
     * "editor": null
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
    void listAttend() {

    }
}
