/*Question: 8
Problem: The Cube Mystery
 
You are a software engineer developing an innovative educational game for kids. This game helps kids understand the concept of cubes in a fun and interactive way. In one of the stages, the kids are given a number and they have to find out the cube of that number to solve a mystery. Your task is to create a function that will calculate the cube of a given number.
*/

package Loops;

import java.util.Scanner;

public class Cube {
	public class PowerSquare {
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			int num=scan.nextInt();
			SquareApp sa=new SquareApp();
			int res=sa.squareNumber(num);
			System.out.println(res);
			
		}
}
}
