package filter;

import java.io.IOException;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class InputFilter implements Filter {
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        String input = request.getParameter("inputString");
        if (input == null || input.trim().isEmpty()) {
            ((HttpServletResponse) response).sendRedirect("count.jsp");
        } else {
            chain.doFilter(request, response);
        }
    }

    public void init(FilterConfig filterConfig) {}
    public void destroy() {}
}
