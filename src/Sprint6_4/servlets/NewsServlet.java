package Sprint6_4.servlets;

import Sprint6_4.db.DButil;
import Sprint6_4.models.News;
import Sprint6_4.models.Translation;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(value = "/news")
public class NewsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        ArrayList<News> news = DButil.getNews();
        request.setAttribute("novosti", news);
        String langId = "1";
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("yazyk")) {
                    langId = c.getValue();
                    break;
                }
            }
        }
        ArrayList<String> trans = Translation.translations.get(Integer.parseInt(langId) - 1);
        if (langId.equals("2")) {
            trans = Translation.translations.get(1);
        }
        if (langId.equals("1")) {
            trans = Translation.translations.get(0);
        }
        //System.out.println("langId in newsservlet: " + langId);
        request.setAttribute("langId", langId);
        request.setAttribute("translations_edited", trans);
        request.getRequestDispatcher("/news.jsp").forward(request, response);
    }

}
