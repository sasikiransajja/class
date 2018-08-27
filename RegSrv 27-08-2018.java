import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class RegSrv extends GenericServlet {

	Statement stmt = null;
	Connection con =null;
	PrintWriter out=null;
	PreparedStatement prstmt = null;
	ServletConfig gconfig;
	@Override
	public void init(ServletConfig config) throws ServletException {

		try {
			String name = config.getInitParameter("uname");
			String pwd = config.getInitParameter("pwd");
				ServletContext servletContext = config.getServletContext();
				String uname=servletContext.getInitParameter("uname");
				
				servletContext.setAttribute("x", "1234");
				
				String x=(String) servletContext.getAttribute("x");
				servletContext.setAttribute("x", "p12345");
				
				  x=(String) servletContext.getAttribute("s");
				  
				  
		DriverManager.registerDriver( new oracle.jdbc.OracleDriver());
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",name,pwd);
		stmt = con.createStatement();
		System.out.println("done");
		gconfig=config;
		super.init(config);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException
	{
		ServletConfig servletConfig = getServletConfig();
		gets
		
		out=resp.getWriter();
	
		
	}
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


}
