

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import customTools.DbBhposts;
import model.Bhpost;

/**
 * Servlet implementation class NewsfeedServlet
 */
@WebServlet("/NewsfeedServlet")
public class NewsfeedServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewsfeedServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		String nextURL="/Newsfeed.jsp";
		response.sendRedirect(request.getContextPath() + nextURL);
		 System.out.println("Using Advanced for loop");
		
		
		
		List<Bhpost> allposts=null;
		allposts=DbBhposts.searchPosts("a");

		 System.out.println("Using Advanced for loop");
	        for (Bhpost s : allposts) {
	            System.out.println(allposts);
	        }
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	        
	        
	}

}
