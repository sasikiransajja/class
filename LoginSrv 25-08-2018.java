import java.io.IOException;
import java.io.PrintWriter;
import java.util.UUID;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LoginSrv implements Servlet{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		int num1=Integer.parseInt(req.getParameter("n1"));
		int num2=Integer.parseInt(req.getParameter("n2"));
		String opt=req.getParameter("opt");
		PrintWriter out = resp.getWriter();
		switch(opt)
		{
		case "Add":
			out.print("add : "+(num1+num2));break;			
		case "Sub" :
			out.print("sub : "+(num1-num2));break;			
		case "Mul" :
			out.print("mul : "+(num1*num2));break;
		case "Div" :
			out.print("div : "+(num1/num2));break;
		}
		
	
		out.print("<a href='http://localhost:9090/HelloSrv/Srv?l'>Go to Home </a>");
	}
	
}
