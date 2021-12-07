<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>add</title>
</head>
<body>
<div align="center">
    <p>添加学生</p>
    <form action="add" method="post">
        姓名：<input type="text" name="name"><br/>
        年龄：<input type="text" name="age"><br/>
        <input type="submit" value="注册">
    </form>
    <br/><br/>

    <p>查询学生</p>
    <form action="queryId" method="get">
        学生id ：<input type="text" name="stu_id"><br/>
        <input type="submit" value="查询">
    </form>
    <br/><br/>


</div>


</body>
</html>