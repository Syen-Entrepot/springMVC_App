<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/29 0029
  Time: 下午 12:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>App信息管理系统</title>
    <!--引用css-->
    <link rel="stylesheet" href="${ctx}/static/plugins/layui/css/layui.css">

</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
    <jsp:include page="/jsp/common/header.jsp"/>

    <div class="layui-body">
        <!-- 内容主体区域 -->
        app信息管理
        <div style="padding: 15px;">

            <table class="layui-table">
                <thead>
                <tr>
                    <th>APP账号ID:</th>
                    <th>APP使用者:</th>
                    <th>APP使用者描述:</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${appAccount}" var="obj">
                        <tr>
                            <td>${obj.id}</td>
                            <td>${obj.no}</td>
                            <td>${obj.description}</td>
                        </tr>

                </c:forEach>
                </tbody>
            </table>


        </div>
    </div>

    <div class="layui-footer">
        <!-- 底部固定区域 -->
        © layui.com - 底部固定区域
    </div>
</div>
<script src="${ctx}/static/plugins/layui/layui.js"></script>
<script>
    //JavaScript代码区域
    layui.use('element', function(){
        var element = layui.element;

    });
</script>
</body>
</html>
