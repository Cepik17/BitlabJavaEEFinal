<%@ page import="java.util.ArrayList" %>
<%@ page import="Sprint6_4.models.News" %>
<%@ page import="Sprint6_4.models.Translation" %><%--
  Created by IntelliJ IDEA.
  User: Serik.Taganbergenov
  Date: 23.03.2023
  Time: 12:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Admin Panel</title>
    <%@include file="source.jsp" %>
</head>
<%
    ArrayList<News> novosti = (ArrayList<News>) request.getAttribute("novosti");
    ArrayList<String> perevodAdmin = (ArrayList<String>) request.getAttribute("trans_admin");
    if (perevodAdmin == null) {
        perevodAdmin = Translation.translations.get(0);
    }
//    String langIdAdmin =(String)request.getAttribute("langIdAdmin");
//    System.out.println("langIdAdmin in admin jsp: " + langIdAdmin);
//
%>
<body>
    <div class="container">
        <header>
            <nav class="navbar navbar-expand-lg bg-primary" data-bs-theme="dark">
                <div class="container-fluid">
                    <a class="navbar-brand" href="/">NEWS.com</a>
                    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse justify-content-end" id="navbarSupportedContent">
                        <ul class="navbar-nav mb-2 mb-lg-0">
                            <li class="nav-item">
                                <a class="nav-link" href="/admin"><%=perevodAdmin.get(0)%></a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="/admin?langId=2">РУС</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="/admin?langId=1">ENG</a>
                            </li>
                        </ul>
                    </div>
                </div>
            </nav>
        </header>
       <div class="row mt-5">
          <div class="col-sm-12">
              <button type="button" class="btn btn-success" data-bs-toggle="modal" data-bs-target="#exampleModal">
                  <%=perevodAdmin.get(2)%>
              </button>
              <table class="table mt-5">
                    <thead>
                        <th>ID</th>
                        <th><%=perevodAdmin.get(3)%></th>
                        <th><%=perevodAdmin.get(4)%></th>
                        <th><%=perevodAdmin.get(5)%></th>
                        <th><%=perevodAdmin.get(6)%></th>
                    </thead>
                    <tbody>
                <%
                    if(novosti!=null){
                        for(News n: novosti){
                %>
                        <tr>
                            <td><%=n.getId()%></td>
                            <td><%=n.getTitle()%></td>
                            <td><%=n.getPostDate()%></td>
                            <td><%=n.getLanguageId()==1 ? "English" : "Русский"%></td>
                            <td><a href="/detailsNews?id=<%=n.getId()%>" class="btn btn-primary"><%=perevodAdmin.get(6)%></a></td>
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
    <!-- Modal -->
    <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel"
         aria-hidden="true">
        <div class="modal-dialog modal-lg">
            <div class="modal-content">
                <div class="modal-header">
                    <h1 class="modal-title fs-5" id="exampleModalLabel"><%=perevodAdmin.get(2)%></h1>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    <form action="/addNews" method="post">
                        <div>
                            <label class="col-form-label"><%=perevodAdmin.get(3)%>:</label>
                            <input type="text" class="form-control" name="title">
                        </div>
                        <div>
                            <label class="col-form-label"><%=perevodAdmin.get(7)%>:</label>
                            <textarea class="form-control" rows="5" name="content"></textarea>
                        </div>
                        <div>
                            <label class="col-form-label"><%=perevodAdmin.get(5)%>:</label>
                            <select class="form-control" name="languageId">
                                <option value="1">English</option>
                                <option value="2">Русский</option>
                            </select>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-bs-dismiss="modal"><%=perevodAdmin.get(8)%></button>
                            <button type="submit" class="btn btn-success"><%=perevodAdmin.get(2)%></button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
