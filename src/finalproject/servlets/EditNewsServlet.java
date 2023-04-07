package finalproject.servlets;

import finalproject.db.DBM;
import finalproject.models.Language;
import finalproject.models.News;
import finalproject.models.NewsCategory;
import finalproject.models.NewsContent;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(value = "/editnews")
public class EditNewsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int newsId = Integer.parseInt(request.getParameter("newsId"));
        News news = DBM.getNewsById(newsId);
        Language lang = DBM.getLanguageByNewsId(newsId);
        request.setAttribute("languagecode",lang.getCode());
        request.setAttribute("news",news);
        request.getRequestDispatcher("/editnews.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String title = request.getParameter("new_title");
        String content = request.getParameter("new_content");
//        int newCategoryId = Integer.parseInt(request.getParameter("new_category"));
        String language  =request.getParameter("new_languageId");
//        News news = new News();
//        news.setId(id);
//        NewsCategory newsCategory = new NewsCategory();
//        newsCategory.setId(newCategoryId);
//        news.setCategoryId(newsCategory);;
//        NewsContent newsContent = new NewsContent();
//        newsContent.

//        Integer categoryId = Integer.parseInt(req.getParameter("categoryId"));
//        Integer newsId = Integer.parseInt(req.getParameter("id"));
      //  String title = req.getParameter("title");
        //String content = req.getParameter("content");
        //String languageId = req.getParameter("languageId");

        NewsContent newsContent = new NewsContent();
        newsContent.setTitle(title);
        newsContent.setContent(content);
       // newsContent.setLanguageId(Integer.parseInt(language));
        newsContent.setId(id);

        DBM.editNewsContent(newsContent);
        response.sendRedirect("/editnews");
    }
}
