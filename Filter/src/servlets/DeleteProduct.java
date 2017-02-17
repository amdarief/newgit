package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.domain.Product;
import com.serv.ProductService;

@WebServlet("/delete-product.do")
public class DeleteProduct extends HttpServlet {

	private static final long serialVersionUID = 1L;
	ProductService ps = new ProductService();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ps.deleteProduct(new Product(req.getParameter("product"), req.getParameter("category")));
		resp.sendRedirect("/Filter/list-product.do");
	}
}