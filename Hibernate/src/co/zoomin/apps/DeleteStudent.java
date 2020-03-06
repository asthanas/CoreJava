package co.zoomin.apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import co.zoomin.domains.Student;

public class DeleteStudent {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Student st = session.get(Student.class, Integer.valueOf(5));
		
		if(st != null) {
			System.out.println(st);
			session.delete(st);
			}
		else {
			System.out.println("No Matching Student found");
		}
		session.getTransaction().commit();
		session.close();
		sf.close();
	}	
}
