/*
Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5

Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20
*/

import java.util.*;
public class perarea {
  public static void main(String[] strings) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the height :");
    double height = input.nextDouble();
    
    System.out.print("Enter the width :");
    double width = input.nextDouble();
    
    double perimeter = 2*(height+width);
    double area = width*height;
    
    System.out.printf("perimeter is 2*(%.1f + %.1f) = %.2f \n", height, width, perimeter);
    System.out.printf("area is %.1f * %.1f = %.2f \n", width, height, area);
  }
}

//link for reference - https://trinket.io/java/d3ed3441f7
