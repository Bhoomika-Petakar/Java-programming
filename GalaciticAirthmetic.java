/*Problem: Galactic Arithmetic
In a far-off galaxy named Arithmetica, beings have been using a newly discovered number system to make their life easier. However, they are facing difficulties in performing basic arithmetic operations. As the resident genius of planet Earth, you have been called upon to help them. Your first task is to build a function that will be able to add two numbers in their number system.
*/


package Loops;
import java.util.Scanner;
public class GalaciticAirthmetic {
	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
		long num1=scan.nextLong();
		long num2=scan.nextLong();
		long result=galaticAddition(num1,num2);
		System.out.println(result);
		

		
	}
	public static long galaticAddition(long num1,long num2) {
		return num1+num2;
	}

}
