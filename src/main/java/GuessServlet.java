import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Random;

@WebServlet(name = "GuessServlet", value = "/guess")
public class GuessServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/guess.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int guess = Integer.parseInt(request.getParameter("userGuess"));
        Random rand = new Random();
//        int secretNum = rand.nextInt(3) + 1;
        int secretNum = 2;
        if (guess == secretNum) {
            response.sendRedirect( "/correct?message=correct");
        } else {
            response.sendRedirect("/incorrect?message=incorrect");
        }


    }
}
