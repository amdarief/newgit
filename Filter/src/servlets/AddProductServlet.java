package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.domain.Product;
import com.serv.ProductService;

@WebServlet("/AddProductServlet.do")
public class AddProductServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private ProductService ps = new ProductService();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("Add.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String newProduct = req.getParameter("product");
		String category = req.getParameter("category");
		
		ps.addProduct(new Product(newProduct, category));
		resp.sendRedirect("/Filter/list-product.do");
	}
}