package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.domain.Product;
import com.serv.ProductService;
@WebServlet("/update-product.do")
public class UpdateProductServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private ProductService ps = new ProductService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int index = ps.getProducts().indexOf(new Product(request.getParameter("productname"), request.getParameter("productcategory")));
		request.setAttribute("index", String.valueOf(index));
		request.getRequestDispatcher("update.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int index = Integer.parseInt(request.getParameter("index").replaceAll("[^0-9]+", ""));
		Product product = new Product(request.getParameter("product"), request.getParameter("category"));
		ps.updateProduct(index, product);
		response.sendRedirect("/Filter/list-product.do");
	}
}