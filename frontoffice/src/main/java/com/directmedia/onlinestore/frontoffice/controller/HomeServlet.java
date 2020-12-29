package com.directmedia.onlinestore.frontoffice.controller;

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

        out.println("OnlineStore, votre boutique multimédia en ligne");
        out.println("<a href=\"http://localhost:8080/frontoffice/catalogue\">Accès au catalogue des oeuvres</a> ");

        out.println("Gestion de catalogue");
        out.println("<a href=\"http://localhost:8080/frontoffice/add-work-form.html\">Ajouter une oeuvre au catalogue</a> ");
        out.println("</body>");
        out.println("</HTML>");

    }
}
