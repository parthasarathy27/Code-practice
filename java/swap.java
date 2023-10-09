//Write a Java program to swap two variables.

import java.util.*;
public class swap {
  public static void main(String[] args) {
    int a, b, temp;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the a value:");
    a = input.nextInt();
    
    System.out.print("Enter the b value:");
    b = input.nextInt();
    
    System.out.println("Before swapping : a,b = " + a + "," + + b);
    
    temp = a;
    a = b;
    b = temp;
    
    System.out.println("After swapping : a,b = " + a + "," + + b);
  }
}

//link for reference - https://trinket.io/java/60db91830c
