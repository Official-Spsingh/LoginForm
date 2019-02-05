

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class submitData
 */
@WebServlet("/submitData")
public class submitData extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static String user;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	
	user=request.getParameter("uname");
	String pwd=request.getParameter("pass");
	if(pwd.equals("spsingh")){  
        RequestDispatcher rd=request.getRequestDispatcher("/welcome.jsp");  
        rd.forward(request, response);  
    }  
    else{  
    	 out.write("<h1 style='color:red;top:70%'>Password Error !!!</h1>");
        RequestDispatcher rd=request.getRequestDispatcher("/index.html");  
       
        rd.include(request, response);  
                      
        }  

 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
