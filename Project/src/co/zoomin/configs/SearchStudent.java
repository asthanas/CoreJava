package co.zoomin.configs;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.zoomin.domains.Student;

public class SearchStudent {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		
		/*
		Student st = new Student();
		session.load(st, Integer.valueOf(1));
		System.out.println(st);
		*/
		
		Student st = session.get(Student.class, Integer.valueOf(101));
		if(st!=null)
			System.out.println(st);
		else
			System.out.println("No matching student found");
	
		session.close();
		sf.close();
	}

}
