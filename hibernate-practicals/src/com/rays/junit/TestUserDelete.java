package com.rays.junit;

import static org.junit.Assert.assertNull;

import org.junit.Test;

import junit.framework.TestCase;

public class TestUserDelete extends TestCase {
	
	@Test
	public void testAdd() throws Exception {
		
		UserModel.delete(2);
		
		UserBean bean=UserModel.findByPk(1);
		
		assertNull("Data not deleted",bean);
	}
}
