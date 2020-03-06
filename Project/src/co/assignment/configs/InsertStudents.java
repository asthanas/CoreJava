package co.assignment.configs;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import co.assignment.domains.Students;

public class InsertStudents {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("co/assignment/configs/hibernate.cfg.xml");
		
		SessionFactory sfactory = config.buildSessionFactory();
		Session session = sfactory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Students st1 = new Students(101,"raju",32);
		session.save(st1);
		Students st2 = new Students(102,"kaju",40);
		session.save(st2);
		Students st3 = new Students(103,"saju",56);
		session.save(st3);
		Students st4 = new Students(104,"maju",11);
		session.save(st4);
		Students st5 = new Students(105,"paju",32);
		session.save(st5);
		Students st6 = new Students(106,"laju",78);
		session.save(st6);
		Students st7 = new Students(107,"taju",35);
		session.save(st7);
		Students st8 = new Students(108,"eaju",88);
		session.save(st8);
		Students st9 = new Students(109,"zaju",9);
		session.save(st9);
		Students st10 = new Students(110,"maju",35);
		session.save(st10);
	
		System.out.println("-------------------------");
		tx.commit();
		System.out.println("Student saved...");
		session.close();
		sfactory.close();
	}

}
