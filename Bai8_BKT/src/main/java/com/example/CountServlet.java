package com.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/count")
public class CountServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        String inputString = request.getParameter("inputString");
        int count = inputString.length();
        
        // Store in request scope for JSP
        request.setAttribute("inputString", inputString);
        request.setAttribute("count", count);
        
        // Store in session for listener
        HttpSession session = request.getSession();
        session.setAttribute("inputString", inputString);
        
        // Forward to JSP
        request.getRequestDispatcher("count.jsp").forward(request, response);
    }
} 