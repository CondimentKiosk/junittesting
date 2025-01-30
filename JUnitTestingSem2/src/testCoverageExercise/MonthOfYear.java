/**
 * 
 */
package testCoverageExercise;

/**
 * 
 */
public class MonthOfYear {

	int month;

	/**
	 *
	 * @param month
	 * @return
	 * @throws NumberFormatException
	 */
	public static String monthToString(int month) throws NumberFormatException {
		String monthString = "";
		switch (month) {
		case 1:
			monthString = "Jan";
			break;
		case 2:
			monthString = "Feb";
			break;
		case 3:
			monthString = "Mar";
			break;
		default:
			throw new NumberFormatException("Expected values in range of 1 - 12 inclusive");
		}
		return monthString;
	}

}
