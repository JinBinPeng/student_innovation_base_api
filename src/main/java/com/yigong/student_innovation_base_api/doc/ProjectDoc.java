package com.yigong.student_innovation_base_api.doc;

/**
 * 项目接口文档代码
 * @author jinbin
 * @date 2017-09-16 16:50
 */
public class ProjectDoc {
    /**
     *  @apiDefine Result
     *  @apiSuccess {String} msg 响应结果
     *  @apiSuccess {Number} code 响应代码
     *  @apiSuccess {String} error 错误信息
     *  @apiSuccess {Boolean} success 相应状态
     *  @apiSuccess {Object} data 主体信息
     */
    /**
     * @apiDefine ProjectVo
     * @apiSuccess (data){String} projectId 项目ID
     * @apiSuccess (data){String}  projectName 项目名
     * @apiSuccess (data){String} detail 项目详情
     * @apiSuccess (data){String} creatorId 项目创建者ID
     * @apiSuccess (data){Object} announcer 项目创建者信息
     * @apiSuccess (data){Integer} projectType 项目类型：0为app，1为网站，2为科研类项目，3为其他
     * @apiSuccess (data){String} imageUrl 项目图片集合
     * @apiSuccess (data){Long}  createTime 创建时间
     * @apiSuccess (data){Long}  updateTime 更新时间
     * @apiSuccess (data){Long}  deadLine 完成时间
     * @apiSuccess (data){Integer} delete 0表示未删除，1表示已删除
     * @apiSuccess (data){String} userIds 项目参与人ID集合
     */
    /**
     * @apiDefine ProjectImageVo
     * @apiSuccess (data){String} id 项目对应的图片库ID
     * @apiSuccess (data){String} image 图片
     * @apiSuccess (data){String} projectId 项目ID
     */
    /**
     * @apiDefine ProjectTeamVo
     * @apiSuccess (data){String} id 项目队伍的ID
     * @apiSuccess (data){String} memberId 项目参与人ID
     * @apiSuccess (data){Object}  userVo 项目参与人信息
     * @apiSuccess (data){String} projectId 项目ID
     */
    /**
     * @api {post} http://localhost:8080/base/api/project 添加项目
     * @apiGroup ProjectVo
     * @apiParam {String}  projectName 项目名
     * @apiParam {String}  detail 项目详情
     * @apiParam {Integer}  projectType 项目类型：0为app，1为网站，2为科研类项目，3为其他
     * @apiParam {String}  userIds 项目参与人ID集合
     * @apiParam {Long}  deadLine 完成时间
     * @apiParam {String} imageUrl 项目图片集合
     * @apiUse ProjectImageVo
     * @apiUse ProjectTeamVo
     * @apiSuccessExample Success-Request:
     * {
     * "projectName":"项目名",
     * "detail":"项目详情",
     * "projectType":0,
     * "deadLine":1505652668,
     * "userIds":["5a71afab-7a75-11e7-9ddf-e4f89cdc0d1f","cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f"],
     * "imageUrl":["https://www.baidu.com/","https://www.baidu.com/","https://www.baidu.com/"
     * ,"https://www.baidu.com/","https://www.baidu.com/","https://www.baidu.com/"
     * ,"https://www.baidu.com/"]
     * }
     * @apiUse Result
     * @apiSuccessExample Success-Response:
     * {
     * "msg": "发布项目成功",
     * "code": 200,
     * "data": {
     * "projectId": "300dca3c-24fe-4e2b-85f0-56fd35e64ed1",
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
     * "userLevel": 3
     * },
     * "projectType": 0,
     * "createTime": 1505907240,
     * "updateTime": null,
     * "deadLine": 1505652668,
     * "userVo": null,
     * "imageUrl": null,
     * "projectImageVo": [
     * {
     * "id": "9821d574-9df7-11e7-80f8-e4f89cdc0d1f",
     * "image": "https://www.baidu.com/",
     * "projectId": "300dca3c-24fe-4e2b-85f0-56fd35e64ed1",
     * "createTime": 1505907239
     * },
     * {
     * "id": "9836924b-9df7-11e7-80f8-e4f89cdc0d1f",
     * "image": "https://www.baidu.com/",
     * "projectId": "300dca3c-24fe-4e2b-85f0-56fd35e64ed1",
     * "createTime": 1505907239
     * },
     * {
     * "id": "9846b881-9df7-11e7-80f8-e4f89cdc0d1f",
     * "image": "https://www.baidu.com/",
     * "projectId": "300dca3c-24fe-4e2b-85f0-56fd35e64ed1",
     * "createTime": 1505907239
     * },
     * {
     * "id": "9852f929-9df7-11e7-80f8-e4f89cdc0d1f",
     * "image": "https://www.baidu.com/",
     * "projectId": "300dca3c-24fe-4e2b-85f0-56fd35e64ed1",
     * "createTime": 1505907239
     * },
     * {
     * "id": "985b1cbd-9df7-11e7-80f8-e4f89cdc0d1f",
     * "image": "https://www.baidu.com/",
     * "projectId": "300dca3c-24fe-4e2b-85f0-56fd35e64ed1",
     * "createTime": 1505907239
     * },
     * {
     * "id": "98623835-9df7-11e7-80f8-e4f89cdc0d1f",
     * "image": "https://www.baidu.com/",
     * "projectId": "300dca3c-24fe-4e2b-85f0-56fd35e64ed1",
     * "createTime": 1505907239
     * },
     * {
     * "id": "986893bf-9df7-11e7-80f8-e4f89cdc0d1f",
     * "image": "https://www.baidu.com/",
     * "projectId": "300dca3c-24fe-4e2b-85f0-56fd35e64ed1",
     * "createTime": 1505907239
     * },
     * {
     * "id": "986fa33c-9df7-11e7-80f8-e4f89cdc0d1f",
     * "image": "https://www.baidu.com/",
     * "projectId": "300dca3c-24fe-4e2b-85f0-56fd35e64ed1",
     * "createTime": 1505907239
     * }
     * ],
     * "delete": false,
     * "userIds": null,
     * "projectTeamVoList": [
     * {
     * "id": "987a43d1-9df7-11e7-80f8-e4f89cdc0d1f",
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
     * "projectId": "300dca3c-24fe-4e2b-85f0-56fd35e64ed1",
     * "createTime": 1505907239
     * },
     * {
     * "id": "98939220-9df7-11e7-80f8-e4f89cdc0d1f",
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
     * "userLevel": 3
     * },
     * "projectId": "300dca3c-24fe-4e2b-85f0-56fd35e64ed1",
     * "createTime": 1505907240
     * }
     * ]
     * },
     * "success": true,
     * "error": null
     * }
     */
    void addProject() {

    }

