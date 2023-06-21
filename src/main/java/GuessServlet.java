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
        String userMessage = "";
//        Random rand = new Random();
//        int secretNum = rand.nextInt(3) + 1;
        int secretNum = 2;
        if(guess > 0 && guess < 4) {
            if (guess == secretNum) {
                userMessage = "You Won!";
            } else {
                userMessage = "You Lose!";
            }
            response.sendRedirect( "/correct?message=" + userMessage);
        } else {
            response.sendRedirect( "/guess.jsp");
        }




    }
}
