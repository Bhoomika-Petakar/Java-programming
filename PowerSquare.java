/*Question: 7
 Problem: The Power of Squares
 
You are a software developer at a gaming company. The company is developing a new game called "The Power of Squares". In this game, players have to square the number provided to advance to the next level. Your task is to create a function that will calculate the square of the number provided.
*/


package Loops;

import java.util.Scanner;

public class PowerSquare {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		SquareApp sa=new SquareApp();
		int res=sa.squareNumber(num);
		System.out.println(res);
		
	}

}
