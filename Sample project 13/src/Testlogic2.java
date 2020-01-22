import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Testlogic2 {
	static int i,j;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before testing any method");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("after all test");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("before each test, testNO: " + i++);
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("after each test,  testNO: " + j++);
	}

	@Test
	public void test() {
		assertNull(null);
	}
	@Test
	public void test1() {
		assertNotNull(4);
	}
	@Test
	public void test2() {
		assertEquals(4, 6-2);
	}

}
