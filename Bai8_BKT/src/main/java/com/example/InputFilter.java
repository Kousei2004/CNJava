package com.example;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter("/count")
public class InputFilter implements Filter {
    
    public void init(FilterConfig filterConfig) throws ServletException {
    }
    
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        
        if ("POST".equalsIgnoreCase(httpRequest.getMethod())) {
            String inputString = request.getParameter("inputString");
            
            if (inputString == null || inputString.trim().isEmpty()) {
                httpResponse.sendRedirect("count.jsp");
                return;
            }
        }
        
        chain.doFilter(request, response);
    }
    
    public void destroy() {
    }
} 