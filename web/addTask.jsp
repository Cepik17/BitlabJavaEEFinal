<%@ page import="Sprint2_4.db.DBManager" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Task</title>
    <%@include file="source.jsp"%>
</head>
<body>
<%@include file="head.jsp"%>
<form action="/addTask" method="post">
    <div style="width: 600px; padding: 5px; margin:auto; justify-content: center">
    <div class="mb-3">
        <h4>New Task</h4>
        <label for="exampleFormControlInput1" class="form-label">Name</label>
        <input type="text" class="form-control" id="exampleFormControlInput1" placeholder="Name" name="taskname">
    </div>
    <div class="mb-3">
        <label for="exampleFormControlTextarea1" class="form-label">Description</label>
        <textarea class="form-control" id="exampleFormControlTextarea1" rows="5" name="taskdescription"></textarea>
    </div>
    <div class="mb-3">
        <label for="exampleFormControlInput2" class="form-label">Deadline</label>
        <input type="date" class="form-control" id="exampleFormControlInput2" placeholder="Deadline" name="taskdate">
    </div>
    <button type="submit" class="btn btn-info btn-sm" style="background-color: limegreen; color: white">Add</button>
    </div>
</form>
</body>
</html>

