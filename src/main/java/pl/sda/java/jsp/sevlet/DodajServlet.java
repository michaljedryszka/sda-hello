package pl.sda.java.jsp.sevlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DodajServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String sum1 = req.getParameter("sum1");
        String sum2 = req.getParameter("sum2");
        resp.getWriter().print(Integer.valueOf(sum1) + Integer.valueOf(sum2));
    }
}
