/*
Write a Java program and compute the sum of an integer's digits.
Input Data:
Input an integer: 25
Expected Output
*/
import java.util.*;
public class computesum {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the value:");
    long n = input.nextLong();
    System.out.println("The sum of the digits is: " + sumDigits(n));
  }
  public static int sumDigits(long n) {
    int sum = 0;
    while(n != 0) {
      sum += n % 10;
      n /= 10;
    }
    return sum;
  }
}

//link for reference - https://trinket.io/java/b6648baf5b
