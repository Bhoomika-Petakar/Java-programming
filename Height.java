/*Question: 11
  **Problem: The Height Converter**
 
You are part of a sports data management team. The team is developing a new feature for their application where the heights of players, currently recorded in inches, need to be displayed in feet for an international audience. Your task is to create a method that takes a height given in inches and converts it into feet.
*/

package Loops;
import java.util.Scanner;
public class Height {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	double inch=scan.nextDouble();
	HeightConverter cv = new HeightConverter();
	double result=cv.convertInchesToFeet(72.0);
	System.out.println(result);
scan.close();
}
}
