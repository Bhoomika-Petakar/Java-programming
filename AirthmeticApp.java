package Loops;

public class AirthmeticApp {
	public static int subtractNumbers(int num1, int num2) {
		int result=num2-num1;
		System.out.println("the subtraction result is: " + result);
		return result;
		
	}
	public static int multiplyNumbers(int num1, int num2) {
		int result=num2*num1;
		System.out.println("the multiplication result is: " + result);
		return result;
		
		
	}
	public static double divideNumber(int num1, int num2) {
		int result=num1/num2;
		System.out.println("the division result is: " + (num2/num1));
		return result;
		
	}
	public static int findRemainder(int num1, int num2) {
		int result=num1%num2;
		System.out.println("the Remainder result is: " + (num2%num1));
		return result;
		
	}

}
