/*Question:1
  Problem: Arithmetic Operations
You are a programmer in a school. The mathematics teacher has asked for your help to teach basic arithmetic operations to students. Your task is to create a set of functions that will do subtraction, multiplication, division, and find the remainder of two numbers.
*/



package Loops;

public class AirthmeticOperation {
	public static void main(String []args) {
		int num1;
		int num2;
		
		AirthmeticApp ar=new AirthmeticApp();
		System.out.println(ar.subtractNumbers(20,5));
		System.out.println(ar.multiplyNumbers(4,5));
		System.out.println(ar.divideNumber(20,4));
		System.out.println(ar.findRemainder(10,3));
		
		
	}
	
}
