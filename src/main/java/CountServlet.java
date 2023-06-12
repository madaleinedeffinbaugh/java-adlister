import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CountServlet", urlPatterns = "/count")
public class CountServlet extends HttpServlet {
    private static int counter = 0;
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        counter++;
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1>You have visited this page "+ counter+" times.</h1>");

    }
}