import static org.junit.Assert.*;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import org.junit.Test;

import customTools.DbBhposts;
import customTools.DbUtil;
import model.Bhpost;
import model.Bhuser;



@SuppressWarnings("unused")
public class InsertPostTest {

	@Test
	public void test() {
		//String nextURL= "/error.jsp";
		Date postdate = new Date();
		EntityManager em =DbUtil.getEmFactory().createEntityManager();
		String query ="select u from Bhuser u where u.useremail=:email";
		TypedQuery<Bhuser> q =em.createQuery(query,Bhuser.class);
		q.setParameter("email", "user1@domain.com");
		
		Bhuser bhuser =null;
		try {
			bhuser=q.getSingleResult();
			System.out.println("The userid: "+ bhuser.getBhuserid());
			
		}catch (NoResultException e){
			System.out.println(e);
		}finally {
			em.close();
		}
		
		System.out.println("Inserting into the table");
		Bhpost bhPost= new Bhpost();
		bhPost.setBhuser(bhuser);
		bhPost.setPostdate(postdate);
		bhPost.setPosttext("This is a unit test");
		
		System.out.println("BullHorn Insert");
		DbBhposts.insert(bhPost);
		
	}

}
