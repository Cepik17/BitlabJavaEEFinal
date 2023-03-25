package Sprint6_4.servlets;

import Sprint6_4.db.DButil;
import Sprint6_4.models.News;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@WebServlet(value = "/addNews")
public class AddNewsServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        int languageId = Integer.parseInt(request.getParameter("languageId"));
        News novost = new News(title,content,languageId);
        DButil.addNews(novost);
        response.sendRedirect("/admin");
    }
}
