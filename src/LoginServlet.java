

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import validation.Userdetails;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nextURL;
		validation.Userdetails ud =new validation.Userdetails();
		
		
		
		response.setContentType("text/html");
		 String username=request.getParameter("username");
		 String password=request.getParameter("password");
		 ud.setUsername(username);
		 ud.setPassword(password);
		 
	     // PrintWriter out = response.getWriter();
	     
	    
	  	if(ud.isValidUser()){
	  		HttpSession session = request.getSession();
	    	session.setAttribute("user",ud) ;

	    	
	    	 nextURL="/OutputDisplay.jsp";
	    	
	    	
	    	
	    	}
	    else{
	    	
	        
	    	nextURL = "/LoginPage.html";
	    }
	  	response.sendRedirect(request.getContextPath() + nextURL);
	}

}
