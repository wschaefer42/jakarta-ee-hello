package com.example.hello;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        var name = request.getParameter("name");
        var message = String.format("Hello %s", name);
        request.setAttribute("message", message);
        response.setContentType("text/html");
        request.getRequestDispatcher("WEB-INF/jsp/hello.jsp").forward(request, response);
    }
}