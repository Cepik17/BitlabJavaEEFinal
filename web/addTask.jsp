<%@ page import="Sprint2_4.db.DBManager" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

</head>
<body>
<a href="home.jsp">HOME</a>
<form action="/addTask" method="post">
    <h3>New Task</h3>
    <p>Name</p>
    <input type="text" placeholder="Name" name="taskname">
    <p>Desription</p>
    <input type="text" placeholder="Description" name="taskdescription">
    <p>Deadline</p>
    <input type="date" name="taskdate">
    <button type="submit">Add</button>
</form>

</body>
</html>

<%--    <button type="button" &lt;%&ndash;onclick="closeWindow()"&ndash;%&gt;>Close</button>--%>
<%--<script>--%>
<%--    function closeWindow() {--%>
<%--        window.close();--%>
<%--        window.location.href = "/home.jsp";--%>
<%--    }--%>
<%--</script>--%>
