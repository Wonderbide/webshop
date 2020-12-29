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

@WebServlet(name="catalogue", urlPatterns = "/catalogue")
public class CatalogueServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        if (Catalogue.listOfWork.isEmpty()) {
            Work work1 = new Work("Les Affranchies");
            Work work2 = new Work("Die Hard 3");
            Work work3 = new Work("Fight Club");

            work1.setRelease(1980);
            work2.setRelease(1992);
            work3.setRelease(1999);

            Catalogue.listOfWork.add(work1);
            Catalogue.listOfWork.add(work2);
            Catalogue.listOfWork.add(work3);

        }

        out.println("<HTML>");
        out.println("<body>");

        for (Work iWork : Catalogue.listOfWork) {
            out.println("<a href=\"http://localhost:8080/frontoffice/work-details?id="+iWork.getId()+"\">" + iWork.getTitle() +"</a>");
            out.println(" (" + iWork.getRelease() + ")");
        }
        out.println("</body>");
        out.println("</HTML>");
    }
}
