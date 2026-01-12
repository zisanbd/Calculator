import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CalculatorServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        double num1 = Double.parseDouble(request.getParameter("num1"));
        double num2 = Double.parseDouble(request.getParameter("num2"));
        String op = request.getParameter("operation");

        double result = 0;

        switch (op) {
            case "add": result = num1 + num2; break;
            case "sub": result = num1 - num2; break;
            case "mul": result = num1 * num2; break;
            case "div": result = num1 / num2; break;
        }

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h2>Result: " + result + "</h2>");
        out.println("<a href='index.html'>Back</a>");
    }
}
