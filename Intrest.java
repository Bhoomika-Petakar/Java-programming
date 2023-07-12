/*Question: 12
  **Problem: The Finance Calculator**
 
You are a software developer at a financial technology company. The company is building a new feature in their app that calculates the simple interest for users wanting to take out loans. Your task is to create a method that calculates the simple interest given the principal amount, rate of interest, and time.
*/

package Loops;
import java.util.Scanner;
public class Intrest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		double principle=scan.nextDouble();
		double rate=scan.nextDouble();
		double time=scan.nextDouble();
		FinanceCalculator calculator = new FinanceCalculator();
		double i=calculator.calculateSimpleInterest(principle,rate,time);
		System.out.printf("%.2f", i);
		scan.close();
	}
}
