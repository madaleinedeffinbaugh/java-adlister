import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CounterServlet", urlPatterns = "/count")
public class CounterServlet extends HttpServlet {
    private static int counter = 0;
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        counter++;
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String inputName = req.getParameter("resetCounter");
        if(inputName != null) {
            counter =0;
        }
        out.println("<h1>You have visited this page "+ counter+" times.</h1>");


    }
}