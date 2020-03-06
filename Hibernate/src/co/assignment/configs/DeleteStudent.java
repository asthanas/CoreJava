package co.assignment.configs;

import javax.persistence.TypedQuery;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import co.assignment.configs.HibernateUtils;

public class DeleteStudent {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
	
			String hql = "delete from co.assignment.domains.Students where marks <=35";
			TypedQuery q = session.createQuery(hql);
			
			int status=q.executeUpdate();
			if(status>0) {
				System.out.println("Student updated");	
			}else {
				System.out.println("No matching student found");
			}	
			
			session.close();
			sf.close();
	}
}
