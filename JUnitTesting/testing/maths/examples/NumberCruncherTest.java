/**
 * 
 */
package maths.examples;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */
class NumberCruncherTest {

	// testdata
	int num1, num2, num3;
	NumberCruncher numberCruncher;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {

		num1 = 2;
		num2 = 3;
		num3 = 5;

		numberCruncher = new NumberCruncher();
	}

	/**
	 * Test method for {@link maths.examples.NumberCruncher#addNumbers(int, int)}.
	 */
	@Test
	void testAddNumbersIntInt() {

		// act
		int expected = num1 + num2; // or do '5' to check right method
		int actual = numberCruncher.addNumbers(num1, num2);

		// assert
		assertEquals(expected, actual);

	}

	/**
	 * Test method for
	 * {@link maths.examples.NumberCruncher#addNumbers(int, int, int)}.
	 */
	@Test
	void testAddNumbersIntIntInt() {

		// act
		int expected = num1 + num2 + num3; // or do '10' to check right method
		int actual = numberCruncher.addNumbers(num1, num2, num3);

		// assert
		assertEquals(expected, actual);
	}

	@Test
	void testMultiNumbersIntInt() {

		assertEquals(num1 * num2, numberCruncher.multiNumbers(num1, num2));

	}

	@Test
	void testMultiNumbersIntIntInt() {

		assertEquals(num1 * num2 * num3, numberCruncher.multiNumbers(num1, num2, num3));

	}

	@Test
	void testDivNumbersIntInt() {

		try {
			int a, b;
			a = 10;
			b = 3;

			double expected = 3.3;
			double actual;

			actual = numberCruncher.divNumbers(a, b);

			assertEquals(expected, actual, 0.1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	void testDivNumbersIntIntDivByZero() {

		Exception exception = assertThrows(Exception.class, () -> {
			// code to execute
			numberCruncher.divNumbers(num1, 0);
		});
	}

	@Test
	public void testDoubleUp() {
		int seed = 2;
		int number = 4;
		int[] expected = { 2, 4, 8, 16 };

		int[] actual = numberCruncher.doubleUp(seed, number);

		System.out.println(Arrays.toString(actual));

		boolean match = false;
		// checking the values are the same as the expected
		for (int loop = 0; loop < expected.length; loop++) {
			if (expected[loop] == actual[loop]) {
				match = true;
			} else {
				// not a match
				match = false; // set flag to false
				break; // leaving the loop
			}
		}
		// overall result
		assertTrue(match);
	}
}
