package com.yigong.student_innovation_base_api.doc;

/**
 * 签到接口文档代码
 * @author jinbin
 * @date 2017-11-03 23:21
 */
public class CheckDoc {
    /**
     *  @apiDefine Result
     *  @apiSuccess {String} msg 响应结果
     *  @apiSuccess {Number} code 响应代码
     *  @apiSuccess {String} error 错误信息
     *  @apiSuccess {Boolean} success 相应状态
     *  @apiSuccess {Object} data 主体信息
     */
    /**
     *  @apiDefine CheckVo
     *  @apiSuccess (data){String} id  id
     *  @apiSuccess (data){String} attendId 值班Id
     *  @apiSuccess (data){Object}  attendVo 值班信息
     *  @apiSuccess (data){String}  checkTime 签到时间
     *  @apiSuccess (data){String}  userId 签到者Id
     *  @apiSuccess (data){Object}  userVo 签到信息
     *  @apiSuccess (data){String}  checkIp 签到Ip
     *  @apiSuccess (data){String}  checkMemberName 签到人
     */
    /**
     * @api {post} http://localhost:8080/base/api/check 添加签到信息
     * @apiGroup CheckVo
     * @apiParam {String}  checkIp 签到Ip
     * @apiParam {String} attendId 值班Id
     * @apiSuccessExample Success-Request:
     * {
     * "checkIp":"123.12.12.1",
     * "attendId":"831a7e36-bf7a-11e7-af40-e4f89cdc0d1f"
     * }
     * @apiUse Result
     * @apiSuccessExample Success-Response:
     * {
     * "msg": "签到成功",
     * "code": 200,
     * "data": {
     * "id": "40883217-c155-11e7-a4d7-e4f89cdc0d1f",
     * "userId": null,
     * "userVo": {
     * "userId": "cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f",
     * "memberName": "张三",
     * "password": "15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225",
     * "phoneNumber": "15820638000",
     * "department": "研发部",
     * "grade": "0",
     * "imageUrl": null,
     * "createTime": 1509628932,
     * "updateTime": 1505554379,
     * "delete": false,
     * "userLevel": 3
     * },
     * "attendId": null,
     * "attendVo": {
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
     * "createTime": 1509628932,
     * "updateTime": 1505554379,
     * "delete": false,
     * "userLevel": 3
     * },
     * "attendMemberId": null,
     * "userVo": {
     * "userId": "5a71afab-7a75-11e7-9ddf-e4f89cdc0d1f",
     * "memberName": "锦斌",
     * "password": "0985b889a1fe4f4e1fb925061ac6fb2247f10875f5fcbe63eec2ab55ed68970e",
     * "phoneNumber": "15820638007",
     * "department": "研发部",
     * "grade": "0",
     * "imageUrl": null,
     * "createTime": 1509628932,
     * "updateTime": 1509630082,
     * "delete": false,
     * "userLevel": 2
     * },
     * "editorId": null,
     * "editor": null
     * },
     * "checkMemberName": "张三",
     * "checkTime": 1509795755,
     * "checkIp": "123.12.12.1"
     * },
     * "success": true,
     * "error": null
     * }
     */
    void addCheck() {

    }

