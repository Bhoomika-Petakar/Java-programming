/*Question 3:
Problem: The String Joiner
 
You are creating a new social networking site. In one of the features, you have to combine the user's first name and last name to display the full name. Your task is to write a static method that will concatenate two strings.
*/


package Loops;
public class StringJoiner {
	public static void main(String []args) {
		String str1;
		String str2;
		System.out.print(joinStrings("Bhoomika ","petakar "));
		}
	
	public static String joinStrings(String str1, String str2) {
		return str1 +str2;
	}
}
