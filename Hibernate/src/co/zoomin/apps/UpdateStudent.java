package co.zoomin.apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import co.zoomin.domains.Student;

public class UpdateStudent {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
        
		/*
		Student st = new Student(3,"viraj","viraj@gmail.com","998899877");
		session.update(st);
		*/
		
		Student st = session.get(Student.class, Integer.valueOf(3));
		if(st != null) {
			System.out.println(st);
			st.setEmail("virajasthana@gmail.com");
		}
		else {
			System.out.println("No matching object is found");
		}
		session.getTransaction().commit();
		session.close();
		sf.close();
	}

}
