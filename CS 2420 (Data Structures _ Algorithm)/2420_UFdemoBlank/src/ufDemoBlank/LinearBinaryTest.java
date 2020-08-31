package ufDemoBlank;

import org.junit.Test;

public class LinearBinaryTest {

	@Test
	public void testLinear() {
		System.out.println("Test on linear(70)");
		Integer[] a = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		Integer key = 70;
		int expResult = 6;
		int result = LinearBinary.linear(a, key);
		System.out.println(result);
		assertEquals(expResult, result);

	}

	private void assertEquals(int expResult, int result) {
		// TODO Auto-generated method stub
		
	}

	@Test
	public void testBinary() {
		System.out.println("Test on binary(100) ");
		int[] a = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int key = 100;
		int expResult = 9;
		int result = LinearBinary.binary(a, key);
		System.out.println(result);
		assertEquals(result,expResult);

	}
}
