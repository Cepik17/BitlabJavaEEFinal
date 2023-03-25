<%@ page import="java.util.ArrayList" %>
<%@ page import="Sprint6_4.models.News" %>
<%@ page import="Sprint6_4.models.Translation" %><%--
  Created by IntelliJ IDEA.
  User: Serik.Taganbergenov
  Date: 19.03.2023
  Time: 11:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
     <title>NEWS</title>
    <%@include file="source.jsp"%>
</head>
<%
    ArrayList<News> novosti = (ArrayList<News>) request.getAttribute("novosti");
    String langId =(String)request.getAttribute("langId");
//    System.out.println("langId in jsp first: " + langId);

    ArrayList<String> perevod = (ArrayList<String>) request.getAttribute("translations_edited");

    if (perevod == null) {
        perevod = Translation.translations.get(0);
       // System.out.println("perevod in jsp eng: " + perevod);
    }
%>
<body>
    <div class="container py-3">
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
                                    <a class="nav-link" href="/admin?langId=<%=Integer.parseInt(langId)%>"><%=perevod.get(0)%></a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="/cookie?languageId=2">РУС</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="/cookie?languageId=1">ENG</a>
                                </li>
                            </ul>
                        </div>
                </div>
            </nav>
        </header>
        <div class="row mt-5">
                <div class="col-sm-12">
                    <%
                        if(novosti!=null){
                            for(News n: novosti){
                    %>
                    <h3><%=n.getTitle()%></h3>
                    <p><%=n.getContent()%></p>
                    <p><b><%=perevod.get(1)%>: <%=n.getPostDate()%></b></p>
                    <%
                            }
                        }
                    %>
                </div>
        </div>
    </div>
</body>
</html>
