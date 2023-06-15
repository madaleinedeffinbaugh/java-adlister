import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "pizzaOrderServlet", value = "/pizza-order")
public class pizzaOrderServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/pizzaOrder.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String size = request.getParameter(("size"));
        String crust = request.getParameter(("crust"));
        String sauce = request.getParameter(("sauce"));
        String pepperoni = request.getParameter(("pepperoni"));
        String olives = request.getParameter(("olives"));
        String greenPeppers = request.getParameter(("greenPeppers"));
        String sausage = request.getParameter(("sausage"));
        String address = request.getParameter(("deliveryAddress"));

        System.out.println("The order:");
        System.out.println("Size: " + size);
        System.out.println("Crust: " + crust);
        System.out.println("Sauce: " + sauce);
        System.out.print("Toppings: ");
        if (pepperoni != null) {
            System.out.print(pepperoni + ", ");
        }
        if (olives != null) {
            System.out.print(olives + ", ");
        }
        if (greenPeppers != null) {
            System.out.print(greenPeppers + ", ");
        }
        if (sausage != null) {
            System.out.print(sausage);
        }

        System.out.println("\nDelivery Address: " + address);

    }
}
