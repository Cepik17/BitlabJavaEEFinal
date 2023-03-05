package Sprint2_4.servlets;

import Sprint2_4.db.DBManager;
import Sprint2_4.models.Tasks;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name= "AddTaskServlet", value = "/addTask")
public class AddTaskServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/addTask.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("taskname");
        String description = request.getParameter("taskdescription");
        String date = request.getParameter("taskdate");
        Tasks task = new Tasks();
        task.setName(name);
        task.setDescription(description);
        task.setDeadlineDate(date);
        DBManager.addTask(task);
        response.sendRedirect("/");
    }
}
