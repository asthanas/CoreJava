package co.assignment.configs;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import co.assignment.domains.Students;

public class UpdateStudent {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Students st = session.get(Students.class, Integer.valueOf(103));
		if(st != null) {
			System.out.println(st);
			st.setMarks(99);
		}
		else {
			System.out.println("No matching object is found");
		}
		session.getTransaction().commit();
		session.close();
		sf.close();
		
	}

}
