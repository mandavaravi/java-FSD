import static org.junit.Assert.*;

import java.util.StringTokenizer;

import org.junit.*;

@SuppressWarnings("unused")
public class testHelloWorld {
	Say s = new Say();
	
	@Test
	public void test() {
	
		String st = "Hi there";
		assertEquals(st, s.say());
		// similarly assertNotEquals(a,b);  
		
	}
	
	@Test
	public void testReverse() {
		String ss = Say.stringReverse("hi there");
		assertEquals("ih ereht", ss);
	}
	
	@Test
	public void test3() {
		String s = null;
		assertNull(s);  //checks whether arg is null
	}
	
	@Test
	public void test4() {
		String s = "yeah";
		assertNotNull(s);  //checks whether arg is not null
	}
	@Test
	public void test5() {
		boolean s = 6>2;
		assertTrue(s);  //checks whether arg is null
		// similarly assertFalse()
	}
	@Test
	public void test6() {
		
		
	}
	
	

}
