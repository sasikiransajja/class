import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Enumeration;
import java.util.Map;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstSrv  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		process(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		process(req, resp);
	}
	
	
	
	
	public void process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String method = req.getMethod();
			
		PrintWriter out = resp.getWriter();
		ServletOutputStream output = resp.getOutputStream();
		Date d = new Date();
		out.print("Welcome to Servlets");
		out.print("Date ---"+d);
		out.print("Method---"+method);
		out.print("RequestURL---"+req.getRequestURL());
		out.print("RequestURI---"+req.getRequestURI());
		out.print("QueryString---"+req.getQueryString());
		out.print("ServerPort---"+req.getServerPort());
		out.print("ServerPort---"+req.getScheme());
		
		
		
		System.out.println("Im in service");
		
	}
}