import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class PersonServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        request.setAttribute("name", "Peter Nikolaev Zahariev");
        request.setAttribute("age", "35");
        request.setAttribute("work", "Programmer");
        request.getRequestDispatcher("person.jsp").forward(request, response);
    }
}
