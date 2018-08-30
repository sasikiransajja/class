import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SrvOne extends HttpServlet{

	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter out = res.getWriter();
		out.print("im in srv one");
		/*RequestDispatcher rd= req.getRequestDispatcher("srvtwo");
		rd.forward(req, res);
		
		ServletContext cxt=getServletContext();
		cxt.getRequestDispatcher("");
		 
		
		RequestDispatcher rd1= getServletContext().getNamedDispatcher("Srvtwo");
		rd.forward(req, res);
	
		res.sendRedirect("https://google.com?falg=true");*/
		
		HttpSession session = req.getSession();
		session.setAttribute("a", new Integer(10));
		
		session.setAttribute("count", new Integer(1));
		
		
		out.print("id"+session.getCreationTime());
		out.print("id"+session.getId());
		out.print("id"+session.getLastAccessedTime());
	
	}

}
