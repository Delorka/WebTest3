package larisasviridova;
/*http://localhost:8080/Servlet2?name=Anton*/
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet2", urlPatterns = {"/"})
public class Servlet2 extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer c;
        Integer a = Integer.valueOf(request.getParameter("a"));
        Integer b = Integer.valueOf(request.getParameter("b"));
        c = a + a + b + b;
        request.setAttribute("c",c);
        this.getServletContext().getRequestDispatcher("/index.jsp").forward(request,response);
        }
}
