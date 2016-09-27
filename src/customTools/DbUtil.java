

package customTools;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


@SuppressWarnings("unused")
public class DbUtil {
	private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("Bullhorn");
	public static EntityManagerFactory getEmFactory(){
		return emf;
	}

}