    /**
     * @api {put} http://localhost:8080/base/api/project/batchDelete 删除1个或多个项目
     * @apiGroup ProjectVo
     * @apiParam {String} projectId 项目ID
     * @apiSuccessExample Success-Request:
     * {
     * "projectIds":[
     * "c2abd401-a55b-4897-9cb8-72654665ce02",
     * "3bcb89b3-469d-4cb6-82e2-43c2e7205828"]
     * }
     * @apiUse Result
     * @apiSuccessExample Success-Response:
     * {
     * "msg": "删除成功，,管理员可以在回收站查看",
     * "code": 200,
     * "data": null,
     * "success": true,
     * "error": null
     * }
     * @apiSuccessExample Success-Response:
     * {
     * "msg": "所要删除的项目不存在",
     * "code": 200,
     * "data": null,
     * "success": true,
     * "error": null
     * }
     */
    void batchDeleteProject() {

    }

    /**
     * @api {get} http://localhost:8080/base/api/project 获取项目列表信息
     * @apiGroup ProjectVo
     * @apiParam {int} pageNum 页码
     * @apiParam {int} pageSize 每页数量
     * @apiParam {boolean} all 是否获取所有
     * @apiParam {String} condition 搜索的条件，例如项目类型和项目名
     * @apiParamExample {json} example
     * api/project?all=true&condition=项目名
     * @apiUse Result
     * @apiUse ProjectImageVo
     * @apiUse ProjectTeamVo
     * @apiSuccessExample Success-Response:
     * {
     * "msg": "获取第1页基地项目信息成功",
     * "code": 200,
     * "data": {
     * "pageNum": 1,
     * "pageSize": 5,
     * "size": 5,
     * "orderBy": null,
     * "startRow": 1,
     * "endRow": 5,
     * "total": 6,
     * "pages": 2,
     * "list": [
     * {
     * "projectId": "300dca3c-24fe-4e2b-85f0-56fd35e64ed1",
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
     * "userLevel": 3
     * },
     * "projectType": 0,
     * "createTime": 1505907240,
     * "updateTime": null,
     * "deadLine": 1505652668,
     * "userVo": null,
     * "imageUrl": null,
     * "projectImageVo": [
     * {
     * "id": "9821d574-9df7-11e7-80f8-e4f89cdc0d1f",
     * "image": "https://www.baidu.com/",
     * "projectId": "300dca3c-24fe-4e2b-85f0-56fd35e64ed1",
     * "createTime": 1505907239
     * },
     * {
     * "id": "9836924b-9df7-11e7-80f8-e4f89cdc0d1f",
     * "image": "https://www.baidu.com/",
     * "projectId": "300dca3c-24fe-4e2b-85f0-56fd35e64ed1",
     * "createTime": 1505907239
     * },
     * {
     * "id": "9846b881-9df7-11e7-80f8-e4f89cdc0d1f",
     * "image": "https://www.baidu.com/",
     * "projectId": "300dca3c-24fe-4e2b-85f0-56fd35e64ed1",
     * "createTime": 1505907239
     * },
     * {
     * "id": "9852f929-9df7-11e7-80f8-e4f89cdc0d1f",
     * "image": "https://www.baidu.com/",
     * "projectId": "300dca3c-24fe-4e2b-85f0-56fd35e64ed1",
     * "createTime": 1505907239
     * },
     * {
     * "id": "985b1cbd-9df7-11e7-80f8-e4f89cdc0d1f",
     * "image": "https://www.baidu.com/",
     * "projectId": "300dca3c-24fe-4e2b-85f0-56fd35e64ed1",
     * "createTime": 1505907239
     * },
     * {
     * "id": "98623835-9df7-11e7-80f8-e4f89cdc0d1f",
     * "image": "https://www.baidu.com/",
     * "projectId": "300dca3c-24fe-4e2b-85f0-56fd35e64ed1",
     * "createTime": 1505907239
     * },
     * {
     * "id": "986893bf-9df7-11e7-80f8-e4f89cdc0d1f",
     * "image": "https://www.baidu.com/",
     * "projectId": "300dca3c-24fe-4e2b-85f0-56fd35e64ed1",
     * "createTime": 1505907239
     * },
     * {
     * "id": "986fa33c-9df7-11e7-80f8-e4f89cdc0d1f",
     * "image": "https://www.baidu.com/",
     * "projectId": "300dca3c-24fe-4e2b-85f0-56fd35e64ed1",
     * "createTime": 1505907239
     * }
     * ],
     * "delete": false,
     * "userIds": null,
     * "projectTeamVoList": [
     * {
     * "id": "987a43d1-9df7-11e7-80f8-e4f89cdc0d1f",
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
     * "projectId": "300dca3c-24fe-4e2b-85f0-56fd35e64ed1",
     * "createTime": 1505907239
     * },
     * {
     * "id": "98939220-9df7-11e7-80f8-e4f89cdc0d1f",
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
     * "userLevel": 3
     * },
     * "projectId": "300dca3c-24fe-4e2b-85f0-56fd35e64ed1",
     * "createTime": 1505907240
     * }
     * ]
     * },
     * {
     * "projectId": "e99114dd-da11-426a-82c8-ee8a62d7f8e7",
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
     * "userLevel": 3
     * },
     * "projectType": 0,
     * "createTime": 1505907148,
     * "updateTime": null,
     * "deadLine": 1505652668,
     * "userVo": null,
     * "imageUrl": null,
     * "projectImageVo": [
     * {
     * "id": "61ba3ac4-9df7-11e7-80f8-e4f89cdc0d1f",
     * "image": null,
     * "projectId": "e99114dd-da11-426a-82c8-ee8a62d7f8e7",
     * "createTime": 1505907148
     * }
     * ],
     * "delete": false,
     * "userIds": null,
     * "projectTeamVoList": [
     * {
     * "id": "61d2c92a-9df7-11e7-80f8-e4f89cdc0d1f",
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
     * "projectId": "e99114dd-da11-426a-82c8-ee8a62d7f8e7",
     * "createTime": 1505907148
     * },
     * {
     * "id": "61e2ac70-9df7-11e7-80f8-e4f89cdc0d1f",
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
     * "userLevel": 3
     * },
     * "projectId": "e99114dd-da11-426a-82c8-ee8a62d7f8e7",
     * "createTime": 1505907148
     * }
     * ]
     * },
     * {
     * "projectId": "9a95c235-f89e-400d-8e1b-2320ae1a7c75",
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
     * "userLevel": 3
     * },
     * "projectType": 0,
     * "createTime": 1505907132,
     * "updateTime": null,
     * "deadLine": 1505652668,
     * "userVo": null,
     * "imageUrl": null,
     * "projectImageVo": [
     * {
     * "id": "583c1c85-9df7-11e7-80f8-e4f89cdc0d1f",
     * "image": "https://www.baidu.com/",
     * "projectId": "9a95c235-f89e-400d-8e1b-2320ae1a7c75",
     * "createTime": 1505907132
     * },
     * {
     * "id": "584acd2c-9df7-11e7-80f8-e4f89cdc0d1f",
     * "image": "https://www.baidu.com/",
     * "projectId": "9a95c235-f89e-400d-8e1b-2320ae1a7c75",
     * "createTime": 1505907132
     * },
     * {
     * "id": "58556e0d-9df7-11e7-80f8-e4f89cdc0d1f",
     * "image": "https://www.baidu.com/",
     * "projectId": "9a95c235-f89e-400d-8e1b-2320ae1a7c75",
     * "createTime": 1505907132
     * },
     * {
     * "id": "585eaa5c-9df7-11e7-80f8-e4f89cdc0d1f",
     * "image": "https://www.baidu.com/",
     * "projectId": "9a95c235-f89e-400d-8e1b-2320ae1a7c75",
     * "createTime": 1505907132
     * },
     * {
     * "id": "586c4433-9df7-11e7-80f8-e4f89cdc0d1f",
     * "image": "https://www.baidu.com/",
     * "projectId": "9a95c235-f89e-400d-8e1b-2320ae1a7c75",
     * "createTime": 1505907132
     * },
     * {
     * "id": "5875c931-9df7-11e7-80f8-e4f89cdc0d1f",
     * "image": "https://www.baidu.com/",
     * "projectId": "9a95c235-f89e-400d-8e1b-2320ae1a7c75",
     * "createTime": 1505907132
     * },
     * {
     * "id": "587f8b76-9df7-11e7-80f8-e4f89cdc0d1f",
     * "image": "https://www.baidu.com/",
     * "projectId": "9a95c235-f89e-400d-8e1b-2320ae1a7c75",
     * "createTime": 1505907132
     * },
     * {
     * "id": "588edaf5-9df7-11e7-80f8-e4f89cdc0d1f",
     * "image": "https://www.baidu.com/",
     * "projectId": "9a95c235-f89e-400d-8e1b-2320ae1a7c75",
     * "createTime": 1505907132
     * }
     * ],
     * "delete": false,
     * "userIds": null,
     * "projectTeamVoList": [
     * {
     * "id": "5896c62c-9df7-11e7-80f8-e4f89cdc0d1f",
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
     * "projectId": "9a95c235-f89e-400d-8e1b-2320ae1a7c75",
     * "createTime": 1505907132
     * },
     * {
     * "id": "58a26c1b-9df7-11e7-80f8-e4f89cdc0d1f",
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
     * "userLevel": 3
     * },
     * "projectId": "9a95c235-f89e-400d-8e1b-2320ae1a7c75",
     * "createTime": 1505907132
     * }
     * ]
     * },
     * {
     * "projectId": "2abf1d90-4312-4eee-a86f-84d08582dbe1",
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
     * "userLevel": 3
     * },
     * "projectType": 0,
     * "createTime": 1505907074,
     * "updateTime": null,
     * "deadLine": 1505652668,
     * "userVo": null,
     * "imageUrl": null,
     * "projectImageVo": [
     * {
     * "id": "35398ad5-9df7-11e7-80f8-e4f89cdc0d1f",
     * "image": "https://www.baidu.com/",
     * "projectId": "2abf1d90-4312-4eee-a86f-84d08582dbe1",
     * "createTime": null
     * },
     * {
     * "id": "35574377-9df7-11e7-80f8-e4f89cdc0d1f",
     * "image": "https://www.baidu.com/",
     * "projectId": "2abf1d90-4312-4eee-a86f-84d08582dbe1",
     * "createTime": null
     * },
     * {
     * "id": "3560e481-9df7-11e7-80f8-e4f89cdc0d1f",
     * "image": "https://www.baidu.com/",
     * "projectId": "2abf1d90-4312-4eee-a86f-84d08582dbe1",
     * "createTime": null
     * },
     * {
     * "id": "356c1742-9df7-11e7-80f8-e4f89cdc0d1f",
     * "image": "https://www.baidu.com/",
     * "projectId": "2abf1d90-4312-4eee-a86f-84d08582dbe1",
     * "createTime": null
     * },
     * {
     * "id": "35754c37-9df7-11e7-80f8-e4f89cdc0d1f",
     * "image": "https://www.baidu.com/",
     * "projectId": "2abf1d90-4312-4eee-a86f-84d08582dbe1",
     * "createTime": null
     * },
     * {
     * "id": "357d8884-9df7-11e7-80f8-e4f89cdc0d1f",
     * "image": "https://www.baidu.com/",
     * "projectId": "2abf1d90-4312-4eee-a86f-84d08582dbe1",
     * "createTime": null
     * },
     * {
     * "id": "3584590f-9df7-11e7-80f8-e4f89cdc0d1f",
     * "image": "https://www.baidu.com/",
     * "projectId": "2abf1d90-4312-4eee-a86f-84d08582dbe1",
     * "createTime": null
     * },
     * {
     * "id": "358b7a71-9df7-11e7-80f8-e4f89cdc0d1f",
     * "image": "https://www.baidu.com/",
     * "projectId": "2abf1d90-4312-4eee-a86f-84d08582dbe1",
     * "createTime": null
     * }
     * ],
     * "delete": false,
     * "userIds": null,
     * "projectTeamVoList": [
     * {
     * "id": "3591ec80-9df7-11e7-80f8-e4f89cdc0d1f",
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
     * "projectId": "2abf1d90-4312-4eee-a86f-84d08582dbe1",
     * "createTime": 1505907073
     * },
     * {
     * "id": "35971f0e-9df7-11e7-80f8-e4f89cdc0d1f",
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
     * "userLevel": 3
     * },
     * "projectId": "2abf1d90-4312-4eee-a86f-84d08582dbe1",
     * "createTime": 1505907073
     * }
     * ]
     * },
     * {
     * "projectId": "82a739b8-58f2-4d99-86e4-7289b9cfff10",
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
     * "userLevel": 3
     * },
     * "projectType": 0,
     * "createTime": 1505907034,
     * "updateTime": null,
     * "deadLine": 1505652668,
     * "userVo": null,
     * "imageUrl": null,
     * "projectImageVo": [
     * {
     * "id": "1daac96b-9df7-11e7-80f8-e4f89cdc0d1f",
     * "image": "https://www.baidu.com/",
     * "projectId": "82a739b8-58f2-4d99-86e4-7289b9cfff10",
     * "createTime": null
     * },
     * {
     * "id": "1dbf7eec-9df7-11e7-80f8-e4f89cdc0d1f",
     * "image": "https://www.baidu.com/",
     * "projectId": "82a739b8-58f2-4d99-86e4-7289b9cfff10",
     * "createTime": null
     * },
     * {
     * "id": "1dc4bc63-9df7-11e7-80f8-e4f89cdc0d1f",
     * "image": "https://www.baidu.com/",
     * "projectId": "82a739b8-58f2-4d99-86e4-7289b9cfff10",
     * "createTime": null
     * },
     * {
     * "id": "1dcb54d6-9df7-11e7-80f8-e4f89cdc0d1f",
     * "image": "https://www.baidu.com/",
     * "projectId": "82a739b8-58f2-4d99-86e4-7289b9cfff10",
     * "createTime": null
     * },
     * {
     * "id": "1dd09b27-9df7-11e7-80f8-e4f89cdc0d1f",
     * "image": "https://www.baidu.com/",
     * "projectId": "82a739b8-58f2-4d99-86e4-7289b9cfff10",
     * "createTime": null
     * },
     * {
     * "id": "1ddbbbea-9df7-11e7-80f8-e4f89cdc0d1f",
     * "image": "https://www.baidu.com/",
     * "projectId": "82a739b8-58f2-4d99-86e4-7289b9cfff10",
     * "createTime": null
     * },
     * {
     * "id": "1de4f8db-9df7-11e7-80f8-e4f89cdc0d1f",
     * "image": "https://www.baidu.com/",
     * "projectId": "82a739b8-58f2-4d99-86e4-7289b9cfff10",
     * "createTime": null
     * },
     * {
     * "id": "1defc09c-9df7-11e7-80f8-e4f89cdc0d1f",
     * "image": "https://www.baidu.com/",
     * "projectId": "82a739b8-58f2-4d99-86e4-7289b9cfff10",
     * "createTime": null
     * }
     * ],
     * "delete": false,
     * "userIds": null,
     * "projectTeamVoList": [
     * {
     * "id": "1e171401-9df7-11e7-80f8-e4f89cdc0d1f",
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
     * "projectId": "82a739b8-58f2-4d99-86e4-7289b9cfff10",
     * "createTime": 1505907034
     * },
     * {
     * "id": "1e2400c2-9df7-11e7-80f8-e4f89cdc0d1f",
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
     * "userLevel": 3
     * },
     * "projectId": "82a739b8-58f2-4d99-86e4-7289b9cfff10",
     * "createTime": 1505907034
     * }
     * ]
     * }
     * ],
     * "firstPage": 1,
     * "prePage": 0,
     * "nextPage": 2,
     * "lastPage": 2,
     * "isFirstPage": true,
     * "isLastPage": false,
     * "hasPreviousPage": false,
     * "hasNextPage": true,
     * "navigatePages": 8,
     * "navigatepageNums": [
     * 1,
     * 2
     * ]
     * },
     * "success": true,
     * "error": null
     * }
     */
    void listProject() {

    }
}
