
<%@ page import="java.util.List" %>
<%@ page import="Sprint2_4.models.Tasks" %>
<%@ page import="java.util.ArrayList" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tomcat</title>
    <%@include file="source.jsp"%>
</head>
<body>
<%@include file="head.jsp"%>
<div>
    <a href="/addTask" class="btn btn-info btn-sm" style="padding: 5px 20px; background-color: darkblue;color:white; margin: 10px">+ ADD TASK</a>
</div>
<div class ="container" >
    <div class="row mt-5">
        <div class="col-sm-12">
            <table class="table">
                <thead>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Deadline</th>
                    <th>Status</th>
                    <th>Details</th>
                </thead>
                <tbody>
                <%
                    ArrayList<Tasks> tasks = (ArrayList<Tasks>) request.getAttribute("tasks");
                    if (tasks!=null){
                        for(Tasks t : tasks){
                %>
                <tr>
                    <td><%=t.getId()%></td>
                    <td><%=t.getName()%></td>
                    <td><%=t.getDeadlineDate()%></td>
                    <td><%=t.getStatus()%></td>
                    <td><a href="/detailsTasks?id=<%=t.getId()%>" class="btn btn-info btn-sm" style="padding: 5px 20px; background-color: darkblue;color:white" >Details</a></td>
                </tr>
                <%
                        }
                    }
                %>
                </tbody>
            </table>
        </div>
    </div>
</div>
</body>
</html>



<%--<div>--%>
<%--    <form action="/addItem" method="post">--%>
<%--        <input type="text" placeholder="Insert name" name="itemname">--%>
<%--        <input type="number" placeholder="Insert price" name="itemprice">--%>
<%--        <input type="number" placeholder="Insert amount" name="itemamount">--%>
<%--        <button>add item</button>--%>
<%--    </form>--%>
<%--</div>--%>

<%--<a href="/addItem">ADD ITEM PAGE</a>--%>
<%--<table>--%>
<%--    <thead>--%>
<%--    <th>ID</th>--%>
<%--    <th>Name</th>--%>
<%--    <th>PRICE</th>--%>
<%--    <th>DETAILS</th>--%>
<%--    </thead>--%>
<%--    <tbody>--%>
<%--<%--%>
<%--    List<Item> items = (List<Item>) request.getAttribute("items");--%>
<%--    for (Item item : items) {--%>
<%--%>--%>

<%--        <tr>--%>
<%--            <td><%=item.getId()%>></td>--%>
<%--            <td><%=item.getName()%>></td>--%>
<%--            <td><%=item.getAmount()%>></td>--%>
<%--            <td><%=item.getPrice()%>></td>--%>
<%--            <td><a href="/detailsItem?id=<%=item.getId()%>">Details</a></td>--%>
<%--        </tr>--%>

<%--<%--%>
<%--    }--%>
<%--%>--%>
<%--    </tbody>--%>
<%--</table>--%>

