/*Question: 3
  Problem: The Double Trouble
You are participating in a coding competition at your school. The challenge is to create a function that can double the value of any number provided. This function will help in the game design where scores need to be doubled under certain conditions.
*/


package Loops;
import java.util.*;
public class DoubleNumber {
	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
		
		int result=doubleTheNumber(15);
		System.out.print(result);
		}
	public static int doubleTheNumber(int num){
		return num+num;
	}
	
	
	
	
	
	
	

}