    /**
     * @api {put} http://localhost:8080/base/api/check/getCheck 根据签到人的名字查询签到信息
     * @apiGroup CheckVo
     * @apiParam {String}  checkMemberName 签到人
     * @apiSuccessExample Success-Request:
     * {
     * "checkMemberName": "张三"
     * }
     * @apiUse Result
     * @apiSuccessExample Success-Response:
     * {
     * "msg": "查询签到信息成功",
     * "code": 200,
     * "data": [
     * {
     * "id": "40883217-c155-11e7-a4d7-e4f89cdc0d1f",
     * "userId": null,
     * "userVo": {
     * "userId": "cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f",
     * "memberName": "张三",
     * "password": "15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225",
     * "phoneNumber": "15820638000",
     * "department": "研发部",
     * "grade": "0",
     * "imageUrl": null,
     * "createTime": 1509628932,
     * "updateTime": 1505554379,
     * "delete": false,
     * "userLevel": 3
     * },
     * "attendId": null,
     * "attendVo": {
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
     * "createTime": 1509628932,
     * "updateTime": 1505554379,
     * "delete": false,
     * "userLevel": 3
     * },
     * "attendMemberId": null,
     * "userVo": {
     * "userId": "5a71afab-7a75-11e7-9ddf-e4f89cdc0d1f",
     * "memberName": "锦斌",
     * "password": "0985b889a1fe4f4e1fb925061ac6fb2247f10875f5fcbe63eec2ab55ed68970e",
     * "phoneNumber": "15820638007",
     * "department": "研发部",
     * "grade": "0",
     * "imageUrl": null,
     * "createTime": 1509628932,
     * "updateTime": 1509630082,
     * "delete": false,
     * "userLevel": 2
     * },
     * "editorId": null,
     * "editor": null
     * },
     * "checkMemberName": "张三",
     * "checkTime": 1509795755,
     * "checkIp": "123.12.12.1"
     * },
     * {
     * "id": "ba48c8a7-c152-11e7-af40-e4f89cdc0d1f",
     * "userId": null,
     * "userVo": {
     * "userId": "cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f",
     * "memberName": "张三",
     * "password": "15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225",
     * "phoneNumber": "15820638000",
     * "department": "研发部",
     * "grade": "0",
     * "imageUrl": null,
     * "createTime": 1509628932,
     * "updateTime": 1505554379,
     * "delete": false,
     * "userLevel": 3
     * },
     * "attendId": null,
     * "attendVo": {
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
     * "createTime": 1509628932,
     * "updateTime": 1505554379,
     * "delete": false,
     * "userLevel": 3
     * },
     * "attendMemberId": null,
     * "userVo": {
     * "userId": "5a71afab-7a75-11e7-9ddf-e4f89cdc0d1f",
     * "memberName": "锦斌",
     * "password": "0985b889a1fe4f4e1fb925061ac6fb2247f10875f5fcbe63eec2ab55ed68970e",
     * "phoneNumber": "15820638007",
     * "department": "研发部",
     * "grade": "0",
     * "imageUrl": null,
     * "createTime": 1509628932,
     * "updateTime": 1509630082,
     * "delete": false,
     * "userLevel": 2
     * },
     * "editorId": null,
     * "editor": null
     * },
     * "checkMemberName": "张三",
     * "checkTime": 1509794620,
     * "checkIp": "123.12.12.1"
     * }
     * ],
     * "success": true,
     * "error": null
     * }
     */
    void getCheck() {

    }

    /**
     * @api {get} http://localhost:8080/base/api/check/getCheck/{id} 根据id查询签到信息
     * @apiGroup CheckVo
     * @apiParam {String} id   签到ID
     * @apiSuccessExample Success-Request:
     * http://localhost:8080/base/api/check/getCheck/ba48c8a7-c152-11e7-af40-e4f89cdc0d1f
     * @apiUse Result
     * @apiSuccessExample Success-Response:
     * {
     * "msg": "查询签到信息成功",
     * "code": 200,
     * "data": {
     * "id": "ba48c8a7-c152-11e7-af40-e4f89cdc0d1f",
     * "userId": null,
     * "userVo": {
     * "userId": "cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f",
     * "memberName": "张三",
     * "password": "8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92",
     * "phoneNumber": "15820638000",
     * "department": "研发部",
     * "grade": "0",
     * "imageUrl": null,
     * "createTime": 1509628932,
     * "updateTime": 1509805648,
     * "delete": false,
     * "userLevel": 3
     * },
     * "attendId": null,
     * "attendVo": {
     * "attendId": "831a7e36-bf7a-11e7-af40-e4f89cdc0d1f",
     * "checkTime": "2017/11/2 10:44:30",
     * "attendTime": "星期四",
     * "createTime": 1509591823,
     * "updateTime": 1509591823,
     * "creatorId": null,
     * "announcer": {
     * "userId": "cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f",
     * "memberName": "张三",
     * "password": "8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92",
     * "phoneNumber": "15820638000",
     * "department": "研发部",
     * "grade": "0",
     * "imageUrl": null,
     * "createTime": 1509628932,
     * "updateTime": 1509805648,
     * "delete": false,
     * "userLevel": 3
     * },
     * "attendMemberId": null,
     * "userVo": {
     * "userId": "5a71afab-7a75-11e7-9ddf-e4f89cdc0d1f",
     * "memberName": "锦斌",
     * "password": "0985b889a1fe4f4e1fb925061ac6fb2247f10875f5fcbe63eec2ab55ed68970e",
     * "phoneNumber": "15820638007",
     * "department": "研发部",
     * "grade": "0",
     * "imageUrl": null,
     * "createTime": 1509628932,
     * "updateTime": 1509630082,
     * "delete": false,
     * "userLevel": 2
     * },
     * "editorId": null,
     * "editor": null
     * },
     * "checkMemberName": "张三",
     * "checkTime": 1509794620,
     * "checkIp": "123.12.12.1"
     * },
     * "success": true,
     * "error": null
     * }
     */
    void getCheckById() {

    }

