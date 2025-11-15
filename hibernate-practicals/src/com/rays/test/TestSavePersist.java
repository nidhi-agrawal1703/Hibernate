package com.rays.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.rays.user.UserDTO;

/**
 * Difference between save and persist is that
 * save return type is serializable
 * persist return type is void
 * @author Nidhi
 *
 */
public class TestSavePersist {
	
	public static void main(String[] args) {
		
		UserDTO dto=new UserDTO();
		
		dto.setFirstName("Yash");
		dto.setLastName("Agrawal");
		dto.setLoginId("yash@gmail.com");
		dto.setPassword("123");
		dto.setAddress("Indore");
		dto.setDob(new Date());
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		
		Session session=sf.openSession();
		
		Transaction tx=session.beginTransaction();
		
		session.persist(dto);
		
		//int i=(int)session.save(dto);
				
		tx.commit();
		
		session.close();
		
	}
}
