/*Question 6 :
 Problem: Semester Marks Averager
You are creating a student portal for your school. The portal needs to display the average marks of a student for 8 semesters. Your task is to write a Java function that takes the marks of each semester individually and returns the average.
*/

package Loops;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int sem1=scan.nextInt();
		int sem2=scan.nextInt();
		int sem3=scan.nextInt();
		int sem4=scan.nextInt();
		int sem5=scan.nextInt();
		int sem6=scan.nextInt();
		int sem7=scan.nextInt();
		int sem8=scan.nextInt();
		MarksApp mp=new MarksApp();
		double res= mp.calculateAverage(sem1,sem2,sem3,sem4,sem5,sem6,sem7,sem8);
		
		System.out.println(res);
		

	}
	
	

}
