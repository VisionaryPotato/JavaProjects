import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class TestCases {

	//Switch which line is commented out in order to test the correct vs broken code
	
	//TestingFunctions functions = new BlackBoxCorrect();
	//TestingFunctions functions = new BlackBoxIncorrect();
	TestingFunctions functions = new MyFunctions();
	/**
	 * This is a simple validity check for the method greatestCommonDivisor. Checks that the method
	 * returns the correct result for a known GCD problem gcd(2,4) = 2
	 */
	@Test
	public void testGCD() {
		assertEquals("Error: should return 2", 2, functions.greatestCommonDivisor(2, 4));
	}
	@Test
	public void testGCDNegNum() {
		assertEquals("Error: should return -1", -1, functions.greatestCommonDivisor(1,-4));
	}
	@Test
	public void testGCDZero() {
		assertEquals("Error: should return 9", 9, functions.greatestCommonDivisor(0,9));
	}
	@Test
	public void testGCDZeroOtherCase() {
		assertEquals("Error: should return 9", 9, functions.greatestCommonDivisor(9,0));
	}
	@Test
	public void testGCDEqualsOne(){
		assertEquals("Error: should return 1", 1, functions.greatestCommonDivisor(1,1));
	}
	@Test
	public void testGCDEqualsToVal() {
		assertEquals("Error: should return 7", 7, functions.greatestCommonDivisor(14,7));
	}
	
	/**
	 * This is a simple check of the reverseWindow method. Checks if the method will reverse the entire contents
	 * of the passed array correctly.
	 */
	@Test
	public void testReverseWindow() {
		int[] origArr = {1,2,3,4,5};
		int[] expectedArr = {5,4,3,2,1};
		functions.reverseWindow(origArr, 0, 5);
		assertArrayEquals("Error: should be {5,4,3,2,1}", expectedArr, origArr);
		
	}
	@Test
	public void testReverseWindowEqualIndecies() {
		int[] origArr = {1,2,3,4,5};
		int[] expectedArr = {1,2,3,4,5};
		functions.reverseWindow(origArr, 1, 1);
		assertArrayEquals("Error: should be {1,2,3,4,5}", expectedArr, origArr);
		
	}
	@Test(expected = IndexOutOfBoundsException.class)
	public void testReverseWindowIndexOutOfBounds() {
		int[] origArr = {1,2,3,4,5};
		int[] expectedArr = {1,2,3,4,5};
		functions.reverseWindow(origArr, -1, 5);
		assertArrayEquals("Error: index1 and/or index2 are not valid indexes", expectedArr, origArr);
		
	}
	@Test
	public void testReverseWindowEmptyArray() {
		int[] origArr = {};
		int[] expectedArr = {};
		functions.reverseWindow(origArr, 0, 0);
		assertArrayEquals("Error: should be {}", expectedArr, origArr);
	}
	@Test
	public void testReverseWindowReverseIndices() {
		int[] origArr = {1,2,3,4,5};
		int[] expectedArr = {1,5,4,3,2};
		functions.reverseWindow(origArr, 5, 1);
		assertArrayEquals("Error: should be {1,5,4,3,2}", expectedArr, origArr);
	}
	//For completion, write additonal tests as described in the lab documentation.
}
