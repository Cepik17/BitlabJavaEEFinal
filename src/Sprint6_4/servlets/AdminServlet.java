package Sprint6_4.servlets;

import Sprint6_4.db.DButil;
import Sprint6_4.models.News;
import Sprint6_4.models.Translation;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

@WebServlet(value = "/admin")
public class AdminServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<News> news = DButil.getNews();
        request.setAttribute("novosti", news);
        String langId = request.getParameter("langId");
        System.out.println("langid from home in adminservlet: " + langId );
        Cookie[] cookies = request.getCookies();
        if (langId==null) {
            if (cookies != null) {
                for (Cookie c : cookies) {
                    if (!c.getName().equals("yazyk")) {
                        Cookie cookie = new Cookie("yazyk", "1");
                        cookie.setMaxAge(3600 * 24 * 30);
                        response.addCookie(cookie);
                    } else {
                        langId = c.getValue();
                    }
                }
            } else {
                Cookie cookie = new Cookie("yazyk", "1");
                cookie.setMaxAge(3600 * 24 * 30);
                response.addCookie(cookie);
            }
        }
        System.out.println("c " + cookies.length);
        System.out.println("langid in adminservlet: " + langId);
        ArrayList<String> trans = Translation.translations.get(Integer.parseInt(langId) - 1);
        if (langId.equals("2")) {
            trans = Translation.translations.get(1);
        } else if (langId.equals("1")) {
            trans = Translation.translations.get(0);
        }
        request.setAttribute("langIdAdmin", langId);
        request.setAttribute("trans_admin", trans);
        request.getRequestDispatcher("/admin.jsp").forward(request, response);
    }
}






