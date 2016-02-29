package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {
	MyInteger x;
	MyInteger y;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {	
	}

	@Before
	public void setUp() throws Exception {
		x= new MyInteger(6);
		y= new MyInteger(7);
	}

	@After
	public void tearDown() throws Exception {
		x=null;
		y=null;
	}

	@Test
	public void test() {
		assertTrue(x.isEven());
		assertFalse(y.isEven());
		assertFalse(x.isOdd());
		assertTrue(y.isOdd());
		assertTrue(y.isPrime());
		assertFalse(x.isPrime());
		assertTrue(x.isEven(100));
		assertFalse(y.isEven(3));
		assertTrue(x.isOdd(83));
		assertFalse(y.isOdd(20));
		assertTrue(x.isPrime(11));
		assertFalse(y.isPrime(12));
		assertTrue(x.isEven(x));
		assertFalse(y.isEven(y));
		assertTrue(y.isOdd(y));
		assertFalse(x.isOdd(x));
		assertTrue(y.isPrime(y));
		assertFalse(x.isPrime(x));
		assertTrue(x.equals(6));
		assertFalse(y.equals(6));
		assertTrue(x.equals(x));
		assertFalse(y.equals(x));
		
		


	}

}
