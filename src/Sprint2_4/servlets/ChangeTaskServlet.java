package Sprint2_4.servlets;

import Sprint2_4.db.DBManager;
import Sprint2_4.models.Tasks;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(value = "/changeTask")
public class ChangeTaskServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("idchange");
        String name = request.getParameter("taskname");
        String description = request.getParameter("taskdescription");
        String date = request.getParameter("taskdate");
        String status = request.getParameter("taskstatus");
        if(name!=null){
            DBManager.changeTaskName((Long.parseLong(id)),name);
        }
        if(description!=null){
            DBManager.changeTaskDescription((Long.parseLong(id)),description);
        }
        if(status!=null){
            DBManager.changeTaskStatus((Long.parseLong(id)),status);
        }
        if(date!=null){
            DBManager.changeTaskDeadline((Long.parseLong(id)),date);
        }
        response.sendRedirect("/");
    }
}
