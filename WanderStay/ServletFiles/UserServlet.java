public class Registration {

    import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;


@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    // In-memory user database
    private Map<String, String> userDatabase = new HashMap<>();

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Setting response content type
        response.setContentType("text/html");

        // Display user registration form
        response.getWriter().println("<html>");
        response.getWriter().println("<head><title>User Registration</title></head>");
        response.getWriter().println("<body>");
        response.getWriter().println("<h1>User Registration Form</h1>");
        response.getWriter().println("<form method='POST' action='UserServlet'>");
        response.getWriter().println("Name: <input type='text' name='name' required><br>");
        response.getWriter().println("Email: <input type='email' name='email' required><br>");
        response.getWriter().println("<input type='submit' value='Register'>");
        response.getWriter().println("</form>");
        response.getWriter().println("</body>");
        response.getWriter().println("</html>");
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve form data
        String name = request.getParameter("name");
        String email = request.getParameter("email");

        // Store user data in the in-memory database
        userDatabase.put(email, name);

        // Setting response content type
        response.setContentType("text/html");

        // Display user profile
        response.getWriter().println("<html>");
        response.getWriter().println("<head><title>User Profile</title></head>");
        response.getWriter().println("<body>");
        response.getWriter().println("<h1>User Profile</h1>");
        response.getWriter().println("<p>Name: " + name + "</p>");
        response.getWriter().println("<p>Email: " + email + "</p>");
        response.getWriter().println("<a href='UserServlet'>Register Another User</a>");
        response.getWriter().println("</body>");
        response.getWriter().println("</html>");
    }
}
}
