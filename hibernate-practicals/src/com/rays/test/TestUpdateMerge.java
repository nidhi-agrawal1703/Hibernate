package com.rays.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.rays.user.UserDTO;

/**
 * Difference between update and merge is that 
 * merge will first check db using select query 
 * and if data found different then only will update db.
 * In update data in db will be updated without checking db data.
 * @author Nidhi
 *
 */
public class TestUpdateMerge {
	
	public static void main(String[] args) {
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		
		Session session=sf.openSession();
		
		UserDTO dto=(UserDTO)session.get(UserDTO.class, 1);
		
		session.close();
		
		dto.setFirstName("qqq");
		
		Session session1=sf.openSession();
		
		Transaction tx=session1.beginTransaction();
		
		//session1.merge(dto);
		
		session1.update(dto);
		
		tx.commit();
		
		session1.close();
		
		
	}
}
