
<%@ page import="java.util.List" %>
<%@ page import="Sprint2_4.models.Tasks" %>
<%@ page import="java.util.ArrayList" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tomcat</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
</head>
<body>

<div>
    <button type = "button" style="padding: 5px; background-color: darkblue;color:white"><a href="/addTask">ADD TASK</a></button>
</div>
<div class ="container">
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
                    <td><a href="/detailsTasks?id=<%=t.getId()%>" class="btn btn-info btn-sm" style="background-color: darkblue; color: white">Details</a></td>
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

