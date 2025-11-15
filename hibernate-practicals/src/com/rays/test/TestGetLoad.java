package com.rays.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.rays.user.UserDTO;

/**
 * Difference between get and load
 * Upon not finding record load will throw objectnotfound exception
 * Upon not finding record get will throw null.
 * @author Nidhi
 *
 */
public class TestGetLoad {
	
	public static void main(String[] args) {
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		
		Session session=sf.openSession();
		
		UserDTO dto=(UserDTO)session.load(UserDTO.class, 30);
		
		//UserDTO dto=(UserDTO)session.get(UserDTO.class,30);
		
		System.out.println(dto);
		
		System.out.println(dto.getId());
		System.out.println("\t"+dto.getFirstName());
		System.out.println("\t"+dto.getLastName());
		System.out.println("\t"+dto.getLoginId());
		System.out.println("\t"+dto.getPassword());
		System.out.println("\t"+dto.getDob());
		System.out.println("\t"+dto.getAddress());
		
	}
}
