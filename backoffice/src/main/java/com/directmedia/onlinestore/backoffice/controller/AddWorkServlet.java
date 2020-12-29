package com.directmedia.onlinestore.backoffice.controller;


import com.directmedia.onlinestore.core.entity.Artist;
import com.directmedia.onlinestore.core.entity.Catalogue;
import com.directmedia.onlinestore.core.entity.Work;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Add Work", urlPatterns = "/add-work")
public class AddWorkServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String title = req.getParameter("title");
        int release = Integer.parseInt(req.getParameter("release"));
        String genre = req.getParameter("genre");
        String summary = req.getParameter("summary");
        String mainArtiste = req.getParameter("main artiste");

        RequestDispatcher dispatcher;

        Work work = new Work();
        work.setTitle(title);
        work.setRelease(release);
        work.setSummary(summary);
        work.setMainArtist(new Artist(mainArtiste));
        work.setGenre(genre);

        boolean isDuplicate = false;

        for (Work w : Catalogue.listOfWork) {

            if (w.getTitle().equals(title) &&
                    w.getRelease() == release &&
                    w.getMainArtist().getName().equals(mainArtiste)){

                isDuplicate = true;
                break;
            }
        }

        if (isDuplicate){
            dispatcher = req.getRequestDispatcher("/failure");
        }else{

            Catalogue.listOfWork.add(work);
            dispatcher = req.getRequestDispatcher("/work-added");
            req.setAttribute("identifiantOeuvre", work.getId());
        }

        dispatcher.forward(req, resp);



        PrintWriter out = resp.getWriter();

        resp.setContentType("http");
        out.println("<html><body>");
        out.println("Votre ajout a bien été pris en compte");
        out.println("<a href=\"/backoffice/home.jsp\">Retounez sur la page d'accueil</a>");
        out.println("</body></html>");

    }
}
