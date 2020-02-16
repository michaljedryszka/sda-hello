package pl.sda.java.jsp.sevlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
        String pierwszePole = request.getParameter("pierwsze");
        String drugiePole = request.getParameter("drugie");
        int trzeciePole = Integer.valueOf(pierwszePole) + Integer.valueOf(drugiePole);

        request.setAttribute("pierwszePole", pierwszePole);
        request.setAttribute("drugiePole", drugiePole);
        request.setAttribute("trzeciePole", trzeciePole);

        request.getRequestDispatcher("WEB-INF/jsp/hello.jsp")
                .forward(request, response);
    }
}