    /**
     * @api {get} http://localhost:8080/base/api/check 获取签到列表
     * @apiGroup CheckVo
     * @apiParam {int} pageNum 页码
     * @apiParam {int} pageSize 每页数量
     * @apiParam {boolean} all 是否获取所有
     * @apiParam {String} condition 搜索的条件，例如签到人
     * @apiParamExample {json} example
     * api/check?all=true&condition=张三
     * @apiUse Result
     * @apiSuccessExample Success-Response:
     * {
     * "msg": "根据搜索条件获取签到信息成功",
     * "code": 200,
     * "data": [
     * {
     * "id": "40883217-c155-11e7-a4d7-e4f89cdc0d1f",
     * "userId": null,
     * "userVo": {
     * "userId": "cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f",
     * "memberName": "张三",
     * "password": "15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225",
     * "phoneNumber": "15820638000",
     * "department": "研发部",
     * "grade": "0",
     * "imageUrl": null,
     * "createTime": 1509628932,
     * "updateTime": 1505554379,
     * "delete": false,
     * "userLevel": 3
     * },
     * "attendId": null,
     * "attendVo": {
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
     * "createTime": 1509628932,
     * "updateTime": 1505554379,
     * "delete": false,
     * "userLevel": 3
     * },
     * "attendMemberId": null,
     * "userVo": {
     * "userId": "5a71afab-7a75-11e7-9ddf-e4f89cdc0d1f",
     * "memberName": "锦斌",
     * "password": "0985b889a1fe4f4e1fb925061ac6fb2247f10875f5fcbe63eec2ab55ed68970e",
     * "phoneNumber": "15820638007",
     * "department": "研发部",
     * "grade": "0",
     * "imageUrl": null,
     * "createTime": 1509628932,
     * "updateTime": 1509630082,
     * "delete": false,
     * "userLevel": 2
     * },
     * "editorId": null,
     * "editor": null
     * },
     * "checkMemberName": "张三",
     * "checkTime": 1509795755,
     * "checkIp": "123.12.12.1"
     * },
     * {
     * "id": "ba48c8a7-c152-11e7-af40-e4f89cdc0d1f",
     * "userId": null,
     * "userVo": {
     * "userId": "cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f",
     * "memberName": "张三",
     * "password": "15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225",
     * "phoneNumber": "15820638000",
     * "department": "研发部",
     * "grade": "0",
     * "imageUrl": null,
     * "createTime": 1509628932,
     * "updateTime": 1505554379,
     * "delete": false,
     * "userLevel": 3
     * },
     * "attendId": null,
     * "attendVo": {
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
     * "createTime": 1509628932,
     * "updateTime": 1505554379,
     * "delete": false,
     * "userLevel": 3
     * },
     * "attendMemberId": null,
     * "userVo": {
     * "userId": "5a71afab-7a75-11e7-9ddf-e4f89cdc0d1f",
     * "memberName": "锦斌",
     * "password": "0985b889a1fe4f4e1fb925061ac6fb2247f10875f5fcbe63eec2ab55ed68970e",
     * "phoneNumber": "15820638007",
     * "department": "研发部",
     * "grade": "0",
     * "imageUrl": null,
     * "createTime": 1509628932,
     * "updateTime": 1509630082,
     * "delete": false,
     * "userLevel": 2
     * },
     * "editorId": null,
     * "editor": null
     * },
     * "checkMemberName": "张三",
     * "checkTime": 1509794620,
     * "checkIp": "123.12.12.1"
     * }
     * ],
     * "success": true,
     * "error": null
     * }
     */
    void getCheckList() {

    }
}
