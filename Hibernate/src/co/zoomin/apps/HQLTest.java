package co.zoomin.apps;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import co.zoomin.domains.Student;

public class HQLTest {
	public static void main(String args[]) throws Exception {
		SessionFactory sf = HibernateUtils.getSessionFactory();
		Session session = sf.openSession();
		
		//String hql = "from co.zoomin.domains.Student";
		//String hql = "from co.zoomin.domains.Student where sname='viraj'";
		//String hql = "from co.zoomin.domains.Student where studid between ?0 and ?1";
		//String hql = "from co.zoomin.domains.Student where studid between :minsid and :maxid";
		//TypedQuery<Student> query = session.createQuery(hql);
		//query.setParameter(0, Integer.valueOf(1));
		//query.setParameter(1, Integer.valueOf(2));
		
		//query.setParameter("minsid", Integer.valueOf(1));
		//query.setParameter("maxid", Integer.valueOf(2));
		
		Transaction tx = session.beginTransaction();
		TypedQuery q = session.createQuery("update co.zoomin.domains.Student set sname=:name where studid=:sid");
		q.setParameter("name", "sonal");
		q.setParameter("sid", 4);
		
		int status=q.executeUpdate();
		if(status>0) {
			System.out.println("Student updated");	
		}else {
			System.out.println("No matching student found");
		}
		
		/*
		List<Student> students = q.getResultList();
		
		for(Student st : students) {
			System.out.println(st);
			Thread.sleep(500);
		}
		*/
		session.close();
		sf.close();
	}

}
