import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ClaseServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");
		response(resp, "login action");
		//resp.sendRedirect("/firts-jee/login");
//		ServletContext web1 = getServletContext();
//		ServletContext web2 = web1.getContext("/firts-jee");
//		RequestDispatcher requestDispatcher =web2.getRequestDispatcher("/login");
//		requestDispatcher.forward(req, resp);
	}

	private void response(HttpServletResponse resp, String msg)
			throws IOException {
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<t1>" + msg + "</t1>");
		out.println("</br>");
		out.println("<a href='login.html'>");
		out.println("Mais logins");
		out.println("</a>");
		out.println("</body>");
		out.println("</html>");
	}
}
