package servlets;



import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.serv.ProductService;

@WebServlet("/list-product.do")
public class ListProductServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private ProductService ps = new ProductService();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.setAttribute("products", ps.getProducts());
		req.getRequestDispatcher("List.jsp").forward(req, resp);
	}
}

