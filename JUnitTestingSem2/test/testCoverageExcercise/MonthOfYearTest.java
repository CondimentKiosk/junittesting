package testCoverageExcercise;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import testCoverageExercise.MonthOfYear;

class MonthOfYearTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testMonthsValid() {

		assertEquals("Jan", MonthOfYear.monthToString(1));
		assertEquals("Feb", MonthOfYear.monthToString(2));
		assertEquals("Mar", MonthOfYear.monthToString(3));

	}
	
	@Test
	void testMonthsInvalid() {
		
		Exception e = assertThrows(NumberFormatException.class, ()->{
			
			MonthOfYear.monthToString(13);
			
		});
		
	}
	
}
