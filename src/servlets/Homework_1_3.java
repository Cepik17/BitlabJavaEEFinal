package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class Homework_1_3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.print("<div>");
        out.print("<form action='/second' metod='get'>");
        out.print("<div>");
        out.print("<h5>NAME:</h5>");
        out.print("<input type=text name='name'>");
        out.print("<h5>SURNAME:</h5>");
        out.print("<input type=text name='surname'>");
        out.print("<button>SEND</button>");
        out.print("</div>");
        out.print("</div>");
    }
}
