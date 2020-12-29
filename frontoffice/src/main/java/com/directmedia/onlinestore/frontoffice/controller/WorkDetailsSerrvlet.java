package com.directmedia.onlinestore.frontoffice.controller;


import com.directmedia.onlinestore.core.entity.Catalogue;
import com.directmedia.onlinestore.core.entity.Work;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "work details", urlPatterns = "/work-details")
public class WorkDetailsSerrvlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        long workId = Long.parseLong(req.getParameter("id"));
        PrintWriter out = resp.getWriter();

        out.println("<html><body>");
        for (Work i : Catalogue.listOfWork) {
            if (i.getId() == workId) {
                out.println(i.getTitle()+"</br>");
                out.println(i.getMainArtist()+"</br>");
                out.println(i.getRelease()+"</br>");
                out.println(i.getGenre()+"</br>");
                out.println(i.getSummary()+"</br>");
                out.println(i.getId()+"</br>");

            }
        }
        out.println("<form method=\"post\" action=\"/frontoffice/addToCart\">" +
                        "<input type=\"hidden\" name=\"workId\" value=\""+Long.parseLong(req.getParameter("id"))+"\"/> " +
                        "<input type=\"submit\" value=\"Ajouter\">" +
                    "</form>");
        out.println("</html></body>");
    }
}
