package Sprint2_4.servlets;

import Sprint2_4.db.DBManager;
import Sprint2_4.models.Tasks;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "DetailsItemServlet", value = "/detailsTasks")
public class DetailsTaskServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        Tasks task = DBManager.getTasksById(Long.parseLong(id));
        request.setAttribute("task", task);
        request.getRequestDispatcher("/detailsTasks.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
