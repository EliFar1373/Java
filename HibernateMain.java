package come.project;



import org.hibernate.Session;

import org.hibernate.Transaction;
import org.hibernate.SessionFactory;


import come.project.HibernateUtil;
import come.project.HibernateUser;

	public class HibernateMain {

	    public static void main(String[] args) {
	        // Get the SessionFactory from HibernateUtil
	        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	        // Open a new session (unit of work)
	        Session session = sessionFactory.openSession();
	        
	        // Begin a transaction
	        Transaction transaction = session.beginTransaction();

	        // Create a new User object
	        HibernateUser user = new HibernateUser("john_doe2");

	        // Save the user to the database
	        session.save(user);

	        // Commit the transaction to persist changes
	        transaction.commit();

	        // Print out the saved username
	        System.out.println("User saved: " + user.getUsername());

	        // Close the session (end of unit of work)
	        session.close();

	        // Close Hibernate resources (SessionFactory)
	        HibernateUtil.shutdown();
	    }
	}



