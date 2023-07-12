/*Question 4:
 Problem: The Journey Calculator
 
You are a developer at a transportation company. The company is developing a new app that helps users track their journey. One of the features of the app is to calculate the distance travelled given the speed and time of the journey. Your task is to create a method that takes speed and time and returns the distance travelled. This method should be a non-static method and should be implemented inside a class named JourneyCalculator.
*/

package Loops;
import java.util.Scanner;
public class Journey {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		double speed=scan.nextDouble();
		double time=scan.nextDouble();
		JourneyCalculator jc=new JourneyCalculator();
		double res=jc.calculateDistance(speed,time);
		System.out.print(res);
		
	}

}
