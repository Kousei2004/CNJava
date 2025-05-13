package servlet;

import java.io.IOException;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class CountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String input = request.getParameter("inputString");
        int count = input.length();

        // Lưu kết quả vào request và session
        request.setAttribute("count", count);
        request.setAttribute("input", input);

        HttpSession session = request.getSession();
        session.setAttribute("inputString", input);

        request.getRequestDispatcher("count.jsp").forward(request, response);
    }
}
