<%@ page import="Sprint2_4.models.Tasks" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Tasks t = (Tasks) request.getAttribute("task");
    if (t!=null) {
%>
<h2>Task Details</h2>
<h5><%=t.getId()%></h5>
<h5><%=t.getName()%></h5>
<h5><%=t.getDescription()%></h5>
<h5><%=t.getDeadlineDate()%></h5>
<%
    }
%>
</body>
</html>
