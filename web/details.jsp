<%@ page import="models.Item" %><%--
  Created by IntelliJ IDEA.
  User: Serik.Taganbergenov
  Date: 02.03.2023
  Time: 21:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
    Item item = (Item) request.getAttribute("item");
    if (item!=null){
    %>
    <h1>Detail Item</h1>
    <h5><%=item.getId()%></h5>
    <h5><%=item.getName()%></h5>
    <h5><%=item.getPrice()%></h5>
    <h5><%=item.getAmount()%></h5>
    <%
    }
    %>
</body>
</html>
