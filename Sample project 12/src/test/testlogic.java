package test;

import static org.junit.Assert.*;

import org.junit.Test;

import logic.calculation;

public class testlogic {

	@Test
	public void test() {
		assertEquals(4, calculation.findMax(new int[] {1,2,3,4}));
		
	}

}
