
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${ctx}/static/plugins/jquery/jquery-3.4.1.js"></script>
</head>
<body>
<button id="b1">请求得到bean</button>
<button id="b2">请求得到Map</button>
<button id="b3">请求得到数组</button>
<button id="b4">请求得到List</button>
<button id="b5">请求得到"List里面是Map里面是key为Stringvalue为User"</button>

<div>

</div>

<script>

    $(function () {
        $('#b1').click(function () {
            $.ajax({
                url:'${ctx}/json/user',
                type:'post',
                success:function (data) {
                    alert(data.name);
                    alert(data.password);
                }
            })
        })
        
    })

    $(function () {
        $('#b2').click(function () {
            $.ajax({
                url:'${ctx}/json/one',
                type:'post',
                success:function (data) {
                    alert(data.name);
                    alert(data.age);
                }
            })
        })

    })

    $(function () {
        $('#b3').click(function () {
            $.ajax({
                url:'${ctx}/json/two',
                type:'post',
                success:function (data) {
                    for(var i=0;i<data.length;i++){
                        alert(data[i].name)
                        alert(data[i].password)
                    }
                }
            })
        })

    })
    $(function () {
        $('#b4').click(function () {
            $.ajax({
                url:'${ctx}/json/three',
                type:'post',
                success:function (data) {
                    for(var i=0;i<data.length;i++){
                        alert(data[i].name)
                        alert(data[i].password)
                    }
                }
            })
        })

    })

    $(function () {
        $('#b5').click(function () {
            $.ajax({
                url:'${ctx}/json/four',
                type:'post',
                success:function (data) {
                    for(var i=0;i<data.length;i++){
                        alert(data[i].user.name)
                        alert(data[i].user.password)
                        alert(data[i].user1.name)
                        alert(data[i].user1.password)
                    }
                }
            })
        })

    })



</script>

</body>
</html>
