import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "AdsServlet", value = "/ads")
public class AdsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ListAdsDao listAdsDao = (ListAdsDao) DaoFactory.getAdsDao();
        List<Ad> adsList = listAdsDao.all();
        request.setAttribute("adsList", adsList);
        request.getRequestDispatcher("ads/index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
