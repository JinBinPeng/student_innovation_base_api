package com.yigong.student_innovation_base_api.doc;

/**
 * 用户接口文档代码
 * @author jinbin
 * @date 2017-09-16 16:48
 */
public class UserDoc {
    /**
     *  @apiDefine Result
     *  @apiSuccess {String} msg 响应结果
     *  @apiSuccess {Number} code 响应代码
     *  @apiSuccess {String} error 错误信息
     *  @apiSuccess {Boolean} success 相应状态
     *  @apiSuccess {Object} data 主体信息
     */
    /**
     *  @apiDefine User
     *  @apiSuccess (data){String} userId 用户ID
     *  @apiSuccess (data){String}  memberName 基地成员名
     *  @apiSuccess (data){String}  password 密码
     *  @apiSuccess (data){String}  phoneNumber 手机号码
     *  @apiSuccess (data){String}  department 部门
     *  @apiSuccess (data){String}  garde 成员年级
     *  @apiSuccess (data){String}  imageUrl 头像URL
     *  @apiSuccess (data){Long}  createTime 创建时间
     *  @apiSuccess (data){Long}  updateTime 更新时间
     *  @apiSuccess (data){Integer} delete 0表示未删除，1表示已删除
     *  @apiSuccess (data){Integer} userLevel 用户等级1表示普通成员，2表示管理员,3表示超级管理员
     */
    /**
     *  @apiDefine UserDTO
     *  @apiSuccess (data){String} userId 用户ID
     *  @apiSuccess (data){String}  password 密码
     *  @apiSuccess (data){String}  phoneNumber 手机号码
     *  @apiSuccess (data){String} smsCode 验证码
     */
    /**
     *  @apiDefine ExcelVo
     *  @apiSuccess (data){String} id ID
     *  @apiSuccess (data){String}  excelUrl Excel表的URL
     *  @apiSuccess (data){Long}  createTime 创建时间
     */
    /**
     * @api {post} http://localhost:8080/base/api/user app端用户注册
     * @apiGroup User
     * @apiParam {String} memberName 基地成员名
     * @apiParam {String} password 密码
     * @apiParam {String} phoneNumber 手机号码
     * @apiParam {String} department 部门
     * @apiParam {String} garde 成员年级
     * @apiSuccessExample Success-Request:
     * {
     * "memberName": "测试名",
     * "password": "123456",
     * "phoneNumber": "15820638010",
     * "department": "研发部",
     * "grade": "2017"
     * }
     * @apiUse Result
     * @apiSuccessExample Success-Response:
     * {
     * "msg": "添加成员成功",
     * "code": 200,
     * "data": {
     * "userId": "966e4290-b9f8-11e7-96d4-e4f89cdc0d1f",
     * "memberName": "测试名",
     * "password": "8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92",
     * "phoneNumber": "15820638010",
     * "department": "研发部",
     * "grade": "2017",
     * "imageUrl": null,
     * "createTime": 1508986281,
     * "updateTime": 0,
     * "delete": false,
     * "userLevel": 1
     * },
     * "success": true,
     * "error": null
     * }
     */
    void addUser() {

    }

    /**
     * @api {post} http://localhost:8080/base/api/user/excel web端导入用户Excel表
     * @apiGroup ExcelVo
     * @apiSuccessExample Success-Request:
     * {
     * "excelUrl":"http://oui5txymt.bkt.clouddn.com/infos/1509341558336测试2.xlsx"
     * }
     * @apiUse Result
     * @apiSuccessExample Success-Response:
     * {
     * "msg": "导入成功",
     * "code": 200,
     * "data": {
     * "id": "c4a98820-bb25-11e7-b018-e4f89cdc0d1f",
     * "excelUrl": "http://oui5txymt.bkt.clouddn.com/infos/1509341558336测试2.xlsx",
     * "createTime": 1509115650
     * },
     * "success": true,
     * "error": null
     * }
     */
    void importUserExcel() {

    }

    /**
     * @api {post} http://localhost:8080/base/api/login app端用户登录
     * @apiGroup User
     * @apiParam {String} memberName 基地成员名
     * @apiParam {String} phoneNumber 手机号码
     * @apiParam {String} password 密码
     * @apiSuccessExample Success-Request:
     * {
     * "memberName": "张三",
     * "password": "123456789"
     * }
     * @apiSuccessExample Success-Request:
     * {
     * "phoneNumber": "15820638000",
     * "password": "123456789"
     * }
     * @apiUse Result
     * @apiSuccessExample Success-Response:
     * {
     * "msg": "登录成功",
     * "code": 200,
     * "data": {
     * "user": {
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
     * "token": "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJhdWQiOiJjZDM1ZjgyZS05YWJmLTExZTctYmJjNC1lNGY4OWNkYzBkMWYifQ.ELX-2adW7zHhMfzpHfZe8kLSWL2fwEpkIlftYYl98A0"
     * },
     * "success": true,
     * "error": null
     * }
     * @apiSuccessExample Success-Response:
     * {
     * "msg": "登录失败,用户不存在",
     * "code": 400,
     * "data": null,
     * "success": false,
     * "error": null
     * }
     * @apiSuccessExample Success-Response:
     * {
     * "msg": "登录失败,密码错误",
     * "code": 400,
     * "data": null,
     * "success": false,
     * "error": null
     * }
     */
    void login() {

    }

