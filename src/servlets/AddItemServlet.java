package servlets;

import db.DBManager;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Item;

import java.io.IOException;
@WebServlet(value = "/addItem")
public class AddItemServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/addItem.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("itemname");
        String price = req.getParameter("itemprice");
        String amount = req.getParameter("itemprice");
        Item item = new Item();
      //  Item.setName(name);
//        Item.setPrice(price);
        DBManager.addItem(item);
        resp.sendRedirect("/");
    }
}
