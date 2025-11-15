package com.rays.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestUserUpdate {
	
	@Test
	public void testUpdate() throws Exception{
		
		UserBean bean=new UserBean();
		
		bean.setName("aaa");
		bean.setId(2);
		
		UserModel.update(bean);
		
		bean=UserModel.findByPk(2);
		
		assertEquals("aaa",bean.getName());
		
	}
}
