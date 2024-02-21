package com.example.formauthtest;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class Customer extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        if (request.isUserInRole("customer")){
            response.getWriter().write("<html><body><h1>welcome to customer page</h1></body></html>");
        }else {
            request.getRequestDispatcher("/errorPage").forward(request, response);
        }
    }
}
