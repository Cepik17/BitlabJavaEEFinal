package servlets;

import db.DBManager;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Item;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(value = "/home")
public class HomeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        PrintWriter out = response.getWriter();
//        for (int i = 0; i < 11; i++) {
//            out.print("<h1>HELLO BITLAB</h1>");
//        }
//        List<User> users = new ArrayList<>();
//        users.add(new User("Kuat","Qwert", "IT", 4000));
//        users.add(new User("Aybek","Bagit", "Managment", 5000));
//        users.add(new User("Alibek","Serikov", "HR", 4500));
//        users.add(new User("Asel","Ahmetova", "FD", 4000));
//        users.add(new User("Serik","Berikov", "IT", 3000));
//        out.print("<table>");
//        out.print("<thead style=background-color:grey>");
//        out.print("<th>Name</th>");
//        out.print("<th>Surname</th>");
//        out.print("<th>Department</th>");
//        out.print("<th>Salary</th>");
//        out.print("<tbody>");
//        for (User user : users) {
//            out.print("<tr>");
//            out.print("<td>"+user.getName()+"</td>");
//            out.print("<td>"+user.getSurname()+"</td>");
//            out.print("<td>"+user.getDepartment()+"</td>");
//            out.print("<td>"+user.getSalary()+"</td>");
//            out.print("</tr>");
//        }
//        out.print("</tbody>");
//        out.print("</thead>");
//        out.print("</table>");
//        out.print("<div>");
//        out.print("<form action='/second' metod='get'>");
//        out.print("<div>");
//        out.print("<h5>NAME:</h5>");
//        out.print("<input type=text name='name'>");
//        out.print("<h5>SURNAME:</h5>");
//        out.print("<input type=text name='surname'>");
//        out.print("<button>SEND</button>");
//        out.print("</div>");
//        out.print("</div>");
        List<Item> items =  DBManager.getItems();
        request.setAttribute("items", items);
        request.getRequestDispatcher("/home.jsp").forward(request, response);



    }
}