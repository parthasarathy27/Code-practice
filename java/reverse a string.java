/*Write a Java program to reverse a string.
Input Data:
Input a string: The quick brown fox
Expected Output

Reverse string: xof nworb kciuq ehT
*/

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    char[] letters = input.nextLine().toCharArray();
    for(int i = letters.length - 1; i >= 0; i--){
      System.out.print(letters[i]);
    }
    System.out.print("\n");
  }
}

//link for reference - https://trinket.io/java/f99a4ac032
