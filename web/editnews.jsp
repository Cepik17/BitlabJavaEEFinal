<%@ page import="finalproject.models.News" %><%--
  Created by IntelliJ IDEA.
  User: Serik.Taganbergenov
  Date: 06.04.2023
  Time: 17:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>News.com</title>
  <%@include file="source.jsp"%>
</head>
<body>
<%@include file="header2.jsp"%>
<%
    News novost = (News) request.getAttribute("news");
    String languagecode = (String) request.getAttribute("languagecode");
    if (novost != null) {
%>
<div class="container">
    <form action="/editnews" method="post">
        <div class="mb-3">
            <input type="hidden" name="id" value="<%=novost.getId()%>">
            <label for="Input1" class="form-label">Title</label>
            <input type="text" class="form-control" id="Input1" value="<%=novost.getTitle().getTitle()%>" name="new_title">
        </div>
        <div class="mb-3">
            <label for="Input2" class="form-label">Content</label>
<%--            <textarea class="form-control" id="Input2" rows="5" name="content"></textarea>--%>
            <input type="text" class="form-control" id="Input2" value="<%=novost.getContent().getContent()%>" name="new_content">
        </div>
<%--        <div class="mb-3">--%>
<%--            <label for="Input3" class="form-label">News Category</label>--%>
<%--            <input type="text" class="form-control" id="Input3" value="<%=novost.getCategoryId().getId()%>" name="newscategory">--%>
<%--        </div>      --%>
        <div class="mb-3">
            <select class="form-select" aria-label="News Category" name="new_category">
                <option selected>News Category</option>
                <option value="1">Poltics</option>
                <option value="2">Sport</option>
            </select>
        </div>
<%--        <div class="mb-3">--%>
<%--            <label for="Input4" class="form-label">News Category</label>--%>
<%--            <input type="text" class="form-control" id="Input4" value="<%=languagecode%>" name="languagecode">--%>
<%--        </div>--%>
        <div class="mb-3">
            <select class="form-select" aria-label="Language" name="new_languageId">
                <option selected>Language</option>
                <option value="1">Eng</option>
                <option value="2">Рус</option>
            </select>
        </div>
        <button class="btn btn-success">Save changes</button>
    </form>
</div>
<%
    }
%>
</body>
</html>
