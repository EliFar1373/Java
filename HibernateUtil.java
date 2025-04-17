package come.project;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	



	    // Initialize the SessionFactory at the time of class loading.
	    private static final SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

	    // Return the SessionFactory instance.
	    public static SessionFactory getSessionFactory() {
	        return sessionFactory;
	    }

	    // Close the SessionFactory (called on application shutdown).
	    public static void shutdown() {
	        getSessionFactory().close();
	    }
	


}
