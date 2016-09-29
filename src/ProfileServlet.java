

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import customTools.DBUser;
import customTools.DbBhposts;
import model.Bhpost;
import model.Bhuser;

/**
 * Servlet implementation class ProfileServlet
 */
@WebServlet("/ProfileServlet")
public class ProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProfileServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String nextURL="/Profile.jsp";
		
		response.sendRedirect(request.getContextPath() + nextURL);
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nextURL;
		String updatedname=request.getParameter("name");
		String updatedemail=request.getParameter("email");
		String updatedmotto=request.getParameter("motto");
		String updatedpassword=request.getParameter("password");
		
		
		
		HttpSession session = request.getSession();
		
		Bhuser upadteduser= (Bhuser) session.getAttribute("user");
		
		upadteduser.setUsername(updatedname);
		upadteduser.setUseremail(updatedemail);
		upadteduser.setUserpassword(updatedpassword);
		upadteduser.setMotto(updatedmotto);
	
		System.out.println("BullHorn User detail Update");
		DBUser.update(upadteduser);
		nextURL="/Profile.jsp";
		response.sendRedirect(request.getContextPath() + nextURL);
		
		
	}

}
