/*
Write a Java program to compute hexagon area.
Area of a hexagon = (6 * s^2)/(4*tan(π/6))
where s is the length of a side
Input Data:
Input the length of a side of the hexagon: 6
Expected Output
*/
import java.util.Scanner;
public class hexagonarea {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Input the length of a side of the hexagon:");
    double s = input.nextDouble();
    System.out.println("The area of the hexagon is:" + hexagonalArea(s)+"\n");
  }
  public static double hexagonalArea(double s) {
    return(6*(s*s))/(4*Math.tan(Math.PI/6));
  }
}
//link for reference - https://trinket.io/java/b93fe74092
