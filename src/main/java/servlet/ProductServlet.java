package servlet;

import model.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet(name = "ProductHttpServlet", urlPatterns = "/product")
public class ProductServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("product", getProduct());
        getServletContext().getRequestDispatcher("/product.jsp").forward(req,resp);
    }



    private Product getProduct (){

        List<Product> products = Arrays.asList(

                new Product("1", "apple", 1, null),
                new Product("2", "apple", 1,null),
                new Product("3", "apple", 1,null),
                new Product("3", "apple", 1,null),
                new Product("4", "apple", 1,null),
                new Product("5", "apple", 1,null),
                new Product("6", "apple", 1,null),
                new Product("7", "apple", 1,null),
                new Product("8", "apple", 1,null),
                new Product("9", "apple", 1,null),
                new Product("10", "apple", 1,null)

        );
        return new Product("1", "Apple", 100, products);
    }



}
