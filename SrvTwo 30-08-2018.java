import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SrvTwo extends HttpServlet {

	/*@Override
	public void do(HttpServlettRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter out = res.getWriter();
		out.print("im in srv two");
		HttpSession session = req.getSession();
		req.setAttribute("a", new Integer(10));
		
	}*/
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		out.print("im in srv two");
		HttpSession session = req.getSession();
		out.print(session.getAttribute("a"));
	}

}
