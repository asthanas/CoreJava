package co.zoomin.configs;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import co.zoomin.domains.Student;

public class InsertStudent {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Scanner sc = new Scanner(System.in);
		
		String req = "Y";
		while(req.equalsIgnoreCase("Y"))
		{
			System.out.println("Enter sname, email, mobile");
			String name = sc.next();
			String email = sc.next();
			String mobile = sc.next();
			Student st = new Student(name,email,mobile);
			
			session.save(st);
			
			System.out.println("Have more Students [Y/N]");
			req = sc.next();
			
		}
		System.out.println("--------------------------");
		tx.commit();
		
		sc.close();
		session.close();
		sf.close();
			
		}
}
