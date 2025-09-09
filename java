package com.example;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

public class RegistrationServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Here, you would typically save the user data to a database.
        // For this example, we'll just set an attribute and forward to JSP.

        request.setAttribute("message", "Registration successful for " + username + "!");
        RequestDispatcher dispatcher = request.getRequestDispatcher("registration.jsp");
        dispatcher.forward(request, response);
    }
}
