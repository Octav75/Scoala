package registration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/registration")
public class Registration extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String first_name = request.getParameter("first_name");
        String last_name = request.getParameter("last_name");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String address = request.getParameter("address");
        String contact = request.getParameter("contact");

        if (first_name.isEmpty() || last_name.isEmpty() || username.isEmpty() ||
                password.isEmpty() || address.isEmpty() || contact.isEmpty()) {
            RequestDispatcher req = request.getRequestDispatcher("registration.jsp");
            request.getSession().setAttribute("error", "All fields are required!");
            req.include(request, response);
        } else {
            RequestDispatcher req = request.getRequestDispatcher("registration_complete.jsp");
            req.forward(request, response);
        }
    }
}