    /**
     * @api {delete} http://localhost:8080/base/api/user/{userId} web端管理员删除用户信息
     * @apiGroup User
     * @apiParam {String} userId 用户ID
     * @apiSuccessExample Success-Request:
     * http://localhost:8080/base/api/user/b0b2a052-7d21-11e7-983c-e4f89cdc0d1f
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
    void deleteUser() {

    }

    /**
     * @api {put} http://localhost:8080/base/api/user app端用户修改信息(修改密码的话要再次登录获取token)
     * @apiGroup User
     * @apiParam {String} userId 用户ID
     * @apiParam {String} memberName 基地成员名
     * @apiParam {String} password 密码
     * @apiParam {String} phoneNumber 手机号码
     * @apiParam {String}  department 部门
     * @apiParam {String} garde 成员年级
     * @apiParam {String} imageUrl 头像URL
     * @apiSuccessExample Success-Request:
     * {
     * "userId": "cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f",
     * "password": "123456789"
     * }
     * @apiUse Result
     * @apiSuccessExample Success-Response:
     * {
     * "msg": "信息更新成功",
     * "code": 200,
     * "data": {
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
     * "success": true,
     * "error": null
     * }
     */
    void updateUser() {

    }

    /**
     * @api {put} http://localhost:8080/base/api/user/forgetPassword 用户忘记密码(修改密码的话要再次登录获取token)
     * @apiGroup UserDTO
     * @apiParam {String} userId 用户ID
     * @apiParam {String}  password 密码
     * @apiParam {String}  phoneNumber 手机号码
     * @apiParam {String} smsCode 验证码
     * @apiSuccessExample Success-Request:
     * {
     * "userId":"5a71afab-7a75-11e7-9ddf-e4f89cdc0d1f",
     * "phoneNumber":"15820638007",
     * "password":"1997",
     * "smsCode":"8830"
     * }
     * @apiUse Result
     * @apiSuccessExample Success-Response:
     * {
     * "msg": "验证成功,密码修改成功",
     * "code": 200,
     * "data": {
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
     * "success": true,
     * "error": null
     * }
     */
    void forgetPassword() {

    }

    /**
     * @api {put} http://localhost:8080/base/api/user/getMessage 根据用户名/手机号查询用户信息
     * @apiGroup User
     * @apiParam {String} memberName 基地成员名
     * @apiParam {String} phoneNumber 手机号码
     * @apiSuccessExample Success-Request:
     * {
     * "memberName":"锦斌"
     * }
     * @apiSuccessExample Success-Request:
     * {
     * "phoneNumber": "15820638007"
     * }
     * @apiUse Result
     * @apiSuccessExample Success-Response:
     * {
     * "msg": "查询信息成功",
     * "code": 200,
     * "data": {
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
     * "success": true,
     * "error": null
     * }
     */
    void findUserByCondition() {

    }

    /**
     * @api {get} http://localhost:8080/base/api/user web端管理员获取用户列表信息
     * @apiGroup User
     * @apiParam {int} pageNum 页码
     * @apiParam {int} pageSize 每页数量
     * @apiParam {boolean} all 是否获取所有
     * @apiParam {String} condition 搜索的条件，部门,年级,用户等级都可以
     * @apiParamExample {json} example
     * api/user?all=true&condition=研发部
     * @apiUse Result
     * @apiSuccessExample Success-Response:
     * {
     * "msg": "获取第1页基地成员信息成功",
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
     * {
     * "userId": "c62d3127-7a79-11e7-9ddf-e4f89cdc0d1f",
     * "memberName": "彭锦斌",
     * "password": "19c654f6061e534f830539f4010aa2e7f77082a0f0d63e3e7f3333e667a0ac4c",
     * "phoneNumber": "15820638006",
     * "department": "产品部",
     * "imageUrl": null,
     * "createTime": 1502006268,
     * "updateTime": 1502006268,
     * "delete": false,
     * "userLevel": 1
     * },
     * {
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
    void listUser() {

    }

    /**
     * @api {put} http://localhost:8080/base/api/user/updatePower 超级管理员分配权限
     * @apiGroup User
     * @apiParam {String} userId 用户ID
     * @apiParam {Integer} userLevel 用户等级1表示普通成员，2表示管理员
     * @apiSuccessExample Success-Request:
     * {
     * "userId":"c62d3127-7a79-11e7-9ddf-e4f89cdc0d1f",
     * "userLevel":2
     * }
     * @apiUse Result
     * @apiSuccessExample Success-Response:
     * {
     * "msg": "更新成员权限成功",
     * "code": 200,
     * "data": {
     * "userId": "c62d3127-7a79-11e7-9ddf-e4f89cdc0d1f",
     * "memberName": "彭锦斌",
     * "password": "19c654f6061e534f830539f4010aa2e7f77082a0f0d63e3e7f3333e667a0ac4c",
     * "phoneNumber": "15820638006",
     * "department": "产品部",
     * "imageUrl": null,
     * "createTime": 1502006268,
     * "updateTime": 1505740279,
     * "delete": false,
     * "userLevel": 2
     * },
     * "success": true,
     * "error": null
     * }
     */
    void updatePower() {

    }
}
