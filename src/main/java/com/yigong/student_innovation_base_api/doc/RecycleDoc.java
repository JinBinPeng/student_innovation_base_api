package com.yigong.student_innovation_base_api.doc;

/**
 * 回收站接口文档代码
 * @author jinbin
 * @date 2017-09-16 16:50
 */
public class RecycleDoc {
    /**
     *  @apiDefine Result
     *  @apiSuccess {String} msg 响应结果
     *  @apiSuccess {Number} code 响应代码
     *  @apiSuccess {String} error 错误信息
     *  @apiSuccess {Boolean} success 相应状态
     *  @apiSuccess {Object} data 主体信息
     */
    /**
     *  @apiDefine RecycleVo
     *  @apiSuccess (data){String} recyclerId 回收站ID
     *  @apiSuccess (data){Integer}  recyclerType 回收类型：0为动态，1为项目
     *  @apiSuccess (data){String}  dynamicId 动态ID
     *  @apiSuccess (data){Object}  dynamic 动态信息
     *  @apiSuccess (data){String} projectId 项目ID
     *  @apiSuccess (data){Object} project 项目信息
     *  @apiSuccess (data){String} operatorId 删除者ID
     *  @apiSuccess (data){Object} operator 删除者信息
     *  @apiSuccess (data){Long}  createTime 创建时间
     *  @apiSuccess (data){Long}  updateTime 更新时间
     */
    /**
     * @api {get} http://localhost:8080/base/api/recycle 获取回收站列表信息
     * @apiGroup RecycleVo
     * @apiParam {int} pageNum 页码
     * @apiParam {int} pageSize 每页数量
     * @apiParam {boolean} all 是否获取所有
     * @apiParam {String} condition 搜索的条件，例如回收类型
     * @apiParamExample {json} example
     * api/recycle?all=true&condition=0
     * @apiUse Result
     * @apiSuccessExample Success-Response:
     * {
     * "msg": "获取第1页基地回收站信息成功",
     * "code": 200,
     * "data": {
     * "pageNum": 1,
     * "pageSize": 5,
     * "size": 4,
     * "orderBy": null,
     * "startRow": 1,
     * "endRow": 4,
     * "total": 4,
     * "pages": 1,
     * "list": [
     * {
     * "recyclerId": "22e287a8-9c61-11e7-b1d2-e4f89cdc0d1f",
     * "recyclerType": 1,
     * "dynamicId": null,
     * "dynamic": null,
     * "projectId": null,
     * "project": {
     * "projectId": "85cb59b6-cb54-4148-a75d-05d74c67d1b2",
     * "projectName": "项目名",
     * "detail": "项目详情",
     * "creatorId": null,
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
     * "userLevel": 2
     * },
     * "projectType": 0,
     * "createTime": 1505732617,
     * "updateTime": null,
     * "deadLine": 1505652668,
     * "userVo": null,
     * "imageUrl": null,
     * "projectImageVo": {
     * "id": "07f022f8-9c61-11e7-b1d2-e4f89cdc0d1f",
     * "image1": "https://www.baidu.com/",
     * "image2": "https://www.baidu.com/",
     * "image3": "https://www.baidu.com/",
     * "image4": "https://www.baidu.com/",
     * "image5": "https://www.baidu.com/",
     * "image6": "https://www.baidu.com/",
     * "image7": "https://www.baidu.com/",
     * "image8": "",
     * "projectId": "85cb59b6-cb54-4148-a75d-05d74c67d1b2"
     * },
     * "delete": true,
     * "userIds": null,
     * "projectTeamVoList": [
     * {
     * "id": "08045610-9c61-11e7-b1d2-e4f89cdc0d1f",
     * "memberId": null,
     * "userVo": {
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
     * "projectId": "85cb59b6-cb54-4148-a75d-05d74c67d1b2",
     * "createTime": 1505732616
     * },
     * {
     * "id": "081328e1-9c61-11e7-b1d2-e4f89cdc0d1f",
     * "memberId": null,
     * "userVo": {
     * "userId": "cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f",
     * "memberName": "张三",
     * "password": "15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225",
     * "phoneNumber": "15820638000",
     * "department": "研发部",
     * "imageUrl": null,
     * "createTime": 1505553392,
     * "updateTime": 1505554379,
     * "delete": false,
     * "userLevel": 2
     * },
     * "projectId": "85cb59b6-cb54-4148-a75d-05d74c67d1b2",
     * "createTime": 1505732616
     * }
     * ]
     * },
     * "operatorId": null,
     * "operator": {
     * "userId": "cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f",
     * "memberName": "张三",
     * "password": "15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225",
     * "phoneNumber": "15820638000",
     * "department": "研发部",
     * "imageUrl": null,
     * "createTime": 1505553392,
     * "updateTime": 1505554379,
     * "delete": false,
     * "userLevel": 2
     * },
     * "createTime": 1505732661,
     * "updateTime": 0
     * },
     * {
     * "recyclerId": "2567c207-80aa-11e7-a658-e4f89cdc0d1f",
     * "recyclerType": 0,
     * "dynamicId": null,
     * "dynamic": {
     * "dynamicId": "6d003776-7d8b-11e7-983c-e4f89cdc0d1f",
     * "title": "我是标题",
     * "content": "我是内容",
     * "imageUrl": null,
     * "announcerId": null,
     * "createTime": 1502342339,
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
     * "delete": true
     * },
     * "projectId": null,
     * "project": null,
     * "operatorId": null,
     * "operator": {
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
     * "createTime": 1502685382,
     * "updateTime": 0
     * },
     * {
     * "recyclerId": "25759df7-80aa-11e7-a658-e4f89cdc0d1f",
     * "recyclerType": 0,
     * "dynamicId": null,
     * "dynamic": {
     * "dynamicId": "6fa242cf-7d8a-11e7-983c-e4f89cdc0d1f",
     * "title": "我是标题",
     * "content": "我是内容",
     * "imageUrl": null,
     * "announcerId": null,
     * "createTime": 1502341914,
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
     * "delete": true
     * },
     * "projectId": null,
     * "project": null,
     * "operatorId": null,
     * "operator": {
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
     * "createTime": 1502685382,
     * "updateTime": 0
     * },
     * {
     * "recyclerId": "257f2745-80aa-11e7-a658-e4f89cdc0d1f",
     * "recyclerType": 0,
     * "dynamicId": null,
     * "dynamic": {
     * "dynamicId": "76a6be82-7da6-11e7-983c-e4f89cdc0d1f",
     * "title": "我是标题",
     * "content": "我是内容",
     * "imageUrl": null,
     * "announcerId": null,
     * "createTime": 1502353951,
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
     * "delete": true
     * },
     * "projectId": null,
     * "project": null,
     * "operatorId": null,
     * "operator": {
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
     * "createTime": 1502685382,
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
    void listRecycle() {

    }
}
