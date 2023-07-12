/*Question: 10
  **Problem: The Planet Explorer**
You are a scientist at a space research center. The center is currently researching various planets and their properties. One of the properties they are interested in is the surface area of these planets. Considering that a planet can be approximated as a sphere, your task is to create a method that calculates the surface area of a sphere given its radius.
*/

package Loops;
import java.util.Scanner;
public class SurfaceArea {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		double rad=scan.nextDouble();
		PlanetExplorer explorer = new PlanetExplorer();
		System.out.println(explorer.calculateSurfaceArea(rad));
		scan.close();
	}
}