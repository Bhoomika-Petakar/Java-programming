/*Question: 13
  **Problem: Time Converter**
 
You are developing a time tracking application for a company. The employees log their time in minutes. The management wants to see these durations in hours for better understanding. Your task is to write a function that can convert minutes into hours.
*/


package Loops;
import java.util.Scanner;
public class converter {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double minutes=scan.nextDouble();
		ConverterApp cv=new ConverterApp();
		double result=cv.convertToHours(minutes);
		System.out.println (result);
		}
	}
