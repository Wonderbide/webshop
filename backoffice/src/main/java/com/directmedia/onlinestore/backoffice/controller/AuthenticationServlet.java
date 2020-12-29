package com.directmedia.onlinestore.backoffice.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "login", urlPatterns = "/login")
public class AuthenticationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        if (req.getParameter("userName").equals("michel") &&
                req.getParameter("password").equals("123456")){
            HttpSession session = req.getSession();
            session.setAttribute("userName", req.getParameter("userName"));
            out.println("<html><body>Identifiants Validés <a methode=\"post\" href=\"/backoffice/home.jsp\"> Accédez au back-office</a>");

        }else{
            out.println("<html><body>Identifiants erroné <a href=\"/backoffice/login.html\"> Retourner au login screen </a>");
        }
    }
}
