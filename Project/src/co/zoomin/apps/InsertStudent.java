package co.zoomin.apps;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.zoomin.domains.Student;

public class InsertStudent {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("co/zoomin/configs/hibernate.cfg.xml");
		
		SessionFactory sfactory = config.buildSessionFactory();
		Session session = sfactory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Student st = new Student(101,"Saurabh","iamsaurabhasthana@gmail.com","9766952316");
		session.save(st);
		System.out.println("-------------------------");
		
		tx.commit();
		System.out.println("Student saved...");
		session.close();
		sfactory.close();
	}

}
