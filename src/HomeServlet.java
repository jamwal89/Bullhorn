

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import customTools.DbBhposts;
import model.Bhpost;

/**
 * Servlet implementation class Home
 */
@WebServlet("/HomeServlet")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeServlet() {
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
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		Date postdate = new Date();
		response.setContentType("text/html");
		
		model.Bhuser  user = (model.Bhuser) session.getAttribute("user");
		//String username=user.getUsername();
				
				
				
		
		String userpost=request.getParameter("posttext");
		Bhpost bhPost= new Bhpost();
		
		bhPost.setBhuser(user);
		bhPost.setPostdate(postdate);
		bhPost.setPosttext(userpost);
		System.out.println("BullHorn Insert");
		DbBhposts.insert(bhPost);
	
	}

}
