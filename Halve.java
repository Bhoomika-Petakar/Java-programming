/*Question: 14
  **Problem: Halve It**
 
You are helping a friend in developing a financial app. The app has a feature where it calculates half of the entered amount for splitting bills. Your task is to write a function that takes a number and returns its half.
*/

package Loops;
import java.util.Scanner;
public class Halve {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double amount=scan.nextDouble();
		HalveApp ha=new HalveApp();
		double result=ha.halveTheNumber(amount);
		System.out.println (result);
		}
}
