import java.io.IOException;

public class Adjust {
    @Override
protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

            String name = request.getParameter("name");
    String email = request.getParameter("email");


    userDatabase.put(email, name);


    request.setAttribute("name", name);
    request.setAttribute("email", email);
    request.setAttribute("message", "User registered successfully!");


    getServletContext().setAttribute("userDatabase", userDatabase);


    RequestDispatcher dispatcher = request.getRequestDispatcher("userProfile.jsp");
    dispatcher.forward(request, response);
}
}
