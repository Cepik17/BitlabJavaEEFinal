<%@ page import="Sprint2_4.models.Tasks" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Details</title>
    <%@include file="source.jsp"%>
</head>
<body>
<%@include file="head.jsp"%>
<%
    Tasks t = (Tasks) request.getAttribute("task");
    if (t!=null) {
%>
<form action="/changeTask" method="post">
<div style="width: 600px; padding: 5px; margin:auto; justify-content: center">
    <div class="mb-3">
        <label for="exampleFormControlInput1" class="form-label">Name</label>
        <input type="hidden" name="idchange" value="<%=t.getId()%>">
        <input type="text" class="form-control" id="exampleFormControlInput1" value="<%=t.getName()%>" name="taskname">
    </div>
    <div class="mb-3">
        <label for="exampleFormControlInput2" class="form-label">Description</label>
        <input type="text" class="form-control" id="exampleFormControlInput2" value="<%=t.getDescription()%>" name="taskdescription">
    </div>
    <div class="mb-3">
        <label for="exampleFormControlInput3" class="form-label">Deadline</label>
        <input type="date" class="form-control" id="exampleFormControlInput3" value="<%=t.getDeadlineDate()%>" name="taskdate">
    </div>
    <div class="mb-3">
        <label for="exampleFormControlInput4" class="form-label">Status</label>
        <input type="text" class="form-control" id="exampleFormControlInput4" value="<%=t.getStatus()%>" name="taskstatus">
    </div>
</div>
    <div style="display: inline-block; width: 100%; text-align: center">
        <button type="submit" style="background-color: limegreen; color: white" >Save</button>
    </div>
</form>
    <div style="display: inline-block; width: 100%; text-align: center">
        <form method="post" action="/deleteTask">
            <input type="hidden" name="iddelete" value="<%=t.getId()%>">
            <button type="submit" style="background-color: red; color: white">Delete</button>
        </form>
<%--        <a href="/deleteTask?id=<%=t.getId()%>" name="iddelete" class="btn btn-info btn-sm" style="padding: 5px 20px; background-color: darkblue;color:white" >Delete</a>--%>
    </div>
<%
    }
%>
</body>
</html>
