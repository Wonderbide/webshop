package com.directmedia.onlinestore.backoffice.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet (name="home",urlPatterns = "/home")
public class HomeServlet extends HttpServlet {


    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        out.println("<HTML>");
        out.println("<body>");

        if(req.getSession().isNew()) {
            out.println("<h1>bonjour utilisateur " + "NOBODY" + "</h1></br>");
        }else{
            out.println("<h1>bonjour utilisateur " + req.getSession().getAttribute("userName") +
                        " ("+"<a href=\"/backoffice/logout\">Déconnexion</a> "+")"+
                        "</h1>" +
                        "</br>");
        }

        out.println("OnlineStore, votre boutique multimédia en ligne");
        out.println("<a href=\"/backoffice/catalogue.jsp\">Accès au catalogue des oeuvres</a> ");

        out.println("Gestion de catalogue");

        if (req.getSession().isNew())
            out.println("<a href=\"/backoffice/login.html\">Ajouter une oeuvre au catalogue</a> ");
        else
            out.println("<a href=\"/backoffice/add-work-form.html\">Ajouter une oeuvre au catalogue</a> ");

        out.println("</body>");
        out.println("</HTML>");

    }
}
