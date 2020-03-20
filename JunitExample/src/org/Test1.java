package org;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class Test1 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("before class");
	}
	@Before
	public static void setUp() throws Exception {
		System.out.println("before");
	}
	@Test
	public void testFindMax() {
		System.out.println("test case find max");
		assertEquals(4,Calculator.findMax(new int[] {1,3,4,2}));
	}
	@Test
	public void testCube() {
		System.out.println("test case cube");
		assertEquals(64,Calculator.cube(4));
	}
	@Test
	public void testSquare() {
		System.out.println("test case square");
		assertEquals(64,Calculator.square(8));
	}
	@After
	public void tearDown() throws Exception {
		System.out.println("after");
	}
	@AfterClass
	public void tearDownAfterClass() throws Exception {
		System.out.println("after class");
	}

}
