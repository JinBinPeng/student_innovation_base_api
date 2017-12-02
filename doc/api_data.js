define({ "api": [
  {
    "type": "delete",
    "url": "http://localhost:8080/base/api/attend/{attendId}",
    "title": "删除值班安排",
    "group": "Attend",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "attendId",
            "description": "<p>值班ID</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{\n\"msg\": \"删除成功\",\n\"code\": 200,\n\"data\": null,\n\"success\": true,\n\"error\": null\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "msg",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "Number",
            "optional": false,
            "field": "code",
            "description": "<p>响应代码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "error",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Boolean",
            "optional": false,
            "field": "success",
            "description": "<p>相应状态</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "src/main/java/com/yigong/student_innovation_base_api/doc/AttendDoc.java",
    "groupTitle": "",
    "name": "DeleteHttpLocalhost8080BaseApiAttendAttendid"
  },
  {
    "type": "get",
    "url": "http://localhost:8080/base/api/attend",
    "title": "获取值班列表信息",
    "group": "Attend",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "pageNum",
            "description": "<p>页码</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "pageSize",
            "description": "<p>每页数量</p>"
          },
          {
            "group": "Parameter",
            "type": "boolean",
            "optional": false,
            "field": "all",
            "description": "<p>是否获取所有</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "condition",
            "description": "<p>搜索的条件，例如签到时间和值班时间</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "example",
          "content": "api/attend?all=true&condition=2017-09-16",
          "type": "json"
        }
      ]
    },
    "success": {
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{\n\"msg\": \"获取第1页基地值班信息成功\",\n\"code\": 200,\n\"data\": {\n\"pageNum\": 1,\n\"pageSize\": 5,\n\"size\": 2,\n\"orderBy\": null,\n\"startRow\": 1,\n\"endRow\": 2,\n\"total\": 2,\n\"pages\": 1,\n\"list\": [\n{\n\"attendId\": \"831a7e36-bf7a-11e7-af40-e4f89cdc0d1f\",\n\"checkTime\": \"2017/11/2 10:44:30\",\n\"attendTime\": \"星期四\",\n\"createTime\": 1509591823,\n\"updateTime\": 1509591823,\n\"creatorId\": null,\n\"announcer\": {\n\"userId\": \"cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f\",\n\"memberName\": \"张三\",\n\"password\": \"15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225\",\n\"phoneNumber\": \"15820638000\",\n\"department\": \"研发部\",\n\"grade\": \"0\",\n\"imageUrl\": null,\n\"createTime\": 1505553392,\n\"updateTime\": 1505554379,\n\"delete\": false,\n\"userLevel\": 3\n},\n\"attendMemberId\": null,\n\"userVo\": {\n\"userId\": \"5a71afab-7a75-11e7-9ddf-e4f89cdc0d1f\",\n\"memberName\": \"锦斌\",\n\"password\": \"8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92\",\n\"phoneNumber\": \"15820638007\",\n\"department\": \"研发部\",\n\"grade\": \"0\",\n\"imageUrl\": null,\n\"createTime\": 1502003010,\n\"updateTime\": 1502009829,\n\"delete\": false,\n\"userLevel\": 2\n},\n\"editorId\": null,\n\"editor\": null\n},\n{\n\"attendId\": \"834e317f-bf7a-11e7-af40-e4f89cdc0d1f\",\n\"checkTime\": \"2017/11/2 10:44:30\",\n\"attendTime\": \"星期四\",\n\"createTime\": 1509591823,\n\"updateTime\": 1509591823,\n\"creatorId\": null,\n\"announcer\": {\n\"userId\": \"cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f\",\n\"memberName\": \"张三\",\n\"password\": \"15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225\",\n\"phoneNumber\": \"15820638000\",\n\"department\": \"研发部\",\n\"grade\": \"0\",\n\"imageUrl\": null,\n\"createTime\": 1505553392,\n\"updateTime\": 1505554379,\n\"delete\": false,\n\"userLevel\": 3\n},\n\"attendMemberId\": null,\n\"userVo\": {\n\"userId\": \"ccab4897-bb25-11e7-b018-e4f89cdc0d1f\",\n\"memberName\": \"测试2\",\n\"password\": \"8c6976e5b5410415bde908bd4dee15dfb167a9c873fc4bb8a81f6f2ab448a918\",\n\"phoneNumber\": \"15820600002\",\n\"department\": \"研发部\",\n\"grade\": \"2015\",\n\"imageUrl\": null,\n\"createTime\": 1509115663,\n\"updateTime\": 0,\n\"delete\": false,\n\"userLevel\": 1\n},\n\"editorId\": null,\n\"editor\": null\n}\n],\n\"firstPage\": 1,\n\"prePage\": 0,\n\"nextPage\": 0,\n\"lastPage\": 1,\n\"isFirstPage\": true,\n\"isLastPage\": true,\n\"hasPreviousPage\": false,\n\"hasNextPage\": false,\n\"navigatePages\": 8,\n\"navigatepageNums\": [\n1\n]\n},\n\"success\": true,\n\"error\": null\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "msg",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "Number",
            "optional": false,
            "field": "code",
            "description": "<p>响应代码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "error",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Boolean",
            "optional": false,
            "field": "success",
            "description": "<p>相应状态</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "src/main/java/com/yigong/student_innovation_base_api/doc/AttendDoc.java",
    "groupTitle": "",
    "name": "GetHttpLocalhost8080BaseApiAttend"
  },
  {
    "type": "post",
    "url": "http://localhost:8080/base/api/attend",
    "title": "添加值班信息",
    "group": "Attend",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "checkTime",
            "description": "<p>签到时间</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "attendTime",
            "description": "<p>值班时间</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "creatorId",
            "description": "<p>值班创建者ID</p>"
          },
          {
            "group": "Parameter",
            "type": "Object",
            "optional": false,
            "field": "announcer",
            "description": "<p>创建者信息</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n\"attendMemberIds\": [\n\"5a71afab-7a75-11e7-9ddf-e4f89cdc0d1f\",\n\"ccab4897-bb25-11e7-b018-e4f89cdc0d1f\"\n],\n\"attendTime\": \"星期四\",\n\"checkTime\": \"2017/11/2 10:44:30\"\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n\"msg\": \"发布值班安排成功\",\n\"code\": 200,\n\"data\": [\n{\n\"attendId\": \"831a7e36-bf7a-11e7-af40-e4f89cdc0d1f\",\n\"checkTime\": \"2017/11/2 10:44:30\",\n\"attendTime\": \"星期四\",\n\"createTime\": 1509591823,\n\"updateTime\": 1509591823,\n\"creatorId\": null,\n\"announcer\": {\n\"userId\": \"cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f\",\n\"memberName\": \"张三\",\n\"password\": \"15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225\",\n\"phoneNumber\": \"15820638000\",\n\"department\": \"研发部\",\n\"grade\": \"0\",\n\"imageUrl\": null,\n\"createTime\": 1505553392,\n\"updateTime\": 1505554379,\n\"delete\": false,\n\"userLevel\": 3\n},\n\"attendMemberId\": null,\n\"userVo\": {\n\"userId\": \"5a71afab-7a75-11e7-9ddf-e4f89cdc0d1f\",\n\"memberName\": \"锦斌\",\n\"password\": \"8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92\",\n\"phoneNumber\": \"15820638007\",\n\"department\": \"研发部\",\n\"grade\": \"0\",\n\"imageUrl\": null,\n\"createTime\": 1502003010,\n\"updateTime\": 1502009829,\n\"delete\": false,\n\"userLevel\": 2\n},\n\"editorId\": null,\n\"editor\": null\n},\n{\n\"attendId\": \"834e317f-bf7a-11e7-af40-e4f89cdc0d1f\",\n\"checkTime\": \"2017/11/2 10:44:30\",\n\"attendTime\": \"星期四\",\n\"createTime\": 1509591823,\n\"updateTime\": 1509591823,\n\"creatorId\": null,\n\"announcer\": {\n\"userId\": \"cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f\",\n\"memberName\": \"张三\",\n\"password\": \"15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225\",\n\"phoneNumber\": \"15820638000\",\n\"department\": \"研发部\",\n\"grade\": \"0\",\n\"imageUrl\": null,\n\"createTime\": 1505553392,\n\"updateTime\": 1505554379,\n\"delete\": false,\n\"userLevel\": 3\n},\n\"attendMemberId\": null,\n\"userVo\": {\n\"userId\": \"ccab4897-bb25-11e7-b018-e4f89cdc0d1f\",\n\"memberName\": \"测试2\",\n\"password\": \"8c6976e5b5410415bde908bd4dee15dfb167a9c873fc4bb8a81f6f2ab448a918\",\n\"phoneNumber\": \"15820600002\",\n\"department\": \"研发部\",\n\"grade\": \"2015\",\n\"imageUrl\": null,\n\"createTime\": 1509115663,\n\"updateTime\": 0,\n\"delete\": false,\n\"userLevel\": 1\n},\n\"editorId\": null,\n\"editor\": null\n}\n],\n\"success\": true,\n\"error\": null\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "msg",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "Number",
            "optional": false,
            "field": "code",
            "description": "<p>响应代码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "error",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Boolean",
            "optional": false,
            "field": "success",
            "description": "<p>相应状态</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "src/main/java/com/yigong/student_innovation_base_api/doc/AttendDoc.java",
    "groupTitle": "",
    "name": "PostHttpLocalhost8080BaseApiAttend"
  },
  {
    "type": "put",
    "url": "http://localhost:8080/base/api/attend",
    "title": "修改值班安排",
    "group": "Attend",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "attendId",
            "description": "<p>值班ID</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "attendMemberId",
            "description": "<p>值班人员ID</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "checkTime",
            "description": "<p>签到时间</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "attendTime",
            "description": "<p>值班时间</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "creatorId",
            "description": "<p>值班创建者ID</p>"
          },
          {
            "group": "Parameter",
            "type": "Object",
            "optional": false,
            "field": "announcer",
            "description": "<p>创建者信息</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "editorId",
            "description": "<p>值班修改者ID</p>"
          },
          {
            "group": "Parameter",
            "type": "Object",
            "optional": false,
            "field": "editor",
            "description": "<p>值班修改者信息</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n\"attendId\": \"2b1a7776-bf78-11e7-af40-e4f89cdc0d1f\",\n\"attendMemberId\": \"5a71afab-7a75-11e7-9ddf-e4f89cdc0d1f\",\n\"attendTime\": \"星期五\",\n\"checkTime\": \"2017/11/2 10:44:30\"\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n\"msg\": \"更新值班安排成功\",\n\"code\": 200,\n\"data\": {\n\"attendId\": \"2b1a7776-bf78-11e7-af40-e4f89cdc0d1f\",\n\"checkTime\": \"2017/11/2 10:44:30\",\n\"attendTime\": \"星期五\",\n\"createTime\": 1509590816,\n\"updateTime\": 1509591493,\n\"creatorId\": null,\n\"announcer\": {\n\"userId\": \"cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f\",\n\"memberName\": \"张三\",\n\"password\": \"15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225\",\n\"phoneNumber\": \"15820638000\",\n\"department\": \"研发部\",\n\"grade\": \"0\",\n\"imageUrl\": null,\n\"createTime\": 1505553392,\n\"updateTime\": 1505554379,\n\"delete\": false,\n\"userLevel\": 3\n},\n\"attendMemberId\": null,\n\"userVo\": {\n\"userId\": \"5a71afab-7a75-11e7-9ddf-e4f89cdc0d1f\",\n\"memberName\": \"锦斌\",\n\"password\": \"8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92\",\n\"phoneNumber\": \"15820638007\",\n\"department\": \"研发部\",\n\"grade\": \"0\",\n\"imageUrl\": null,\n\"createTime\": 1502003010,\n\"updateTime\": 1502009829,\n\"delete\": false,\n\"userLevel\": 2\n},\n\"editorId\": null,\n\"editor\": {\n\"userId\": \"cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f\",\n\"memberName\": \"张三\",\n\"password\": \"15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225\",\n\"phoneNumber\": \"15820638000\",\n\"department\": \"研发部\",\n\"grade\": \"0\",\n\"imageUrl\": null,\n\"createTime\": 1505553392,\n\"updateTime\": 1505554379,\n\"delete\": false,\n\"userLevel\": 3\n}\n},\n\"success\": true,\n\"error\": null\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "msg",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "Number",
            "optional": false,
            "field": "code",
            "description": "<p>响应代码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "error",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Boolean",
            "optional": false,
            "field": "success",
            "description": "<p>相应状态</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "src/main/java/com/yigong/student_innovation_base_api/doc/AttendDoc.java",
    "groupTitle": "",
    "name": "PutHttpLocalhost8080BaseApiAttend"
  },
  {
    "type": "get",
    "url": "http://localhost:8080/base/api/check",
    "title": "获取签到列表",
    "group": "CheckVo",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "pageNum",
            "description": "<p>页码</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "pageSize",
            "description": "<p>每页数量</p>"
          },
          {
            "group": "Parameter",
            "type": "boolean",
            "optional": false,
            "field": "all",
            "description": "<p>是否获取所有</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "condition",
            "description": "<p>搜索的条件，例如签到人</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "example",
          "content": "api/check?all=true&condition=张三",
          "type": "json"
        }
      ]
    },
    "success": {
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{\n\"msg\": \"根据搜索条件获取签到信息成功\",\n\"code\": 200,\n\"data\": [\n{\n\"id\": \"40883217-c155-11e7-a4d7-e4f89cdc0d1f\",\n\"userId\": null,\n\"userVo\": {\n\"userId\": \"cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f\",\n\"memberName\": \"张三\",\n\"password\": \"15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225\",\n\"phoneNumber\": \"15820638000\",\n\"department\": \"研发部\",\n\"grade\": \"0\",\n\"imageUrl\": null,\n\"createTime\": 1509628932,\n\"updateTime\": 1505554379,\n\"delete\": false,\n\"userLevel\": 3\n},\n\"attendId\": null,\n\"attendVo\": {\n\"attendId\": \"831a7e36-bf7a-11e7-af40-e4f89cdc0d1f\",\n\"checkTime\": \"2017/11/2 10:44:30\",\n\"attendTime\": \"星期四\",\n\"createTime\": 1509591823,\n\"updateTime\": 1509591823,\n\"creatorId\": null,\n\"announcer\": {\n\"userId\": \"cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f\",\n\"memberName\": \"张三\",\n\"password\": \"15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225\",\n\"phoneNumber\": \"15820638000\",\n\"department\": \"研发部\",\n\"grade\": \"0\",\n\"imageUrl\": null,\n\"createTime\": 1509628932,\n\"updateTime\": 1505554379,\n\"delete\": false,\n\"userLevel\": 3\n},\n\"attendMemberId\": null,\n\"userVo\": {\n\"userId\": \"5a71afab-7a75-11e7-9ddf-e4f89cdc0d1f\",\n\"memberName\": \"锦斌\",\n\"password\": \"0985b889a1fe4f4e1fb925061ac6fb2247f10875f5fcbe63eec2ab55ed68970e\",\n\"phoneNumber\": \"15820638007\",\n\"department\": \"研发部\",\n\"grade\": \"0\",\n\"imageUrl\": null,\n\"createTime\": 1509628932,\n\"updateTime\": 1509630082,\n\"delete\": false,\n\"userLevel\": 2\n},\n\"editorId\": null,\n\"editor\": null\n},\n\"checkMemberName\": \"张三\",\n\"checkTime\": 1509795755,\n\"checkIp\": \"123.12.12.1\"\n},\n{\n\"id\": \"ba48c8a7-c152-11e7-af40-e4f89cdc0d1f\",\n\"userId\": null,\n\"userVo\": {\n\"userId\": \"cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f\",\n\"memberName\": \"张三\",\n\"password\": \"15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225\",\n\"phoneNumber\": \"15820638000\",\n\"department\": \"研发部\",\n\"grade\": \"0\",\n\"imageUrl\": null,\n\"createTime\": 1509628932,\n\"updateTime\": 1505554379,\n\"delete\": false,\n\"userLevel\": 3\n},\n\"attendId\": null,\n\"attendVo\": {\n\"attendId\": \"831a7e36-bf7a-11e7-af40-e4f89cdc0d1f\",\n\"checkTime\": \"2017/11/2 10:44:30\",\n\"attendTime\": \"星期四\",\n\"createTime\": 1509591823,\n\"updateTime\": 1509591823,\n\"creatorId\": null,\n\"announcer\": {\n\"userId\": \"cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f\",\n\"memberName\": \"张三\",\n\"password\": \"15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225\",\n\"phoneNumber\": \"15820638000\",\n\"department\": \"研发部\",\n\"grade\": \"0\",\n\"imageUrl\": null,\n\"createTime\": 1509628932,\n\"updateTime\": 1505554379,\n\"delete\": false,\n\"userLevel\": 3\n},\n\"attendMemberId\": null,\n\"userVo\": {\n\"userId\": \"5a71afab-7a75-11e7-9ddf-e4f89cdc0d1f\",\n\"memberName\": \"锦斌\",\n\"password\": \"0985b889a1fe4f4e1fb925061ac6fb2247f10875f5fcbe63eec2ab55ed68970e\",\n\"phoneNumber\": \"15820638007\",\n\"department\": \"研发部\",\n\"grade\": \"0\",\n\"imageUrl\": null,\n\"createTime\": 1509628932,\n\"updateTime\": 1509630082,\n\"delete\": false,\n\"userLevel\": 2\n},\n\"editorId\": null,\n\"editor\": null\n},\n\"checkMemberName\": \"张三\",\n\"checkTime\": 1509794620,\n\"checkIp\": \"123.12.12.1\"\n}\n],\n\"success\": true,\n\"error\": null\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "msg",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "Number",
            "optional": false,
            "field": "code",
            "description": "<p>响应代码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "error",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Boolean",
            "optional": false,
            "field": "success",
            "description": "<p>相应状态</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "src/main/java/com/yigong/student_innovation_base_api/doc/CheckDoc.java",
    "groupTitle": "",
    "name": "GetHttpLocalhost8080BaseApiCheck"
  },
  {
    "type": "get",
    "url": "http://localhost:8080/base/api/check/getCheck/{id}",
    "title": "根据id查询签到信息",
    "group": "CheckVo",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "id",
            "description": "<p>签到ID</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "http://localhost:8080/base/api/check/getCheck/ba48c8a7-c152-11e7-af40-e4f89cdc0d1f",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n\"msg\": \"查询签到信息成功\",\n\"code\": 200,\n\"data\": {\n\"id\": \"ba48c8a7-c152-11e7-af40-e4f89cdc0d1f\",\n\"userId\": null,\n\"userVo\": {\n\"userId\": \"cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f\",\n\"memberName\": \"张三\",\n\"password\": \"8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92\",\n\"phoneNumber\": \"15820638000\",\n\"department\": \"研发部\",\n\"grade\": \"0\",\n\"imageUrl\": null,\n\"createTime\": 1509628932,\n\"updateTime\": 1509805648,\n\"delete\": false,\n\"userLevel\": 3\n},\n\"attendId\": null,\n\"attendVo\": {\n\"attendId\": \"831a7e36-bf7a-11e7-af40-e4f89cdc0d1f\",\n\"checkTime\": \"2017/11/2 10:44:30\",\n\"attendTime\": \"星期四\",\n\"createTime\": 1509591823,\n\"updateTime\": 1509591823,\n\"creatorId\": null,\n\"announcer\": {\n\"userId\": \"cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f\",\n\"memberName\": \"张三\",\n\"password\": \"8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92\",\n\"phoneNumber\": \"15820638000\",\n\"department\": \"研发部\",\n\"grade\": \"0\",\n\"imageUrl\": null,\n\"createTime\": 1509628932,\n\"updateTime\": 1509805648,\n\"delete\": false,\n\"userLevel\": 3\n},\n\"attendMemberId\": null,\n\"userVo\": {\n\"userId\": \"5a71afab-7a75-11e7-9ddf-e4f89cdc0d1f\",\n\"memberName\": \"锦斌\",\n\"password\": \"0985b889a1fe4f4e1fb925061ac6fb2247f10875f5fcbe63eec2ab55ed68970e\",\n\"phoneNumber\": \"15820638007\",\n\"department\": \"研发部\",\n\"grade\": \"0\",\n\"imageUrl\": null,\n\"createTime\": 1509628932,\n\"updateTime\": 1509630082,\n\"delete\": false,\n\"userLevel\": 2\n},\n\"editorId\": null,\n\"editor\": null\n},\n\"checkMemberName\": \"张三\",\n\"checkTime\": 1509794620,\n\"checkIp\": \"123.12.12.1\"\n},\n\"success\": true,\n\"error\": null\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "msg",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "Number",
            "optional": false,
            "field": "code",
            "description": "<p>响应代码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "error",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Boolean",
            "optional": false,
            "field": "success",
            "description": "<p>相应状态</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "src/main/java/com/yigong/student_innovation_base_api/doc/CheckDoc.java",
    "groupTitle": "",
    "name": "GetHttpLocalhost8080BaseApiCheckGetcheckId"
  },
  {
    "type": "post",
    "url": "http://localhost:8080/base/api/check",
    "title": "添加签到信息",
    "group": "CheckVo",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "checkIp",
            "description": "<p>签到Ip</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "attendId",
            "description": "<p>值班Id</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n\"checkIp\":\"123.12.12.1\",\n\"attendId\":\"831a7e36-bf7a-11e7-af40-e4f89cdc0d1f\"\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n\"msg\": \"签到成功\",\n\"code\": 200,\n\"data\": {\n\"id\": \"40883217-c155-11e7-a4d7-e4f89cdc0d1f\",\n\"userId\": null,\n\"userVo\": {\n\"userId\": \"cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f\",\n\"memberName\": \"张三\",\n\"password\": \"15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225\",\n\"phoneNumber\": \"15820638000\",\n\"department\": \"研发部\",\n\"grade\": \"0\",\n\"imageUrl\": null,\n\"createTime\": 1509628932,\n\"updateTime\": 1505554379,\n\"delete\": false,\n\"userLevel\": 3\n},\n\"attendId\": null,\n\"attendVo\": {\n\"attendId\": \"831a7e36-bf7a-11e7-af40-e4f89cdc0d1f\",\n\"checkTime\": \"2017/11/2 10:44:30\",\n\"attendTime\": \"星期四\",\n\"createTime\": 1509591823,\n\"updateTime\": 1509591823,\n\"creatorId\": null,\n\"announcer\": {\n\"userId\": \"cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f\",\n\"memberName\": \"张三\",\n\"password\": \"15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225\",\n\"phoneNumber\": \"15820638000\",\n\"department\": \"研发部\",\n\"grade\": \"0\",\n\"imageUrl\": null,\n\"createTime\": 1509628932,\n\"updateTime\": 1505554379,\n\"delete\": false,\n\"userLevel\": 3\n},\n\"attendMemberId\": null,\n\"userVo\": {\n\"userId\": \"5a71afab-7a75-11e7-9ddf-e4f89cdc0d1f\",\n\"memberName\": \"锦斌\",\n\"password\": \"0985b889a1fe4f4e1fb925061ac6fb2247f10875f5fcbe63eec2ab55ed68970e\",\n\"phoneNumber\": \"15820638007\",\n\"department\": \"研发部\",\n\"grade\": \"0\",\n\"imageUrl\": null,\n\"createTime\": 1509628932,\n\"updateTime\": 1509630082,\n\"delete\": false,\n\"userLevel\": 2\n},\n\"editorId\": null,\n\"editor\": null\n},\n\"checkMemberName\": \"张三\",\n\"checkTime\": 1509795755,\n\"checkIp\": \"123.12.12.1\"\n},\n\"success\": true,\n\"error\": null\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "msg",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "Number",
            "optional": false,
            "field": "code",
            "description": "<p>响应代码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "error",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Boolean",
            "optional": false,
            "field": "success",
            "description": "<p>相应状态</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "src/main/java/com/yigong/student_innovation_base_api/doc/CheckDoc.java",
    "groupTitle": "",
    "name": "PostHttpLocalhost8080BaseApiCheck"
  },
  {
    "type": "put",
    "url": "http://localhost:8080/base/api/check/getCheck",
    "title": "根据签到人的名字查询签到信息",
    "group": "CheckVo",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "checkMemberName",
            "description": "<p>签到人</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n\"checkMemberName\": \"张三\"\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n\"msg\": \"查询签到信息成功\",\n\"code\": 200,\n\"data\": [\n{\n\"id\": \"40883217-c155-11e7-a4d7-e4f89cdc0d1f\",\n\"userId\": null,\n\"userVo\": {\n\"userId\": \"cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f\",\n\"memberName\": \"张三\",\n\"password\": \"15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225\",\n\"phoneNumber\": \"15820638000\",\n\"department\": \"研发部\",\n\"grade\": \"0\",\n\"imageUrl\": null,\n\"createTime\": 1509628932,\n\"updateTime\": 1505554379,\n\"delete\": false,\n\"userLevel\": 3\n},\n\"attendId\": null,\n\"attendVo\": {\n\"attendId\": \"831a7e36-bf7a-11e7-af40-e4f89cdc0d1f\",\n\"checkTime\": \"2017/11/2 10:44:30\",\n\"attendTime\": \"星期四\",\n\"createTime\": 1509591823,\n\"updateTime\": 1509591823,\n\"creatorId\": null,\n\"announcer\": {\n\"userId\": \"cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f\",\n\"memberName\": \"张三\",\n\"password\": \"15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225\",\n\"phoneNumber\": \"15820638000\",\n\"department\": \"研发部\",\n\"grade\": \"0\",\n\"imageUrl\": null,\n\"createTime\": 1509628932,\n\"updateTime\": 1505554379,\n\"delete\": false,\n\"userLevel\": 3\n},\n\"attendMemberId\": null,\n\"userVo\": {\n\"userId\": \"5a71afab-7a75-11e7-9ddf-e4f89cdc0d1f\",\n\"memberName\": \"锦斌\",\n\"password\": \"0985b889a1fe4f4e1fb925061ac6fb2247f10875f5fcbe63eec2ab55ed68970e\",\n\"phoneNumber\": \"15820638007\",\n\"department\": \"研发部\",\n\"grade\": \"0\",\n\"imageUrl\": null,\n\"createTime\": 1509628932,\n\"updateTime\": 1509630082,\n\"delete\": false,\n\"userLevel\": 2\n},\n\"editorId\": null,\n\"editor\": null\n},\n\"checkMemberName\": \"张三\",\n\"checkTime\": 1509795755,\n\"checkIp\": \"123.12.12.1\"\n},\n{\n\"id\": \"ba48c8a7-c152-11e7-af40-e4f89cdc0d1f\",\n\"userId\": null,\n\"userVo\": {\n\"userId\": \"cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f\",\n\"memberName\": \"张三\",\n\"password\": \"15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225\",\n\"phoneNumber\": \"15820638000\",\n\"department\": \"研发部\",\n\"grade\": \"0\",\n\"imageUrl\": null,\n\"createTime\": 1509628932,\n\"updateTime\": 1505554379,\n\"delete\": false,\n\"userLevel\": 3\n},\n\"attendId\": null,\n\"attendVo\": {\n\"attendId\": \"831a7e36-bf7a-11e7-af40-e4f89cdc0d1f\",\n\"checkTime\": \"2017/11/2 10:44:30\",\n\"attendTime\": \"星期四\",\n\"createTime\": 1509591823,\n\"updateTime\": 1509591823,\n\"creatorId\": null,\n\"announcer\": {\n\"userId\": \"cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f\",\n\"memberName\": \"张三\",\n\"password\": \"15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225\",\n\"phoneNumber\": \"15820638000\",\n\"department\": \"研发部\",\n\"grade\": \"0\",\n\"imageUrl\": null,\n\"createTime\": 1509628932,\n\"updateTime\": 1505554379,\n\"delete\": false,\n\"userLevel\": 3\n},\n\"attendMemberId\": null,\n\"userVo\": {\n\"userId\": \"5a71afab-7a75-11e7-9ddf-e4f89cdc0d1f\",\n\"memberName\": \"锦斌\",\n\"password\": \"0985b889a1fe4f4e1fb925061ac6fb2247f10875f5fcbe63eec2ab55ed68970e\",\n\"phoneNumber\": \"15820638007\",\n\"department\": \"研发部\",\n\"grade\": \"0\",\n\"imageUrl\": null,\n\"createTime\": 1509628932,\n\"updateTime\": 1509630082,\n\"delete\": false,\n\"userLevel\": 2\n},\n\"editorId\": null,\n\"editor\": null\n},\n\"checkMemberName\": \"张三\",\n\"checkTime\": 1509794620,\n\"checkIp\": \"123.12.12.1\"\n}\n],\n\"success\": true,\n\"error\": null\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "msg",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "Number",
            "optional": false,
            "field": "code",
            "description": "<p>响应代码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "error",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Boolean",
            "optional": false,
            "field": "success",
            "description": "<p>相应状态</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "src/main/java/com/yigong/student_innovation_base_api/doc/CheckDoc.java",
    "groupTitle": "",
    "name": "PutHttpLocalhost8080BaseApiCheckGetcheck"
  },
  {
    "type": "get",
    "url": "http://localhost:8080/base/api/dynamic",
    "title": "获取动态列表",
    "group": "Dynamic",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "pageNum",
            "description": "<p>页码</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "pageSize",
            "description": "<p>每页数量</p>"
          },
          {
            "group": "Parameter",
            "type": "boolean",
            "optional": false,
            "field": "all",
            "description": "<p>是否获取所有</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "condition",
            "description": "<p>搜索的条件，例如标题</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "example",
          "content": "api/dynamic?all=true&condition=标题",
          "type": "json"
        }
      ]
    },
    "success": {
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{\n\"msg\": \"根据搜索条件获取基地动态信息成功\",\n\"code\": 200,\n\"data\": [\n{\n\"dynamicId\": \"ef0eb76c-9ad7-11e7-bbc4-e4f89cdc0d1f\",\n\"title\": \"我是标题\",\n\"content\": \"我是内容\",\n\"imageUrl\": null,\n\"announcerId\": null,\n\"createTime\": 2017,\n\"updateTime\": 0,\n\"announcer\": {\n\"userId\": \"cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f\",\n\"memberName\": \"张三\",\n\"password\": \"15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225\",\n\"phoneNumber\": \"15820638000\",\n\"department\": \"研发部\",\n\"imageUrl\": null,\n\"createTime\": 1505553392,\n\"updateTime\": 1505554379,\n\"delete\": false,\n\"userLevel\": 1\n},\n\"delete\": false\n},\n{\n\"dynamicId\": \"10f2eb71-80a4-11e7-a658-e4f89cdc0d1f\",\n\"title\": \"我是标题\",\n\"content\": \"我是内容\",\n\"imageUrl\": null,\n\"announcerId\": null,\n\"createTime\": 2017,\n\"updateTime\": 0,\n\"announcer\": {\n\"userId\": \"5a71afab-7a75-11e7-9ddf-e4f89cdc0d1f\",\n\"memberName\": \"锦斌\",\n\"password\": \"8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92\",\n\"phoneNumber\": \"15820638007\",\n\"department\": \"研发部\",\n\"imageUrl\": null,\n\"createTime\": 1502003010,\n\"updateTime\": 1502009829,\n\"delete\": false,\n\"userLevel\": 2\n},\n\"delete\": false\n},\n{\n\"dynamicId\": \"10696e88-80a4-11e7-a658-e4f89cdc0d1f\",\n\"title\": \"我是标题\",\n\"content\": \"我是内容\",\n\"imageUrl\": null,\n\"announcerId\": null,\n\"createTime\": 2017,\n\"updateTime\": 0,\n\"announcer\": {\n\"userId\": \"5a71afab-7a75-11e7-9ddf-e4f89cdc0d1f\",\n\"memberName\": \"锦斌\",\n\"password\": \"8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92\",\n\"phoneNumber\": \"15820638007\",\n\"department\": \"研发部\",\n\"imageUrl\": null,\n\"createTime\": 1502003010,\n\"updateTime\": 1502009829,\n\"delete\": false,\n\"userLevel\": 2\n},\n\"delete\": false\n},\n{\n\"dynamicId\": \"0e96a6bc-80a4-11e7-a658-e4f89cdc0d1f\",\n\"title\": \"我是标题\",\n\"content\": \"我是内容\",\n\"imageUrl\": null,\n\"announcerId\": null,\n\"createTime\": 2017,\n\"updateTime\": 0,\n\"announcer\": {\n\"userId\": \"5a71afab-7a75-11e7-9ddf-e4f89cdc0d1f\",\n\"memberName\": \"锦斌\",\n\"password\": \"8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92\",\n\"phoneNumber\": \"15820638007\",\n\"department\": \"研发部\",\n\"imageUrl\": null,\n\"createTime\": 1502003010,\n\"updateTime\": 1502009829,\n\"delete\": false,\n\"userLevel\": 2\n},\n\"delete\": false\n}\n],\n\"success\": true,\n\"error\": null\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "msg",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "Number",
            "optional": false,
            "field": "code",
            "description": "<p>响应代码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "error",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Boolean",
            "optional": false,
            "field": "success",
            "description": "<p>相应状态</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "src/main/java/com/yigong/student_innovation_base_api/doc/DynamicDoc.java",
    "groupTitle": "",
    "name": "GetHttpLocalhost8080BaseApiDynamic"
  },
  {
    "type": "post",
    "url": "http://localhost:8080/base/api/dynamic",
    "title": "动态发布",
    "group": "Dynamic",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "title",
            "description": "<p>动态标题</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "content",
            "description": "<p>动态内容</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "imageUrl",
            "description": "<p>图片URL</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n\"title\":\"我是标题\",\n\"content\":\"我是内容\"\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n\"msg\": \"发布动态成功\",\n\"code\": 200,\n\"data\": {\n\"dynamicId\": \"ef0eb76c-9ad7-11e7-bbc4-e4f89cdc0d1f\",\n\"title\": \"我是标题\",\n\"content\": \"我是内容\",\n\"imageUrl\": null,\n\"announcerId\": null,\n\"createTime\": 2017,\n\"updateTime\": 0,\n\"announcer\": {\n\"userId\": \"cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f\",\n\"memberName\": \"张三\",\n\"password\": \"15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225\",\n\"phoneNumber\": \"15820638000\",\n\"department\": \"研发部\",\n\"imageUrl\": null,\n\"createTime\": 1505553392,\n\"updateTime\": 1505554379,\n\"delete\": false,\n\"userLevel\": 1\n},\n\"delete\": false\n},\n\"success\": true,\n\"error\": null\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "msg",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "Number",
            "optional": false,
            "field": "code",
            "description": "<p>响应代码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "error",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Boolean",
            "optional": false,
            "field": "success",
            "description": "<p>相应状态</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "src/main/java/com/yigong/student_innovation_base_api/doc/DynamicDoc.java",
    "groupTitle": "",
    "name": "PostHttpLocalhost8080BaseApiDynamic"
  },
  {
    "type": "put",
    "url": "http://localhost:8080/base/api/dynamic/batchDelete",
    "title": "删除单个或多个动态信息",
    "group": "Dynamic",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "dynamicId",
            "description": "<p>动态ID</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n\"dynamicIds\":[\n\"d74f4d41-7eab-11e7-983c-e4f89cdc0d1f\",\n\"78e86813-7da6-11e7-983c-e4f89cdc0d1f\",\n\"784b53e3-7da6-11e7-983c-e4f89cdc0d1f\"\n]\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n\"msg\": \"删除成功\",\n\"code\": 200,\n\"data\": null,\n\"success\": true,\n\"error\": null\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "msg",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "Number",
            "optional": false,
            "field": "code",
            "description": "<p>响应代码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "error",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Boolean",
            "optional": false,
            "field": "success",
            "description": "<p>相应状态</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "src/main/java/com/yigong/student_innovation_base_api/doc/DynamicDoc.java",
    "groupTitle": "",
    "name": "PutHttpLocalhost8080BaseApiDynamicBatchdelete"
  },
  {
    "type": "post",
    "url": "http://localhost:8080/base/api/user/excel",
    "title": "web端导入用户Excel表",
    "group": "ExcelVo",
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n\"excelUrl\":\"http://oui5txymt.bkt.clouddn.com/infos/1509341558336测试2.xlsx\"\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n\"msg\": \"导入成功\",\n\"code\": 200,\n\"data\": {\n\"id\": \"c4a98820-bb25-11e7-b018-e4f89cdc0d1f\",\n\"excelUrl\": \"http://oui5txymt.bkt.clouddn.com/infos/1509341558336测试2.xlsx\",\n\"createTime\": 1509115650\n},\n\"success\": true,\n\"error\": null\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "msg",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "Number",
            "optional": false,
            "field": "code",
            "description": "<p>响应代码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "error",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Boolean",
            "optional": false,
            "field": "success",
            "description": "<p>相应状态</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "src/main/java/com/yigong/student_innovation_base_api/doc/UserDoc.java",
    "groupTitle": "",
    "name": "PostHttpLocalhost8080BaseApiUserExcel"
  },
  {
    "type": "delete",
    "url": "http://localhost:8080/base/api/notice/{noticeId}",
    "title": "删除消息通知",
    "group": "Notice",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "noticeId",
            "description": "<p>消息ID</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{\n\"msg\": \"删除成功\",\n\"code\": 200,\n\"data\": null,\n\"success\": true,\n\"error\": null\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "msg",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "Number",
            "optional": false,
            "field": "code",
            "description": "<p>响应代码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "error",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Boolean",
            "optional": false,
            "field": "success",
            "description": "<p>相应状态</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "src/main/java/com/yigong/student_innovation_base_api/doc/NoticeDoc.java",
    "groupTitle": "",
    "name": "DeleteHttpLocalhost8080BaseApiNoticeNoticeid"
  },
  {
    "type": "get",
    "url": "http://localhost:8080/base/api/notice",
    "title": "获取消息通知列表",
    "group": "Notice",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "pageNum",
            "description": "<p>页码</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "pageSize",
            "description": "<p>每页数量</p>"
          },
          {
            "group": "Parameter",
            "type": "boolean",
            "optional": false,
            "field": "all",
            "description": "<p>是否获取所有</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "condition",
            "description": "<p>搜索的条件，例如标题和摘要</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "example",
          "content": "api/notice?all=true&condition=标题",
          "type": "json"
        }
      ]
    },
    "success": {
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{\n\"msg\": \"获取第1页消息通知信息成功\",\n\"code\": 200,\n\"data\": {\n\"pageNum\": 1,\n\"pageSize\": 5,\n\"size\": 3,\n\"orderBy\": null,\n\"startRow\": 1,\n\"endRow\": 3,\n\"total\": 3,\n\"pages\": 1,\n\"list\": [\n{\n\"noticeId\": \"70bfc003-9add-11e7-bbc4-e4f89cdc0d1f\",\n\"senderId\": null,\n\"sender\": {\n\"userId\": \"cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f\",\n\"memberName\": \"张三\",\n\"password\": \"15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225\",\n\"phoneNumber\": \"15820638000\",\n\"department\": \"研发部\",\n\"imageUrl\": null,\n\"createTime\": 1505553392,\n\"updateTime\": 1505554379,\n\"delete\": false,\n\"userLevel\": 1\n},\n\"receiverId\": null,\n\"receiver\": {\n\"userId\": \"5a71afab-7a75-11e7-9ddf-e4f89cdc0d1f\",\n\"memberName\": \"锦斌\",\n\"password\": \"8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92\",\n\"phoneNumber\": \"15820638007\",\n\"department\": \"研发部\",\n\"imageUrl\": null,\n\"createTime\": 1502003010,\n\"updateTime\": 1502009829,\n\"delete\": false,\n\"userLevel\": 2\n},\n\"title\": \"我是标题\",\n\"summary\": \"我是消息摘要\",\n\"read\": null,\n\"createTime\": 1505566122,\n\"updateTime\": 0\n},\n{\n\"noticeId\": \"7045759a-9add-11e7-bbc4-e4f89cdc0d1f\",\n\"senderId\": null,\n\"sender\": {\n\"userId\": \"cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f\",\n\"memberName\": \"张三\",\n\"password\": \"15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225\",\n\"phoneNumber\": \"15820638000\",\n\"department\": \"研发部\",\n\"imageUrl\": null,\n\"createTime\": 1505553392,\n\"updateTime\": 1505554379,\n\"delete\": false,\n\"userLevel\": 1\n},\n\"receiverId\": null,\n\"receiver\": {\n\"userId\": \"5a71afab-7a75-11e7-9ddf-e4f89cdc0d1f\",\n\"memberName\": \"锦斌\",\n\"password\": \"8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92\",\n\"phoneNumber\": \"15820638007\",\n\"department\": \"研发部\",\n\"imageUrl\": null,\n\"createTime\": 1502003010,\n\"updateTime\": 1502009829,\n\"delete\": false,\n\"userLevel\": 2\n},\n\"title\": \"我是标题\",\n\"summary\": \"我是消息摘要\",\n\"read\": null,\n\"createTime\": 1505566121,\n\"updateTime\": 0\n},\n{\n\"noticeId\": \"6c92cade-9add-11e7-bbc4-e4f89cdc0d1f\",\n\"senderId\": null,\n\"sender\": {\n\"userId\": \"cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f\",\n\"memberName\": \"张三\",\n\"password\": \"15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225\",\n\"phoneNumber\": \"15820638000\",\n\"department\": \"研发部\",\n\"imageUrl\": null,\n\"createTime\": 1505553392,\n\"updateTime\": 1505554379,\n\"delete\": false,\n\"userLevel\": 1\n},\n\"receiverId\": null,\n\"receiver\": {\n\"userId\": \"5a71afab-7a75-11e7-9ddf-e4f89cdc0d1f\",\n\"memberName\": \"锦斌\",\n\"password\": \"8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92\",\n\"phoneNumber\": \"15820638007\",\n\"department\": \"研发部\",\n\"imageUrl\": null,\n\"createTime\": 1502003010,\n\"updateTime\": 1502009829,\n\"delete\": false,\n\"userLevel\": 2\n},\n\"title\": \"我是标题\",\n\"summary\": \"我是消息摘要\",\n\"read\": null,\n\"createTime\": 1505566115,\n\"updateTime\": 0\n}\n],\n\"firstPage\": 1,\n\"prePage\": 0,\n\"nextPage\": 0,\n\"lastPage\": 1,\n\"isFirstPage\": true,\n\"isLastPage\": true,\n\"hasPreviousPage\": false,\n\"hasNextPage\": false,\n\"navigatePages\": 8,\n\"navigatepageNums\": [\n1\n]\n},\n\"success\": true,\n\"error\": null\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "msg",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "Number",
            "optional": false,
            "field": "code",
            "description": "<p>响应代码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "error",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Boolean",
            "optional": false,
            "field": "success",
            "description": "<p>相应状态</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "src/main/java/com/yigong/student_innovation_base_api/doc/NoticeDoc.java",
    "groupTitle": "",
    "name": "GetHttpLocalhost8080BaseApiNotice"
  },
  {
    "type": "post",
    "url": "http://localhost:8080/base/api/notice",
    "title": "添加消息发送",
    "group": "Notice",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "senderId",
            "description": "<p>发送者ID</p>"
          },
          {
            "group": "Parameter",
            "type": "Object",
            "optional": false,
            "field": "sender",
            "description": "<p>发送者信息</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "receiverId",
            "description": "<p>接受者ID</p>"
          },
          {
            "group": "Parameter",
            "type": "Object",
            "optional": false,
            "field": "receiver",
            "description": "<p>接受者信息</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "title",
            "description": "<p>消息标题</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "summary",
            "description": "<p>消息摘要</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n\"title\":\"我是标题\",\n\"summary\":\"我是消息摘要\",\n\"receiverId\":\"5a71afab-7a75-11e7-9ddf-e4f89cdc0d1f\"\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n\"msg\": \"发布消息通知成功\",\n\"code\": 200,\n\"data\": {\n\"noticeId\": \"e32dd3aa-9adc-11e7-bbc4-e4f89cdc0d1f\",\n\"senderId\": null,\n\"sender\": {\n\"userId\": \"cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f\",\n\"memberName\": \"张三\",\n\"password\": \"15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225\",\n\"phoneNumber\": \"15820638000\",\n\"department\": \"研发部\",\n\"imageUrl\": null,\n\"createTime\": 1505553392,\n\"updateTime\": 1505554379,\n\"delete\": false,\n\"userLevel\": 1\n},\n\"receiverId\": null,\n\"receiver\": {\n\"userId\": \"5a71afab-7a75-11e7-9ddf-e4f89cdc0d1f\",\n\"memberName\": \"锦斌\",\n\"password\": \"8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92\",\n\"phoneNumber\": \"15820638007\",\n\"department\": \"研发部\",\n\"imageUrl\": null,\n\"createTime\": 1502003010,\n\"updateTime\": 1502009829,\n\"delete\": false,\n\"userLevel\": 2\n},\n\"title\": \"我是标题\",\n\"summary\": \"我是消息摘要\",\n\"read\": null,\n\"createTime\": 1505565885,\n\"updateTime\": 0\n},\n\"success\": true,\n\"error\": null\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "msg",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "Number",
            "optional": false,
            "field": "code",
            "description": "<p>响应代码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "error",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Boolean",
            "optional": false,
            "field": "success",
            "description": "<p>相应状态</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "src/main/java/com/yigong/student_innovation_base_api/doc/NoticeDoc.java",
    "groupTitle": "",
    "name": "PostHttpLocalhost8080BaseApiNotice"
  },
  {
    "type": "put",
    "url": "http://localhost:8080/base/api/notice/{noticeId}",
    "title": "消息从未读到已读",
    "group": "Notice",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "noticeId",
            "description": "<p>消息ID</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{\n\"msg\": \"消息通知已读\",\n\"code\": 200,\n\"data\": {\n\"noticeId\": \"70bfc003-9add-11e7-bbc4-e4f89cdc0d1f\",\n\"senderId\": null,\n\"sender\": {\n\"userId\": \"cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f\",\n\"memberName\": \"张三\",\n\"password\": \"15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225\",\n\"phoneNumber\": \"15820638000\",\n\"department\": \"研发部\",\n\"imageUrl\": null,\n\"createTime\": 1505553392,\n\"updateTime\": 1505554379,\n\"delete\": false,\n\"userLevel\": 1\n},\n\"receiverId\": null,\n\"receiver\": {\n\"userId\": \"5a71afab-7a75-11e7-9ddf-e4f89cdc0d1f\",\n\"memberName\": \"锦斌\",\n\"password\": \"8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92\",\n\"phoneNumber\": \"15820638007\",\n\"department\": \"研发部\",\n\"imageUrl\": null,\n\"createTime\": 1502003010,\n\"updateTime\": 1502009829,\n\"delete\": false,\n\"userLevel\": 2\n},\n\"title\": \"我是标题\",\n\"summary\": \"我是消息摘要\",\n\"read\": null,\n\"createTime\": 1505566122,\n\"updateTime\": 0\n},\n\"success\": true,\n\"error\": null\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "msg",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "Number",
            "optional": false,
            "field": "code",
            "description": "<p>响应代码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "error",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Boolean",
            "optional": false,
            "field": "success",
            "description": "<p>相应状态</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "src/main/java/com/yigong/student_innovation_base_api/doc/NoticeDoc.java",
    "groupTitle": "",
    "name": "PutHttpLocalhost8080BaseApiNoticeNoticeid"
  },
  {
    "type": "get",
    "url": "http://localhost:8080/base/api/project",
    "title": "获取项目列表信息",
    "group": "ProjectVo",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "pageNum",
            "description": "<p>页码</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "pageSize",
            "description": "<p>每页数量</p>"
          },
          {
            "group": "Parameter",
            "type": "boolean",
            "optional": false,
            "field": "all",
            "description": "<p>是否获取所有</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "condition",
            "description": "<p>搜索的条件，例如项目类型和项目名</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "example",
          "content": "api/project?all=true&condition=项目名",
          "type": "json"
        }
      ]
    },
    "success": {
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{\n\"msg\": \"获取第1页基地项目信息成功\",\n\"code\": 200,\n\"data\": {\n\"pageNum\": 1,\n\"pageSize\": 5,\n\"size\": 5,\n\"orderBy\": null,\n\"startRow\": 1,\n\"endRow\": 5,\n\"total\": 6,\n\"pages\": 2,\n\"list\": [\n{\n\"projectId\": \"300dca3c-24fe-4e2b-85f0-56fd35e64ed1\",\n\"projectName\": \"项目名\",\n\"detail\": \"项目详情\",\n\"creatorId\": null,\n\"announcer\": {\n\"userId\": \"cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f\",\n\"memberName\": \"张三\",\n\"password\": \"15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225\",\n\"phoneNumber\": \"15820638000\",\n\"department\": \"研发部\",\n\"imageUrl\": null,\n\"createTime\": 1505553392,\n\"updateTime\": 1505554379,\n\"delete\": false,\n\"userLevel\": 3\n},\n\"projectType\": 0,\n\"createTime\": 1505907240,\n\"updateTime\": null,\n\"deadLine\": 1505652668,\n\"userVo\": null,\n\"imageUrl\": null,\n\"projectImageVo\": [\n{\n\"id\": \"9821d574-9df7-11e7-80f8-e4f89cdc0d1f\",\n\"image\": \"https://www.baidu.com/\",\n\"projectId\": \"300dca3c-24fe-4e2b-85f0-56fd35e64ed1\",\n\"createTime\": 1505907239\n},\n{\n\"id\": \"9836924b-9df7-11e7-80f8-e4f89cdc0d1f\",\n\"image\": \"https://www.baidu.com/\",\n\"projectId\": \"300dca3c-24fe-4e2b-85f0-56fd35e64ed1\",\n\"createTime\": 1505907239\n},\n{\n\"id\": \"9846b881-9df7-11e7-80f8-e4f89cdc0d1f\",\n\"image\": \"https://www.baidu.com/\",\n\"projectId\": \"300dca3c-24fe-4e2b-85f0-56fd35e64ed1\",\n\"createTime\": 1505907239\n},\n{\n\"id\": \"9852f929-9df7-11e7-80f8-e4f89cdc0d1f\",\n\"image\": \"https://www.baidu.com/\",\n\"projectId\": \"300dca3c-24fe-4e2b-85f0-56fd35e64ed1\",\n\"createTime\": 1505907239\n},\n{\n\"id\": \"985b1cbd-9df7-11e7-80f8-e4f89cdc0d1f\",\n\"image\": \"https://www.baidu.com/\",\n\"projectId\": \"300dca3c-24fe-4e2b-85f0-56fd35e64ed1\",\n\"createTime\": 1505907239\n},\n{\n\"id\": \"98623835-9df7-11e7-80f8-e4f89cdc0d1f\",\n\"image\": \"https://www.baidu.com/\",\n\"projectId\": \"300dca3c-24fe-4e2b-85f0-56fd35e64ed1\",\n\"createTime\": 1505907239\n},\n{\n\"id\": \"986893bf-9df7-11e7-80f8-e4f89cdc0d1f\",\n\"image\": \"https://www.baidu.com/\",\n\"projectId\": \"300dca3c-24fe-4e2b-85f0-56fd35e64ed1\",\n\"createTime\": 1505907239\n},\n{\n\"id\": \"986fa33c-9df7-11e7-80f8-e4f89cdc0d1f\",\n\"image\": \"https://www.baidu.com/\",\n\"projectId\": \"300dca3c-24fe-4e2b-85f0-56fd35e64ed1\",\n\"createTime\": 1505907239\n}\n],\n\"delete\": false,\n\"userIds\": null,\n\"projectTeamVoList\": [\n{\n\"id\": \"987a43d1-9df7-11e7-80f8-e4f89cdc0d1f\",\n\"memberId\": null,\n\"userVo\": {\n\"userId\": \"5a71afab-7a75-11e7-9ddf-e4f89cdc0d1f\",\n\"memberName\": \"锦斌\",\n\"password\": \"8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92\",\n\"phoneNumber\": \"15820638007\",\n\"department\": \"研发部\",\n\"imageUrl\": null,\n\"createTime\": 1502003010,\n\"updateTime\": 1502009829,\n\"delete\": false,\n\"userLevel\": 2\n},\n\"projectId\": \"300dca3c-24fe-4e2b-85f0-56fd35e64ed1\",\n\"createTime\": 1505907239\n},\n{\n\"id\": \"98939220-9df7-11e7-80f8-e4f89cdc0d1f\",\n\"memberId\": null,\n\"userVo\": {\n\"userId\": \"cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f\",\n\"memberName\": \"张三\",\n\"password\": \"15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225\",\n\"phoneNumber\": \"15820638000\",\n\"department\": \"研发部\",\n\"imageUrl\": null,\n\"createTime\": 1505553392,\n\"updateTime\": 1505554379,\n\"delete\": false,\n\"userLevel\": 3\n},\n\"projectId\": \"300dca3c-24fe-4e2b-85f0-56fd35e64ed1\",\n\"createTime\": 1505907240\n}\n]\n},\n{\n\"projectId\": \"e99114dd-da11-426a-82c8-ee8a62d7f8e7\",\n\"projectName\": \"项目名\",\n\"detail\": \"项目详情\",\n\"creatorId\": null,\n\"announcer\": {\n\"userId\": \"cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f\",\n\"memberName\": \"张三\",\n\"password\": \"15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225\",\n\"phoneNumber\": \"15820638000\",\n\"department\": \"研发部\",\n\"imageUrl\": null,\n\"createTime\": 1505553392,\n\"updateTime\": 1505554379,\n\"delete\": false,\n\"userLevel\": 3\n},\n\"projectType\": 0,\n\"createTime\": 1505907148,\n\"updateTime\": null,\n\"deadLine\": 1505652668,\n\"userVo\": null,\n\"imageUrl\": null,\n\"projectImageVo\": [\n{\n\"id\": \"61ba3ac4-9df7-11e7-80f8-e4f89cdc0d1f\",\n\"image\": null,\n\"projectId\": \"e99114dd-da11-426a-82c8-ee8a62d7f8e7\",\n\"createTime\": 1505907148\n}\n],\n\"delete\": false,\n\"userIds\": null,\n\"projectTeamVoList\": [\n{\n\"id\": \"61d2c92a-9df7-11e7-80f8-e4f89cdc0d1f\",\n\"memberId\": null,\n\"userVo\": {\n\"userId\": \"5a71afab-7a75-11e7-9ddf-e4f89cdc0d1f\",\n\"memberName\": \"锦斌\",\n\"password\": \"8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92\",\n\"phoneNumber\": \"15820638007\",\n\"department\": \"研发部\",\n\"imageUrl\": null,\n\"createTime\": 1502003010,\n\"updateTime\": 1502009829,\n\"delete\": false,\n\"userLevel\": 2\n},\n\"projectId\": \"e99114dd-da11-426a-82c8-ee8a62d7f8e7\",\n\"createTime\": 1505907148\n},\n{\n\"id\": \"61e2ac70-9df7-11e7-80f8-e4f89cdc0d1f\",\n\"memberId\": null,\n\"userVo\": {\n\"userId\": \"cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f\",\n\"memberName\": \"张三\",\n\"password\": \"15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225\",\n\"phoneNumber\": \"15820638000\",\n\"department\": \"研发部\",\n\"imageUrl\": null,\n\"createTime\": 1505553392,\n\"updateTime\": 1505554379,\n\"delete\": false,\n\"userLevel\": 3\n},\n\"projectId\": \"e99114dd-da11-426a-82c8-ee8a62d7f8e7\",\n\"createTime\": 1505907148\n}\n]\n},\n{\n\"projectId\": \"9a95c235-f89e-400d-8e1b-2320ae1a7c75\",\n\"projectName\": \"项目名\",\n\"detail\": \"项目详情\",\n\"creatorId\": null,\n\"announcer\": {\n\"userId\": \"cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f\",\n\"memberName\": \"张三\",\n\"password\": \"15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225\",\n\"phoneNumber\": \"15820638000\",\n\"department\": \"研发部\",\n\"imageUrl\": null,\n\"createTime\": 1505553392,\n\"updateTime\": 1505554379,\n\"delete\": false,\n\"userLevel\": 3\n},\n\"projectType\": 0,\n\"createTime\": 1505907132,\n\"updateTime\": null,\n\"deadLine\": 1505652668,\n\"userVo\": null,\n\"imageUrl\": null,\n\"projectImageVo\": [\n{\n\"id\": \"583c1c85-9df7-11e7-80f8-e4f89cdc0d1f\",\n\"image\": \"https://www.baidu.com/\",\n\"projectId\": \"9a95c235-f89e-400d-8e1b-2320ae1a7c75\",\n\"createTime\": 1505907132\n},\n{\n\"id\": \"584acd2c-9df7-11e7-80f8-e4f89cdc0d1f\",\n\"image\": \"https://www.baidu.com/\",\n\"projectId\": \"9a95c235-f89e-400d-8e1b-2320ae1a7c75\",\n\"createTime\": 1505907132\n},\n{\n\"id\": \"58556e0d-9df7-11e7-80f8-e4f89cdc0d1f\",\n\"image\": \"https://www.baidu.com/\",\n\"projectId\": \"9a95c235-f89e-400d-8e1b-2320ae1a7c75\",\n\"createTime\": 1505907132\n},\n{\n\"id\": \"585eaa5c-9df7-11e7-80f8-e4f89cdc0d1f\",\n\"image\": \"https://www.baidu.com/\",\n\"projectId\": \"9a95c235-f89e-400d-8e1b-2320ae1a7c75\",\n\"createTime\": 1505907132\n},\n{\n\"id\": \"586c4433-9df7-11e7-80f8-e4f89cdc0d1f\",\n\"image\": \"https://www.baidu.com/\",\n\"projectId\": \"9a95c235-f89e-400d-8e1b-2320ae1a7c75\",\n\"createTime\": 1505907132\n},\n{\n\"id\": \"5875c931-9df7-11e7-80f8-e4f89cdc0d1f\",\n\"image\": \"https://www.baidu.com/\",\n\"projectId\": \"9a95c235-f89e-400d-8e1b-2320ae1a7c75\",\n\"createTime\": 1505907132\n},\n{\n\"id\": \"587f8b76-9df7-11e7-80f8-e4f89cdc0d1f\",\n\"image\": \"https://www.baidu.com/\",\n\"projectId\": \"9a95c235-f89e-400d-8e1b-2320ae1a7c75\",\n\"createTime\": 1505907132\n},\n{\n\"id\": \"588edaf5-9df7-11e7-80f8-e4f89cdc0d1f\",\n\"image\": \"https://www.baidu.com/\",\n\"projectId\": \"9a95c235-f89e-400d-8e1b-2320ae1a7c75\",\n\"createTime\": 1505907132\n}\n],\n\"delete\": false,\n\"userIds\": null,\n\"projectTeamVoList\": [\n{\n\"id\": \"5896c62c-9df7-11e7-80f8-e4f89cdc0d1f\",\n\"memberId\": null,\n\"userVo\": {\n\"userId\": \"5a71afab-7a75-11e7-9ddf-e4f89cdc0d1f\",\n\"memberName\": \"锦斌\",\n\"password\": \"8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92\",\n\"phoneNumber\": \"15820638007\",\n\"department\": \"研发部\",\n\"imageUrl\": null,\n\"createTime\": 1502003010,\n\"updateTime\": 1502009829,\n\"delete\": false,\n\"userLevel\": 2\n},\n\"projectId\": \"9a95c235-f89e-400d-8e1b-2320ae1a7c75\",\n\"createTime\": 1505907132\n},\n{\n\"id\": \"58a26c1b-9df7-11e7-80f8-e4f89cdc0d1f\",\n\"memberId\": null,\n\"userVo\": {\n\"userId\": \"cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f\",\n\"memberName\": \"张三\",\n\"password\": \"15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225\",\n\"phoneNumber\": \"15820638000\",\n\"department\": \"研发部\",\n\"imageUrl\": null,\n\"createTime\": 1505553392,\n\"updateTime\": 1505554379,\n\"delete\": false,\n\"userLevel\": 3\n},\n\"projectId\": \"9a95c235-f89e-400d-8e1b-2320ae1a7c75\",\n\"createTime\": 1505907132\n}\n]\n},\n{\n\"projectId\": \"2abf1d90-4312-4eee-a86f-84d08582dbe1\",\n\"projectName\": \"项目名\",\n\"detail\": \"项目详情\",\n\"creatorId\": null,\n\"announcer\": {\n\"userId\": \"cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f\",\n\"memberName\": \"张三\",\n\"password\": \"15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225\",\n\"phoneNumber\": \"15820638000\",\n\"department\": \"研发部\",\n\"imageUrl\": null,\n\"createTime\": 1505553392,\n\"updateTime\": 1505554379,\n\"delete\": false,\n\"userLevel\": 3\n},\n\"projectType\": 0,\n\"createTime\": 1505907074,\n\"updateTime\": null,\n\"deadLine\": 1505652668,\n\"userVo\": null,\n\"imageUrl\": null,\n\"projectImageVo\": [\n{\n\"id\": \"35398ad5-9df7-11e7-80f8-e4f89cdc0d1f\",\n\"image\": \"https://www.baidu.com/\",\n\"projectId\": \"2abf1d90-4312-4eee-a86f-84d08582dbe1\",\n\"createTime\": null\n},\n{\n\"id\": \"35574377-9df7-11e7-80f8-e4f89cdc0d1f\",\n\"image\": \"https://www.baidu.com/\",\n\"projectId\": \"2abf1d90-4312-4eee-a86f-84d08582dbe1\",\n\"createTime\": null\n},\n{\n\"id\": \"3560e481-9df7-11e7-80f8-e4f89cdc0d1f\",\n\"image\": \"https://www.baidu.com/\",\n\"projectId\": \"2abf1d90-4312-4eee-a86f-84d08582dbe1\",\n\"createTime\": null\n},\n{\n\"id\": \"356c1742-9df7-11e7-80f8-e4f89cdc0d1f\",\n\"image\": \"https://www.baidu.com/\",\n\"projectId\": \"2abf1d90-4312-4eee-a86f-84d08582dbe1\",\n\"createTime\": null\n},\n{\n\"id\": \"35754c37-9df7-11e7-80f8-e4f89cdc0d1f\",\n\"image\": \"https://www.baidu.com/\",\n\"projectId\": \"2abf1d90-4312-4eee-a86f-84d08582dbe1\",\n\"createTime\": null\n},\n{\n\"id\": \"357d8884-9df7-11e7-80f8-e4f89cdc0d1f\",\n\"image\": \"https://www.baidu.com/\",\n\"projectId\": \"2abf1d90-4312-4eee-a86f-84d08582dbe1\",\n\"createTime\": null\n},\n{\n\"id\": \"3584590f-9df7-11e7-80f8-e4f89cdc0d1f\",\n\"image\": \"https://www.baidu.com/\",\n\"projectId\": \"2abf1d90-4312-4eee-a86f-84d08582dbe1\",\n\"createTime\": null\n},\n{\n\"id\": \"358b7a71-9df7-11e7-80f8-e4f89cdc0d1f\",\n\"image\": \"https://www.baidu.com/\",\n\"projectId\": \"2abf1d90-4312-4eee-a86f-84d08582dbe1\",\n\"createTime\": null\n}\n],\n\"delete\": false,\n\"userIds\": null,\n\"projectTeamVoList\": [\n{\n\"id\": \"3591ec80-9df7-11e7-80f8-e4f89cdc0d1f\",\n\"memberId\": null,\n\"userVo\": {\n\"userId\": \"5a71afab-7a75-11e7-9ddf-e4f89cdc0d1f\",\n\"memberName\": \"锦斌\",\n\"password\": \"8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92\",\n\"phoneNumber\": \"15820638007\",\n\"department\": \"研发部\",\n\"imageUrl\": null,\n\"createTime\": 1502003010,\n\"updateTime\": 1502009829,\n\"delete\": false,\n\"userLevel\": 2\n},\n\"projectId\": \"2abf1d90-4312-4eee-a86f-84d08582dbe1\",\n\"createTime\": 1505907073\n},\n{\n\"id\": \"35971f0e-9df7-11e7-80f8-e4f89cdc0d1f\",\n\"memberId\": null,\n\"userVo\": {\n\"userId\": \"cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f\",\n\"memberName\": \"张三\",\n\"password\": \"15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225\",\n\"phoneNumber\": \"15820638000\",\n\"department\": \"研发部\",\n\"imageUrl\": null,\n\"createTime\": 1505553392,\n\"updateTime\": 1505554379,\n\"delete\": false,\n\"userLevel\": 3\n},\n\"projectId\": \"2abf1d90-4312-4eee-a86f-84d08582dbe1\",\n\"createTime\": 1505907073\n}\n]\n},\n{\n\"projectId\": \"82a739b8-58f2-4d99-86e4-7289b9cfff10\",\n\"projectName\": \"项目名\",\n\"detail\": \"项目详情\",\n\"creatorId\": null,\n\"announcer\": {\n\"userId\": \"cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f\",\n\"memberName\": \"张三\",\n\"password\": \"15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225\",\n\"phoneNumber\": \"15820638000\",\n\"department\": \"研发部\",\n\"imageUrl\": null,\n\"createTime\": 1505553392,\n\"updateTime\": 1505554379,\n\"delete\": false,\n\"userLevel\": 3\n},\n\"projectType\": 0,\n\"createTime\": 1505907034,\n\"updateTime\": null,\n\"deadLine\": 1505652668,\n\"userVo\": null,\n\"imageUrl\": null,\n\"projectImageVo\": [\n{\n\"id\": \"1daac96b-9df7-11e7-80f8-e4f89cdc0d1f\",\n\"image\": \"https://www.baidu.com/\",\n\"projectId\": \"82a739b8-58f2-4d99-86e4-7289b9cfff10\",\n\"createTime\": null\n},\n{\n\"id\": \"1dbf7eec-9df7-11e7-80f8-e4f89cdc0d1f\",\n\"image\": \"https://www.baidu.com/\",\n\"projectId\": \"82a739b8-58f2-4d99-86e4-7289b9cfff10\",\n\"createTime\": null\n},\n{\n\"id\": \"1dc4bc63-9df7-11e7-80f8-e4f89cdc0d1f\",\n\"image\": \"https://www.baidu.com/\",\n\"projectId\": \"82a739b8-58f2-4d99-86e4-7289b9cfff10\",\n\"createTime\": null\n},\n{\n\"id\": \"1dcb54d6-9df7-11e7-80f8-e4f89cdc0d1f\",\n\"image\": \"https://www.baidu.com/\",\n\"projectId\": \"82a739b8-58f2-4d99-86e4-7289b9cfff10\",\n\"createTime\": null\n},\n{\n\"id\": \"1dd09b27-9df7-11e7-80f8-e4f89cdc0d1f\",\n\"image\": \"https://www.baidu.com/\",\n\"projectId\": \"82a739b8-58f2-4d99-86e4-7289b9cfff10\",\n\"createTime\": null\n},\n{\n\"id\": \"1ddbbbea-9df7-11e7-80f8-e4f89cdc0d1f\",\n\"image\": \"https://www.baidu.com/\",\n\"projectId\": \"82a739b8-58f2-4d99-86e4-7289b9cfff10\",\n\"createTime\": null\n},\n{\n\"id\": \"1de4f8db-9df7-11e7-80f8-e4f89cdc0d1f\",\n\"image\": \"https://www.baidu.com/\",\n\"projectId\": \"82a739b8-58f2-4d99-86e4-7289b9cfff10\",\n\"createTime\": null\n},\n{\n\"id\": \"1defc09c-9df7-11e7-80f8-e4f89cdc0d1f\",\n\"image\": \"https://www.baidu.com/\",\n\"projectId\": \"82a739b8-58f2-4d99-86e4-7289b9cfff10\",\n\"createTime\": null\n}\n],\n\"delete\": false,\n\"userIds\": null,\n\"projectTeamVoList\": [\n{\n\"id\": \"1e171401-9df7-11e7-80f8-e4f89cdc0d1f\",\n\"memberId\": null,\n\"userVo\": {\n\"userId\": \"5a71afab-7a75-11e7-9ddf-e4f89cdc0d1f\",\n\"memberName\": \"锦斌\",\n\"password\": \"8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92\",\n\"phoneNumber\": \"15820638007\",\n\"department\": \"研发部\",\n\"imageUrl\": null,\n\"createTime\": 1502003010,\n\"updateTime\": 1502009829,\n\"delete\": false,\n\"userLevel\": 2\n},\n\"projectId\": \"82a739b8-58f2-4d99-86e4-7289b9cfff10\",\n\"createTime\": 1505907034\n},\n{\n\"id\": \"1e2400c2-9df7-11e7-80f8-e4f89cdc0d1f\",\n\"memberId\": null,\n\"userVo\": {\n\"userId\": \"cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f\",\n\"memberName\": \"张三\",\n\"password\": \"15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225\",\n\"phoneNumber\": \"15820638000\",\n\"department\": \"研发部\",\n\"imageUrl\": null,\n\"createTime\": 1505553392,\n\"updateTime\": 1505554379,\n\"delete\": false,\n\"userLevel\": 3\n},\n\"projectId\": \"82a739b8-58f2-4d99-86e4-7289b9cfff10\",\n\"createTime\": 1505907034\n}\n]\n}\n],\n\"firstPage\": 1,\n\"prePage\": 0,\n\"nextPage\": 2,\n\"lastPage\": 2,\n\"isFirstPage\": true,\n\"isLastPage\": false,\n\"hasPreviousPage\": false,\n\"hasNextPage\": true,\n\"navigatePages\": 8,\n\"navigatepageNums\": [\n1,\n2\n]\n},\n\"success\": true,\n\"error\": null\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "msg",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "Number",
            "optional": false,
            "field": "code",
            "description": "<p>响应代码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "error",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Boolean",
            "optional": false,
            "field": "success",
            "description": "<p>相应状态</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ],
        "data": [
          {
            "group": "data",
            "type": "String",
            "optional": false,
            "field": "id",
            "description": "<p>项目对应的图片库ID</p>"
          },
          {
            "group": "data",
            "type": "String",
            "optional": false,
            "field": "image",
            "description": "<p>图片</p>"
          },
          {
            "group": "data",
            "type": "String",
            "optional": false,
            "field": "projectId",
            "description": "<p>项目ID</p>"
          },
          {
            "group": "data",
            "type": "String",
            "optional": false,
            "field": "memberId",
            "description": "<p>项目参与人ID</p>"
          },
          {
            "group": "data",
            "type": "Object",
            "optional": false,
            "field": "userVo",
            "description": "<p>项目参与人信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "src/main/java/com/yigong/student_innovation_base_api/doc/ProjectDoc.java",
    "groupTitle": "",
    "name": "GetHttpLocalhost8080BaseApiProject"
  },
  {
    "type": "post",
    "url": "http://localhost:8080/base/api/project",
    "title": "添加项目",
    "group": "ProjectVo",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "projectName",
            "description": "<p>项目名</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "detail",
            "description": "<p>项目详情</p>"
          },
          {
            "group": "Parameter",
            "type": "Integer",
            "optional": false,
            "field": "projectType",
            "description": "<p>项目类型：0为app，1为网站，2为科研类项目，3为其他</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "userIds",
            "description": "<p>项目参与人ID集合</p>"
          },
          {
            "group": "Parameter",
            "type": "Long",
            "optional": false,
            "field": "deadLine",
            "description": "<p>完成时间</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "imageUrl",
            "description": "<p>项目图片集合</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n\"projectName\":\"项目名\",\n\"detail\":\"项目详情\",\n\"projectType\":0,\n\"deadLine\":1505652668,\n\"userIds\":[\"5a71afab-7a75-11e7-9ddf-e4f89cdc0d1f\",\"cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f\"],\n\"imageUrl\":[\"https://www.baidu.com/\",\"https://www.baidu.com/\",\"https://www.baidu.com/\"\n,\"https://www.baidu.com/\",\"https://www.baidu.com/\",\"https://www.baidu.com/\"\n,\"https://www.baidu.com/\"]\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n\"msg\": \"发布项目成功\",\n\"code\": 200,\n\"data\": {\n\"projectId\": \"300dca3c-24fe-4e2b-85f0-56fd35e64ed1\",\n\"projectName\": \"项目名\",\n\"detail\": \"项目详情\",\n\"creatorId\": null,\n\"announcer\": {\n\"userId\": \"cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f\",\n\"memberName\": \"张三\",\n\"password\": \"15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225\",\n\"phoneNumber\": \"15820638000\",\n\"department\": \"研发部\",\n\"imageUrl\": null,\n\"createTime\": 1505553392,\n\"updateTime\": 1505554379,\n\"delete\": false,\n\"userLevel\": 3\n},\n\"projectType\": 0,\n\"createTime\": 1505907240,\n\"updateTime\": null,\n\"deadLine\": 1505652668,\n\"userVo\": null,\n\"imageUrl\": null,\n\"projectImageVo\": [\n{\n\"id\": \"9821d574-9df7-11e7-80f8-e4f89cdc0d1f\",\n\"image\": \"https://www.baidu.com/\",\n\"projectId\": \"300dca3c-24fe-4e2b-85f0-56fd35e64ed1\",\n\"createTime\": 1505907239\n},\n{\n\"id\": \"9836924b-9df7-11e7-80f8-e4f89cdc0d1f\",\n\"image\": \"https://www.baidu.com/\",\n\"projectId\": \"300dca3c-24fe-4e2b-85f0-56fd35e64ed1\",\n\"createTime\": 1505907239\n},\n{\n\"id\": \"9846b881-9df7-11e7-80f8-e4f89cdc0d1f\",\n\"image\": \"https://www.baidu.com/\",\n\"projectId\": \"300dca3c-24fe-4e2b-85f0-56fd35e64ed1\",\n\"createTime\": 1505907239\n},\n{\n\"id\": \"9852f929-9df7-11e7-80f8-e4f89cdc0d1f\",\n\"image\": \"https://www.baidu.com/\",\n\"projectId\": \"300dca3c-24fe-4e2b-85f0-56fd35e64ed1\",\n\"createTime\": 1505907239\n},\n{\n\"id\": \"985b1cbd-9df7-11e7-80f8-e4f89cdc0d1f\",\n\"image\": \"https://www.baidu.com/\",\n\"projectId\": \"300dca3c-24fe-4e2b-85f0-56fd35e64ed1\",\n\"createTime\": 1505907239\n},\n{\n\"id\": \"98623835-9df7-11e7-80f8-e4f89cdc0d1f\",\n\"image\": \"https://www.baidu.com/\",\n\"projectId\": \"300dca3c-24fe-4e2b-85f0-56fd35e64ed1\",\n\"createTime\": 1505907239\n},\n{\n\"id\": \"986893bf-9df7-11e7-80f8-e4f89cdc0d1f\",\n\"image\": \"https://www.baidu.com/\",\n\"projectId\": \"300dca3c-24fe-4e2b-85f0-56fd35e64ed1\",\n\"createTime\": 1505907239\n},\n{\n\"id\": \"986fa33c-9df7-11e7-80f8-e4f89cdc0d1f\",\n\"image\": \"https://www.baidu.com/\",\n\"projectId\": \"300dca3c-24fe-4e2b-85f0-56fd35e64ed1\",\n\"createTime\": 1505907239\n}\n],\n\"delete\": false,\n\"userIds\": null,\n\"projectTeamVoList\": [\n{\n\"id\": \"987a43d1-9df7-11e7-80f8-e4f89cdc0d1f\",\n\"memberId\": null,\n\"userVo\": {\n\"userId\": \"5a71afab-7a75-11e7-9ddf-e4f89cdc0d1f\",\n\"memberName\": \"锦斌\",\n\"password\": \"8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92\",\n\"phoneNumber\": \"15820638007\",\n\"department\": \"研发部\",\n\"imageUrl\": null,\n\"createTime\": 1502003010,\n\"updateTime\": 1502009829,\n\"delete\": false,\n\"userLevel\": 2\n},\n\"projectId\": \"300dca3c-24fe-4e2b-85f0-56fd35e64ed1\",\n\"createTime\": 1505907239\n},\n{\n\"id\": \"98939220-9df7-11e7-80f8-e4f89cdc0d1f\",\n\"memberId\": null,\n\"userVo\": {\n\"userId\": \"cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f\",\n\"memberName\": \"张三\",\n\"password\": \"15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225\",\n\"phoneNumber\": \"15820638000\",\n\"department\": \"研发部\",\n\"imageUrl\": null,\n\"createTime\": 1505553392,\n\"updateTime\": 1505554379,\n\"delete\": false,\n\"userLevel\": 3\n},\n\"projectId\": \"300dca3c-24fe-4e2b-85f0-56fd35e64ed1\",\n\"createTime\": 1505907240\n}\n]\n},\n\"success\": true,\n\"error\": null\n}",
          "type": "json"
        }
      ],
      "fields": {
        "data": [
          {
            "group": "data",
            "type": "String",
            "optional": false,
            "field": "id",
            "description": "<p>项目对应的图片库ID</p>"
          },
          {
            "group": "data",
            "type": "String",
            "optional": false,
            "field": "image",
            "description": "<p>图片</p>"
          },
          {
            "group": "data",
            "type": "String",
            "optional": false,
            "field": "projectId",
            "description": "<p>项目ID</p>"
          },
          {
            "group": "data",
            "type": "String",
            "optional": false,
            "field": "memberId",
            "description": "<p>项目参与人ID</p>"
          },
          {
            "group": "data",
            "type": "Object",
            "optional": false,
            "field": "userVo",
            "description": "<p>项目参与人信息</p>"
          }
        ],
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "msg",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "Number",
            "optional": false,
            "field": "code",
            "description": "<p>响应代码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "error",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Boolean",
            "optional": false,
            "field": "success",
            "description": "<p>相应状态</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "src/main/java/com/yigong/student_innovation_base_api/doc/ProjectDoc.java",
    "groupTitle": "",
    "name": "PostHttpLocalhost8080BaseApiProject"
  },
  {
    "type": "put",
    "url": "http://localhost:8080/base/api/project/batchDelete",
    "title": "删除1个或多个项目",
    "group": "ProjectVo",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "projectId",
            "description": "<p>项目ID</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n\"projectIds\":[\n\"c2abd401-a55b-4897-9cb8-72654665ce02\",\n\"3bcb89b3-469d-4cb6-82e2-43c2e7205828\"]\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n\"msg\": \"删除成功，,管理员可以在回收站查看\",\n\"code\": 200,\n\"data\": null,\n\"success\": true,\n\"error\": null\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n\"msg\": \"所要删除的项目不存在\",\n\"code\": 200,\n\"data\": null,\n\"success\": true,\n\"error\": null\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "msg",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "Number",
            "optional": false,
            "field": "code",
            "description": "<p>响应代码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "error",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Boolean",
            "optional": false,
            "field": "success",
            "description": "<p>相应状态</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "src/main/java/com/yigong/student_innovation_base_api/doc/ProjectDoc.java",
    "groupTitle": "",
    "name": "PutHttpLocalhost8080BaseApiProjectBatchdelete"
  },
  {
    "type": "post",
    "url": "http://localhost:8080/base/api/qiniu/getToken",
    "title": "获取七牛上传token",
    "group": "Qiniu",
    "success": {
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{\n\"七牛云上传token\": \"Bx4bezJT0vWnE_gjvLeggEv6xfXG5NgjuvAcit8w:UBNi861JTIA8VEXc_P4dFXuXCGY=:eyJzY29wZSI6InN0dWRlbnQtaW5ub3ZhdGlvbi1iYXNlIiwiZGVhZGxpbmUiOjE1MDcxOTQzMjh9\"\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "msg",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "Number",
            "optional": false,
            "field": "code",
            "description": "<p>响应代码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "error",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Boolean",
            "optional": false,
            "field": "success",
            "description": "<p>相应状态</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "src/main/java/com/yigong/student_innovation_base_api/doc/QiniuDoc.java",
    "groupTitle": "",
    "name": "PostHttpLocalhost8080BaseApiQiniuGettoken"
  },
  {
    "type": "post",
    "url": "http://localhost:8080/base/api/qiniu/info",
    "title": "图片,Excel表存储",
    "group": "Qiniu",
    "success": {
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{\n\"success\": true/false,\n\"msg\": \"error message\", # optional\n\"file_path\": \"[real file path]\"\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "msg",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "Number",
            "optional": false,
            "field": "code",
            "description": "<p>响应代码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "error",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Boolean",
            "optional": false,
            "field": "success",
            "description": "<p>相应状态</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "src/main/java/com/yigong/student_innovation_base_api/doc/QiniuDoc.java",
    "groupTitle": "",
    "name": "PostHttpLocalhost8080BaseApiQiniuInfo"
  },
  {
    "type": "get",
    "url": "http://localhost:8080/base/api/recycle",
    "title": "获取回收站列表信息",
    "group": "RecycleVo",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "pageNum",
            "description": "<p>页码</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "pageSize",
            "description": "<p>每页数量</p>"
          },
          {
            "group": "Parameter",
            "type": "boolean",
            "optional": false,
            "field": "all",
            "description": "<p>是否获取所有</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "condition",
            "description": "<p>搜索的条件，例如回收类型</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "example",
          "content": "api/recycle?all=true&condition=0",
          "type": "json"
        }
      ]
    },
    "success": {
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{\n\"msg\": \"获取第1页基地回收站信息成功\",\n\"code\": 200,\n\"data\": {\n\"pageNum\": 1,\n\"pageSize\": 5,\n\"size\": 4,\n\"orderBy\": null,\n\"startRow\": 1,\n\"endRow\": 4,\n\"total\": 4,\n\"pages\": 1,\n\"list\": [\n{\n\"recyclerId\": \"22e287a8-9c61-11e7-b1d2-e4f89cdc0d1f\",\n\"recyclerType\": 1,\n\"dynamicId\": null,\n\"dynamic\": null,\n\"projectId\": null,\n\"project\": {\n\"projectId\": \"85cb59b6-cb54-4148-a75d-05d74c67d1b2\",\n\"projectName\": \"项目名\",\n\"detail\": \"项目详情\",\n\"creatorId\": null,\n\"announcer\": {\n\"userId\": \"cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f\",\n\"memberName\": \"张三\",\n\"password\": \"15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225\",\n\"phoneNumber\": \"15820638000\",\n\"department\": \"研发部\",\n\"imageUrl\": null,\n\"createTime\": 1505553392,\n\"updateTime\": 1505554379,\n\"delete\": false,\n\"userLevel\": 2\n},\n\"projectType\": 0,\n\"createTime\": 1505732617,\n\"updateTime\": null,\n\"deadLine\": 1505652668,\n\"userVo\": null,\n\"imageUrl\": null,\n\"projectImageVo\": {\n\"id\": \"07f022f8-9c61-11e7-b1d2-e4f89cdc0d1f\",\n\"image1\": \"https://www.baidu.com/\",\n\"image2\": \"https://www.baidu.com/\",\n\"image3\": \"https://www.baidu.com/\",\n\"image4\": \"https://www.baidu.com/\",\n\"image5\": \"https://www.baidu.com/\",\n\"image6\": \"https://www.baidu.com/\",\n\"image7\": \"https://www.baidu.com/\",\n\"image8\": \"\",\n\"projectId\": \"85cb59b6-cb54-4148-a75d-05d74c67d1b2\"\n},\n\"delete\": true,\n\"userIds\": null,\n\"projectTeamVoList\": [\n{\n\"id\": \"08045610-9c61-11e7-b1d2-e4f89cdc0d1f\",\n\"memberId\": null,\n\"userVo\": {\n\"userId\": \"5a71afab-7a75-11e7-9ddf-e4f89cdc0d1f\",\n\"memberName\": \"锦斌\",\n\"password\": \"8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92\",\n\"phoneNumber\": \"15820638007\",\n\"department\": \"研发部\",\n\"imageUrl\": null,\n\"createTime\": 1502003010,\n\"updateTime\": 1502009829,\n\"delete\": false,\n\"userLevel\": 2\n},\n\"projectId\": \"85cb59b6-cb54-4148-a75d-05d74c67d1b2\",\n\"createTime\": 1505732616\n},\n{\n\"id\": \"081328e1-9c61-11e7-b1d2-e4f89cdc0d1f\",\n\"memberId\": null,\n\"userVo\": {\n\"userId\": \"cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f\",\n\"memberName\": \"张三\",\n\"password\": \"15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225\",\n\"phoneNumber\": \"15820638000\",\n\"department\": \"研发部\",\n\"imageUrl\": null,\n\"createTime\": 1505553392,\n\"updateTime\": 1505554379,\n\"delete\": false,\n\"userLevel\": 2\n},\n\"projectId\": \"85cb59b6-cb54-4148-a75d-05d74c67d1b2\",\n\"createTime\": 1505732616\n}\n]\n},\n\"operatorId\": null,\n\"operator\": {\n\"userId\": \"cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f\",\n\"memberName\": \"张三\",\n\"password\": \"15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225\",\n\"phoneNumber\": \"15820638000\",\n\"department\": \"研发部\",\n\"imageUrl\": null,\n\"createTime\": 1505553392,\n\"updateTime\": 1505554379,\n\"delete\": false,\n\"userLevel\": 2\n},\n\"createTime\": 1505732661,\n\"updateTime\": 0\n},\n{\n\"recyclerId\": \"2567c207-80aa-11e7-a658-e4f89cdc0d1f\",\n\"recyclerType\": 0,\n\"dynamicId\": null,\n\"dynamic\": {\n\"dynamicId\": \"6d003776-7d8b-11e7-983c-e4f89cdc0d1f\",\n\"title\": \"我是标题\",\n\"content\": \"我是内容\",\n\"imageUrl\": null,\n\"announcerId\": null,\n\"createTime\": 1502342339,\n\"updateTime\": 0,\n\"announcer\": {\n\"userId\": \"5a71afab-7a75-11e7-9ddf-e4f89cdc0d1f\",\n\"memberName\": \"锦斌\",\n\"password\": \"8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92\",\n\"phoneNumber\": \"15820638007\",\n\"department\": \"研发部\",\n\"imageUrl\": null,\n\"createTime\": 1502003010,\n\"updateTime\": 1502009829,\n\"delete\": false,\n\"userLevel\": 2\n},\n\"delete\": true\n},\n\"projectId\": null,\n\"project\": null,\n\"operatorId\": null,\n\"operator\": {\n\"userId\": \"5a71afab-7a75-11e7-9ddf-e4f89cdc0d1f\",\n\"memberName\": \"锦斌\",\n\"password\": \"8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92\",\n\"phoneNumber\": \"15820638007\",\n\"department\": \"研发部\",\n\"imageUrl\": null,\n\"createTime\": 1502003010,\n\"updateTime\": 1502009829,\n\"delete\": false,\n\"userLevel\": 2\n},\n\"createTime\": 1502685382,\n\"updateTime\": 0\n},\n{\n\"recyclerId\": \"25759df7-80aa-11e7-a658-e4f89cdc0d1f\",\n\"recyclerType\": 0,\n\"dynamicId\": null,\n\"dynamic\": {\n\"dynamicId\": \"6fa242cf-7d8a-11e7-983c-e4f89cdc0d1f\",\n\"title\": \"我是标题\",\n\"content\": \"我是内容\",\n\"imageUrl\": null,\n\"announcerId\": null,\n\"createTime\": 1502341914,\n\"updateTime\": 0,\n\"announcer\": {\n\"userId\": \"5a71afab-7a75-11e7-9ddf-e4f89cdc0d1f\",\n\"memberName\": \"锦斌\",\n\"password\": \"8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92\",\n\"phoneNumber\": \"15820638007\",\n\"department\": \"研发部\",\n\"imageUrl\": null,\n\"createTime\": 1502003010,\n\"updateTime\": 1502009829,\n\"delete\": false,\n\"userLevel\": 2\n},\n\"delete\": true\n},\n\"projectId\": null,\n\"project\": null,\n\"operatorId\": null,\n\"operator\": {\n\"userId\": \"5a71afab-7a75-11e7-9ddf-e4f89cdc0d1f\",\n\"memberName\": \"锦斌\",\n\"password\": \"8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92\",\n\"phoneNumber\": \"15820638007\",\n\"department\": \"研发部\",\n\"imageUrl\": null,\n\"createTime\": 1502003010,\n\"updateTime\": 1502009829,\n\"delete\": false,\n\"userLevel\": 2\n},\n\"createTime\": 1502685382,\n\"updateTime\": 0\n},\n{\n\"recyclerId\": \"257f2745-80aa-11e7-a658-e4f89cdc0d1f\",\n\"recyclerType\": 0,\n\"dynamicId\": null,\n\"dynamic\": {\n\"dynamicId\": \"76a6be82-7da6-11e7-983c-e4f89cdc0d1f\",\n\"title\": \"我是标题\",\n\"content\": \"我是内容\",\n\"imageUrl\": null,\n\"announcerId\": null,\n\"createTime\": 1502353951,\n\"updateTime\": 0,\n\"announcer\": {\n\"userId\": \"5a71afab-7a75-11e7-9ddf-e4f89cdc0d1f\",\n\"memberName\": \"锦斌\",\n\"password\": \"8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92\",\n\"phoneNumber\": \"15820638007\",\n\"department\": \"研发部\",\n\"imageUrl\": null,\n\"createTime\": 1502003010,\n\"updateTime\": 1502009829,\n\"delete\": false,\n\"userLevel\": 2\n},\n\"delete\": true\n},\n\"projectId\": null,\n\"project\": null,\n\"operatorId\": null,\n\"operator\": {\n\"userId\": \"5a71afab-7a75-11e7-9ddf-e4f89cdc0d1f\",\n\"memberName\": \"锦斌\",\n\"password\": \"8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92\",\n\"phoneNumber\": \"15820638007\",\n\"department\": \"研发部\",\n\"imageUrl\": null,\n\"createTime\": 1502003010,\n\"updateTime\": 1502009829,\n\"delete\": false,\n\"userLevel\": 2\n},\n\"createTime\": 1502685382,\n\"updateTime\": 0\n}\n],\n\"firstPage\": 1,\n\"prePage\": 0,\n\"nextPage\": 0,\n\"lastPage\": 1,\n\"isFirstPage\": true,\n\"isLastPage\": true,\n\"hasPreviousPage\": false,\n\"hasNextPage\": false,\n\"navigatePages\": 8,\n\"navigatepageNums\": [\n1\n]\n},\n\"success\": true,\n\"error\": null\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "msg",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "Number",
            "optional": false,
            "field": "code",
            "description": "<p>响应代码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "error",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Boolean",
            "optional": false,
            "field": "success",
            "description": "<p>相应状态</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "src/main/java/com/yigong/student_innovation_base_api/doc/RecycleDoc.java",
    "groupTitle": "",
    "name": "GetHttpLocalhost8080BaseApiRecycle"
  },
  {
    "type": "put",
    "url": "http://localhost:8080/base/api/user/forgetPassword",
    "title": "用户忘记密码(修改密码的话要再次登录获取token)",
    "group": "UserDTO",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "userId",
            "description": "<p>用户ID</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "password",
            "description": "<p>密码</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "phoneNumber",
            "description": "<p>手机号码</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "smsCode",
            "description": "<p>验证码</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n\"userId\":\"5a71afab-7a75-11e7-9ddf-e4f89cdc0d1f\",\n\"phoneNumber\":\"15820638007\",\n\"password\":\"1997\",\n\"smsCode\":\"8830\"\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n\"msg\": \"验证成功,密码修改成功\",\n\"code\": 200,\n\"data\": {\n\"userId\": \"5a71afab-7a75-11e7-9ddf-e4f89cdc0d1f\",\n\"memberName\": \"锦斌\",\n\"password\": \"0985b889a1fe4f4e1fb925061ac6fb2247f10875f5fcbe63eec2ab55ed68970e\",\n\"phoneNumber\": \"15820638007\",\n\"department\": \"研发部\",\n\"grade\": \"0\",\n\"imageUrl\": null,\n\"createTime\": 1509628932,\n\"updateTime\": 1509630082,\n\"delete\": false,\n\"userLevel\": 2\n},\n\"success\": true,\n\"error\": null\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "msg",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "Number",
            "optional": false,
            "field": "code",
            "description": "<p>响应代码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "error",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Boolean",
            "optional": false,
            "field": "success",
            "description": "<p>相应状态</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "src/main/java/com/yigong/student_innovation_base_api/doc/UserDoc.java",
    "groupTitle": "",
    "name": "PutHttpLocalhost8080BaseApiUserForgetpassword"
  },
  {
    "type": "delete",
    "url": "http://localhost:8080/base/api/user/{userId}",
    "title": "web端管理员删除用户信息",
    "group": "User",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "userId",
            "description": "<p>用户ID</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "http://localhost:8080/base/api/user/b0b2a052-7d21-11e7-983c-e4f89cdc0d1f",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n\"msg\": \"删除成功\",\n\"code\": 200,\n\"data\": null,\n\"success\": true,\n\"error\": null\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "msg",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "Number",
            "optional": false,
            "field": "code",
            "description": "<p>响应代码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "error",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Boolean",
            "optional": false,
            "field": "success",
            "description": "<p>相应状态</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "src/main/java/com/yigong/student_innovation_base_api/doc/UserDoc.java",
    "groupTitle": "",
    "name": "DeleteHttpLocalhost8080BaseApiUserUserid"
  },
  {
    "type": "get",
    "url": "http://localhost:8080/base/api/user",
    "title": "web端管理员获取用户列表信息",
    "group": "User",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "pageNum",
            "description": "<p>页码</p>"
          },
          {
            "group": "Parameter",
            "type": "int",
            "optional": false,
            "field": "pageSize",
            "description": "<p>每页数量</p>"
          },
          {
            "group": "Parameter",
            "type": "boolean",
            "optional": false,
            "field": "all",
            "description": "<p>是否获取所有</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "condition",
            "description": "<p>搜索的条件，部门,年级,用户等级都可以</p>"
          }
        ]
      },
      "examples": [
        {
          "title": "example",
          "content": "api/user?all=true&condition=研发部",
          "type": "json"
        }
      ]
    },
    "success": {
      "examples": [
        {
          "title": "Success-Response:",
          "content": "{\n\"msg\": \"获取第1页基地成员信息成功\",\n\"code\": 200,\n\"data\": {\n\"pageNum\": 1,\n\"pageSize\": 5,\n\"size\": 3,\n\"orderBy\": null,\n\"startRow\": 1,\n\"endRow\": 3,\n\"total\": 3,\n\"pages\": 1,\n\"list\": [\n{\n\"userId\": \"5a71afab-7a75-11e7-9ddf-e4f89cdc0d1f\",\n\"memberName\": \"锦斌\",\n\"password\": \"8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92\",\n\"phoneNumber\": \"15820638007\",\n\"department\": \"研发部\",\n\"imageUrl\": null,\n\"createTime\": 1502003010,\n\"updateTime\": 1502009829,\n\"delete\": false,\n\"userLevel\": 2\n},\n{\n\"userId\": \"c62d3127-7a79-11e7-9ddf-e4f89cdc0d1f\",\n\"memberName\": \"彭锦斌\",\n\"password\": \"19c654f6061e534f830539f4010aa2e7f77082a0f0d63e3e7f3333e667a0ac4c\",\n\"phoneNumber\": \"15820638006\",\n\"department\": \"产品部\",\n\"imageUrl\": null,\n\"createTime\": 1502006268,\n\"updateTime\": 1502006268,\n\"delete\": false,\n\"userLevel\": 1\n},\n{\n\"userId\": \"cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f\",\n\"memberName\": \"张三\",\n\"password\": \"15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225\",\n\"phoneNumber\": \"15820638000\",\n\"department\": \"研发部\",\n\"imageUrl\": null,\n\"createTime\": 1505553392,\n\"updateTime\": 1505554379,\n\"delete\": false,\n\"userLevel\": 1\n}\n],\n\"firstPage\": 1,\n\"prePage\": 0,\n\"nextPage\": 0,\n\"lastPage\": 1,\n\"isFirstPage\": true,\n\"isLastPage\": true,\n\"hasPreviousPage\": false,\n\"hasNextPage\": false,\n\"navigatePages\": 8,\n\"navigatepageNums\": [\n1\n]\n},\n\"success\": true,\n\"error\": null\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "msg",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "Number",
            "optional": false,
            "field": "code",
            "description": "<p>响应代码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "error",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Boolean",
            "optional": false,
            "field": "success",
            "description": "<p>相应状态</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "src/main/java/com/yigong/student_innovation_base_api/doc/UserDoc.java",
    "groupTitle": "",
    "name": "GetHttpLocalhost8080BaseApiUser"
  },
  {
    "type": "post",
    "url": "http://localhost:8080/base/api/login",
    "title": "app端用户登录",
    "group": "User",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "memberName",
            "description": "<p>基地成员名</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "phoneNumber",
            "description": "<p>手机号码</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "password",
            "description": "<p>密码</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n\"memberName\": \"张三\",\n\"password\": \"123456789\"\n}",
          "type": "json"
        },
        {
          "title": "Success-Request:",
          "content": "{\n\"phoneNumber\": \"15820638000\",\n\"password\": \"123456789\"\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n\"msg\": \"登录成功\",\n\"code\": 200,\n\"data\": {\n\"user\": {\n\"userId\": \"cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f\",\n\"memberName\": \"张三\",\n\"password\": \"15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225\",\n\"phoneNumber\": \"15820638000\",\n\"department\": \"研发部\",\n\"imageUrl\": null,\n\"createTime\": 1505553392,\n\"updateTime\": 1505554379,\n\"delete\": false,\n\"userLevel\": 3\n},\n\"token\": \"eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJhdWQiOiJjZDM1ZjgyZS05YWJmLTExZTctYmJjNC1lNGY4OWNkYzBkMWYifQ.ELX-2adW7zHhMfzpHfZe8kLSWL2fwEpkIlftYYl98A0\"\n},\n\"success\": true,\n\"error\": null\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n\"msg\": \"登录失败,用户不存在\",\n\"code\": 400,\n\"data\": null,\n\"success\": false,\n\"error\": null\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n\"msg\": \"登录失败,密码错误\",\n\"code\": 400,\n\"data\": null,\n\"success\": false,\n\"error\": null\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "msg",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "Number",
            "optional": false,
            "field": "code",
            "description": "<p>响应代码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "error",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Boolean",
            "optional": false,
            "field": "success",
            "description": "<p>相应状态</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "src/main/java/com/yigong/student_innovation_base_api/doc/UserDoc.java",
    "groupTitle": "",
    "name": "PostHttpLocalhost8080BaseApiLogin"
  },
  {
    "type": "post",
    "url": "http://localhost:8080/base/api/user",
    "title": "app端用户注册",
    "group": "User",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "memberName",
            "description": "<p>基地成员名</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "password",
            "description": "<p>密码</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "phoneNumber",
            "description": "<p>手机号码</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "department",
            "description": "<p>部门</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "garde",
            "description": "<p>成员年级</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n\"memberName\": \"测试名\",\n\"password\": \"123456\",\n\"phoneNumber\": \"15820638010\",\n\"department\": \"研发部\",\n\"grade\": \"2017\"\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n\"msg\": \"添加成员成功\",\n\"code\": 200,\n\"data\": {\n\"userId\": \"966e4290-b9f8-11e7-96d4-e4f89cdc0d1f\",\n\"memberName\": \"测试名\",\n\"password\": \"8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92\",\n\"phoneNumber\": \"15820638010\",\n\"department\": \"研发部\",\n\"grade\": \"2017\",\n\"imageUrl\": null,\n\"createTime\": 1508986281,\n\"updateTime\": 0,\n\"delete\": false,\n\"userLevel\": 1\n},\n\"success\": true,\n\"error\": null\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "msg",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "Number",
            "optional": false,
            "field": "code",
            "description": "<p>响应代码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "error",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Boolean",
            "optional": false,
            "field": "success",
            "description": "<p>相应状态</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "src/main/java/com/yigong/student_innovation_base_api/doc/UserDoc.java",
    "groupTitle": "",
    "name": "PostHttpLocalhost8080BaseApiUser"
  },
  {
    "type": "put",
    "url": "http://localhost:8080/base/api/user",
    "title": "app端用户修改信息(修改密码的话要再次登录获取token)",
    "group": "User",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "userId",
            "description": "<p>用户ID</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "memberName",
            "description": "<p>基地成员名</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "password",
            "description": "<p>密码</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "phoneNumber",
            "description": "<p>手机号码</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "department",
            "description": "<p>部门</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "garde",
            "description": "<p>成员年级</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "imageUrl",
            "description": "<p>头像URL</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n\"userId\": \"cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f\",\n\"password\": \"123456789\"\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n\"msg\": \"信息更新成功\",\n\"code\": 200,\n\"data\": {\n\"userId\": \"cd35f82e-9abf-11e7-bbc4-e4f89cdc0d1f\",\n\"memberName\": \"张三\",\n\"password\": \"15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225\",\n\"phoneNumber\": \"15820638000\",\n\"department\": \"研发部\",\n\"imageUrl\": null,\n\"createTime\": 1505553392,\n\"updateTime\": 1505554379,\n\"delete\": false,\n\"userLevel\": 1\n},\n\"success\": true,\n\"error\": null\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "msg",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "Number",
            "optional": false,
            "field": "code",
            "description": "<p>响应代码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "error",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Boolean",
            "optional": false,
            "field": "success",
            "description": "<p>相应状态</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "src/main/java/com/yigong/student_innovation_base_api/doc/UserDoc.java",
    "groupTitle": "",
    "name": "PutHttpLocalhost8080BaseApiUser"
  },
  {
    "type": "put",
    "url": "http://localhost:8080/base/api/user/getMessage",
    "title": "根据用户名/手机号查询用户信息",
    "group": "User",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "memberName",
            "description": "<p>基地成员名</p>"
          },
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "phoneNumber",
            "description": "<p>手机号码</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n\"memberName\":\"锦斌\"\n}",
          "type": "json"
        },
        {
          "title": "Success-Request:",
          "content": "{\n\"phoneNumber\": \"15820638007\"\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n\"msg\": \"查询信息成功\",\n\"code\": 200,\n\"data\": {\n\"userId\": \"5a71afab-7a75-11e7-9ddf-e4f89cdc0d1f\",\n\"memberName\": \"锦斌\",\n\"password\": \"8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92\",\n\"phoneNumber\": \"15820638007\",\n\"department\": \"研发部\",\n\"imageUrl\": null,\n\"createTime\": 1502003010,\n\"updateTime\": 1502009829,\n\"delete\": false,\n\"userLevel\": 2\n},\n\"success\": true,\n\"error\": null\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "msg",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "Number",
            "optional": false,
            "field": "code",
            "description": "<p>响应代码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "error",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Boolean",
            "optional": false,
            "field": "success",
            "description": "<p>相应状态</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "src/main/java/com/yigong/student_innovation_base_api/doc/UserDoc.java",
    "groupTitle": "",
    "name": "PutHttpLocalhost8080BaseApiUserGetmessage"
  },
  {
    "type": "put",
    "url": "http://localhost:8080/base/api/user/updatePower",
    "title": "超级管理员分配权限",
    "group": "User",
    "parameter": {
      "fields": {
        "Parameter": [
          {
            "group": "Parameter",
            "type": "String",
            "optional": false,
            "field": "userId",
            "description": "<p>用户ID</p>"
          },
          {
            "group": "Parameter",
            "type": "Integer",
            "optional": false,
            "field": "userLevel",
            "description": "<p>用户等级1表示普通成员，2表示管理员</p>"
          }
        ]
      }
    },
    "success": {
      "examples": [
        {
          "title": "Success-Request:",
          "content": "{\n\"userId\":\"c62d3127-7a79-11e7-9ddf-e4f89cdc0d1f\",\n\"userLevel\":2\n}",
          "type": "json"
        },
        {
          "title": "Success-Response:",
          "content": "{\n\"msg\": \"更新成员权限成功\",\n\"code\": 200,\n\"data\": {\n\"userId\": \"c62d3127-7a79-11e7-9ddf-e4f89cdc0d1f\",\n\"memberName\": \"彭锦斌\",\n\"password\": \"19c654f6061e534f830539f4010aa2e7f77082a0f0d63e3e7f3333e667a0ac4c\",\n\"phoneNumber\": \"15820638006\",\n\"department\": \"产品部\",\n\"imageUrl\": null,\n\"createTime\": 1502006268,\n\"updateTime\": 1505740279,\n\"delete\": false,\n\"userLevel\": 2\n},\n\"success\": true,\n\"error\": null\n}",
          "type": "json"
        }
      ],
      "fields": {
        "Success 200": [
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "msg",
            "description": "<p>响应结果</p>"
          },
          {
            "group": "Success 200",
            "type": "Number",
            "optional": false,
            "field": "code",
            "description": "<p>响应代码</p>"
          },
          {
            "group": "Success 200",
            "type": "String",
            "optional": false,
            "field": "error",
            "description": "<p>错误信息</p>"
          },
          {
            "group": "Success 200",
            "type": "Boolean",
            "optional": false,
            "field": "success",
            "description": "<p>相应状态</p>"
          },
          {
            "group": "Success 200",
            "type": "Object",
            "optional": false,
            "field": "data",
            "description": "<p>主体信息</p>"
          }
        ]
      }
    },
    "version": "0.0.0",
    "filename": "src/main/java/com/yigong/student_innovation_base_api/doc/UserDoc.java",
    "groupTitle": "",
    "name": "PutHttpLocalhost8080BaseApiUserUpdatepower"
  }
] });
