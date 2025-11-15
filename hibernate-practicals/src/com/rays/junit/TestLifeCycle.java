package com.rays.junit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestLifeCycle {
	
	@BeforeClass
	public static void beforeClass() throws Exception{
		System.out.println("Before Class");
	}
	
	
	@Before
	public void before()throws Exception{
		System.out.println("Before");
	}
	
	@Test
	public void testFindMax1() throws Exception{
		System.out.println("Test 01");
		assertEquals(6,Calculation.findMax(new int[] {1,3,4,2,6}));
	}
	
	@Test
	public void testFindMax2() throws Exception{
		System.out.println("Test 02");
		assertEquals(20,Calculation.findMax(new int[] {9,1,4,5,20}));
	}
	
	@After
	public void after() throws Exception{
		System.out.println("After");
	}
	
	@AfterClass
	public static void afterClass() throws Exception{
		System.out.println("AfterClass");
	}
	
}
