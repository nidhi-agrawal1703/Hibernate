package com.rays.junit;

import org.junit.Test;

import junit.framework.TestCase;

public class TestUserAdd extends TestCase {
	
	@Test
	public void testAdd() throws Exception{
		
		UserBean bean=new UserBean();
		bean.setId(2);
		bean.setName("xyz");
		bean.setSalary(10000);
		
		UserModel model=new UserModel();
		
		model.add(bean);
		
		bean=model.findByPk(1);
		
		assertNotNull("Record is not added",bean);
		
	}

}
