/**
 * 
 */
package maths.examples;

/**
 * 
 */
public class NumberCruncher {

	/**
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
	public int addNumbers(int num1, int num2) {
		return num1+num2;
	}
	
	/**
	 * 
	 * @param num1
	 * @param num2
	 * @param num3
	 * @return
	 */
	public int addNumbers(int num1, int num2, int num3) {
		return num1+num2+num3;
	}
	
	/**
	 * 
	 * @param num1
	 * @param num2
	 * @return
	 */
	public int multiNumbers(int num1, int num2) {
		return num1*num2;
	}
	
	public int multiNumbers(int num1, int num2, int num3) {
		return num1*num2*num3;
	}
	
	//public double divNumbers(int num1, int num2) {
	//	return (double)num1/num2;
	//}
	
	
	/**
	 * 
	 * @param num1
	 * @param num2 - should not be zero
	 * @return
	 * @throws Exception if div by zero attempted
	 */
	public double divNumbers(int num1, int num2) throws Exception{
		
		if(num2==0) {
			throw new Exception("Div by zero");
		} else {
			return (double) num1 / num2;
		}
	}
	
	
	public int[] doubleUp(int seed, int number) {
		int[]nums = new int[number];
		nums[0] = seed;
		
		for (int loop = 0; loop < number; loop++) {
			nums[loop] = nums[loop-1] * seed;
		}
		return nums;
		}
	}
	
	
	

