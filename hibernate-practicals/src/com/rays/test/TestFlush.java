package com.rays.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.rays.user.UserDTO;

/**
 * Flush 
 * Hibernate usually doesn't run the query before commit stmt
 * Flush forces hibernate to commit the pending changes in session to database.
 * Flush will force hibernate to commit session.save() written before it,before executing
 *  any other code written between session.flush() and tx.commit().
 * @author Nidhi
 *
 */
public class TestFlush {
	
	public static void main(String[] args) {
		
		UserDTO dto=new UserDTO();
		
		dto.setFirstName("aaa");
		dto.setLastName("aaa");
		dto.setLoginId("aaa@gmail.com");
		dto.setPassword("123");
		dto.setDob(new Date());
		dto.setAddress("indore");

		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		
		Session session=sf.openSession();
		
		Transaction tx=session.beginTransaction();
		
		session.save(dto);
		
		session.flush();
		
		System.out.println("id = " + dto.getId());

		dto = (UserDTO) session.get(UserDTO.class, 2);

		System.out.println("first name = " + dto.getFirstName());
		
		tx.commit();
		
		session.close();
	}
}
