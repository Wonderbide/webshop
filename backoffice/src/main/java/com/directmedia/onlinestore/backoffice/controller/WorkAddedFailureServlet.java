package com.directmedia.onlinestore.backoffice.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "failure", urlPatterns = "/failure")
public class WorkAddedFailureServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("Oeuvre déjà existante au catalogue");
        out.println("</br><a href=\"/backoffice/home\">Retounez sur la page d'accueil</a>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("Oeuvre déjà existante au catalogue");
        out.println("</br><a href=\"/backoffice/home\">Retounez sur la page d'accueil</a>");
        out.println("</body></html>");
    }
}
