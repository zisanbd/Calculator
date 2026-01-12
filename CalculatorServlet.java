import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calculate")
public class CalculatorServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {

        double num1 = Double.parseDouble(request.getParameter("num1"));
        double num2 = Double.parseDouble(request.getParameter("num2"));
        String op = request.getParameter("operation");

        double result = 0;

        if (op.equals("add")) result = num1 + num2;
        else if (op.equals("sub")) result = num1 - num2;
        else if (op.equals("mul")) result = num1 * num2;
        else if (op.equals("div")) result = num1 / num2;

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Result: " + result + "</h2>");
        out.println("<a href='index.html'>Back</a>");
        out.println("</body></html>");
    }
}
