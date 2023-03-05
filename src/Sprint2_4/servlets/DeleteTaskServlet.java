package Sprint2_4.servlets;

import Sprint2_4.db.DBManager;
import Sprint2_4.models.Tasks;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(value = "/deleteTask")
public class DeleteTaskServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("iddelete");
        DBManager.deleteTask(Long.parseLong(id));
        response.sendRedirect("/");
    }
}
