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

@WebServlet(value = "/cookie")
public class CookieServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<News> news = DButil.getNews();
        request.setAttribute("novosti", news);

        int lang =1;
        String languageId =request.getParameter("languageId");
        Cookie cookie = new Cookie("yazyk", languageId);
        cookie.setMaxAge(3600 * 24 * 30);
        response.addCookie(cookie);
        request.setAttribute("langId", languageId);

        ArrayList<String> translations = Translation.translations.get(Integer.parseInt(languageId)-1);
        if (languageId.equals("2")) {
            translations = Translation.translations.get(1);
        }
        if (languageId.equals("1")) {
            translations = Translation.translations.get(0);
        }
        request.setAttribute("translations_edited", translations);
        request.getRequestDispatcher("/news.jsp").forward(request, response);
    }


}
