package co.assignment.configs;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import co.assignment.domains.Students;

public class ListStudent {
	public static void main(String args[]) throws Exception {
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		
		String hql = "from co.assignment.domains.Students";
		
		TypedQuery<Students> q = session.createQuery(hql);
		List<Students> students = q.getResultList();
		
		for(Students st : students) {
			System.out.println(st);
			Thread.sleep(500);
		}
	
		session.close();
		sf.close();
	}

}
