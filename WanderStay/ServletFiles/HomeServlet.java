// 1. Import Required Packages
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 2. Annotation-based Servlet Configuration
@WebServlet("/HelloServlet")
public class HomeServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    //  Handling HTTP GET Request
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Setting response content type
        response.setContentType("text/html");

        // Writing HTML response
        response.getWriter().println("<html>");
        response.getWriter().println("<head><title>HelloServlet</title></head>");
        response.getWriter().println("<body>");
        response.getWriter().println("<h1>Welcome to Wanderstay - GET Request</h1>");
        response.getWriter().println("</body>");
        response.getWriter().println("</html>");
    }

    // Handling HTTP POST Request
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

                String name = request.getParameter("name");

        // Setting response content type
        response.setContentType("text/html");

        response.getWriter().println("<html>");
        response.getWriter().println("<head><title>HelloServlet</title></head>");
        response.getWriter().println("<body>");
        response.getWriter().println("<h1>Welcome to Wanderstay, " + name + " - POST Request</h1>");
        response.getWriter().println("</body>");
        response.getWriter().println("</html>");
    }
}