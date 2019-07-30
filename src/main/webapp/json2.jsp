<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/29 0029
  Time: 下午 15:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${ctx}/static/plugins/jquery/jquery-3.4.1.js"></script>
</head>
<body>

<button id="b1">发送一个User对象到后台，并且是以ajax形式发送</button>
<button id="b2">发送一组对象到后台，并且是以ajax形式发送</button>

</body>

<script>
    $(function () {
        $('#b1').click(function () {

            //
            var obj={
                'name':'明天很好',
                'password':'nice'
            };

            $.ajax({
                url:'${ctx}/json2/add',
                type:'post',
                contentType:'application/json',//声明是json格式,这样才能发送过去
                data:JSON.stringify(obj),//包装数据
                success:function (data) {

                }
            })
        })


        $('#b2').click(function () {

            //
            var obj={
                'name':'明天很好',
                'password':'nice'
            };
            var obj2={
                'name':'今天也不错',
                'password':'best'
            };
            var arr=new Array();
            arr.push(obj);
            arr.push(obj2);

            $.ajax({
                url:'${ctx}/json2/addList',
                type:'post',
                contentType:'application/json',//声明是json格式,这样才能发送过去
                data:JSON.stringify(arr),//包装数据
                success:function (data) {
                    if(data.code==2000){
                        alert("成功了")
                    }

                }
            })
        })

    })
</script>

</html>
