package com.directmedia.onlinestore.frontoffice.controller;

import com.directmedia.onlinestore.core.entity.Catalogue;
import com.directmedia.onlinestore.core.entity.ShoppingCart;
import com.directmedia.onlinestore.core.entity.Work;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "cart", urlPatterns = "/addToCart")
public class addToCartServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String workId = req.getParameter("workId");
        HttpSession session = req.getSession();
        ShoppingCart cart = null;
        PrintWriter out = resp.getWriter();

        for (Work work: Catalogue.listOfWork) {
            if (work.getId() == Long.parseLong(workId)){
                if (session.getAttribute("cart")==null)
                    cart = new ShoppingCart();
                else
                    cart = (ShoppingCart) session.getAttribute("cart");

                cart.addItem(work);
                out.println("<HTML>");
                out.println("<body>");
                out.println("Oeuvre ajoutée à votre caddie ("+cart.getSize()+")");
                out.println("</br><a href=\"http://localhost:8080/frontoffice/home\">Retourner à la page principale</a> ");
                out.println("</body>");
                out.println("</HTML>");
                session.setAttribute("cart",cart);
                break;
            }
        }
        session.setAttribute("cart",cart);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {



    }
}
