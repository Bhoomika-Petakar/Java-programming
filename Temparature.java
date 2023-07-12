/*Problem: The Temperature Converter
You are working as a software developer at a weather forecasting company. The company is developing a new feature for their app that allows users to convert temperatures from Fahrenheit to Celsius. Your task is to create a method that takes a temperature in Fahrenheit and converts it to Celsius. 
*/

package Loops;

import java.util.Scanner;

public class Temparature {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double C=scan.nextDouble();
		TemperatureConverter tc=new TemperatureConverter();
		double res=tc.convertFahrenheitToCelsius(C);
System.out.println(res);
		
	}

}
