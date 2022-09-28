import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ProductServlet", urlPatterns = "/product/list")
public class ProductServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        Product[] products = {
                new Product(1, "Колбаса", 2.2f),
                new Product(2, "Картошка", 2.2f),
                new Product(3, "Мясо", 2.2f),
                new Product(4, "Рис", 2.2f),
                new Product(5, "Гркчка", 2.2f),
                new Product(6, "Пшено", 2.2f),
                new Product(7, "Капуста", 2.2f),
                new Product(8, "Морковь", 2.2f),
                new Product(9, "Яйца", 2.2f),
                new Product(10, "Сосиськи", 2.2f)};

        resp.addHeader("Content-Type", "text/html;charset=utf-8");

        resp.getWriter().println("<ul>");
        for (Product product : products) {
            resp.getWriter().println("<li>" + product + "</li>");
        }
        resp.getWriter().println("</ul>");
    }
}
