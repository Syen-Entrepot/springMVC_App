<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/29 0029
  Time: 下午 18:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${ctx}/static/plugins/jquery/jquery-3.4.1.js"></script>
</head>
<body>

<form action="${ctx}/user/register" method="post">
    username:<input type="text" name="name"><span id="msg"></span><br>
    password:<input type="password" name="password"><br>
    <input type="submit" value="提交">

</form>
<script src="${ctx}/static/plugins/layui/layui.js"></script>
<script>

    //JavaScript代码区域
    layui.use(['element','jquery','layer'], function(){
        var element = layui.element;
        var jquery=layui.jquery;
        var layer=layui.layer;

        $(function () {
            $('input[name=name]').blur(function () {
                //获取名字
                var name=$('input[name=name]').val();
                var obj={
                    name:name
                }
                $.ajax({
                    url:'${ctx}/user/check',
                    type:'post',
                    contentType:'application/json',
                    data:JSON.stringify(obj),
                    success:function (data) {
                        if(data.code!=2000){
                           // $('#msg').html('用户名可以使用');
                           // layer.msg('用户名可以使用')
                            layer.msg('用户名可以使用',{icon:6})
                        }else {
                           // $('#msg').html('用户名已存在');
                            layer.msg('用户名已存在')
                        }
                    }
                })
            })
        })


    });


</script>

</body>
</html>
