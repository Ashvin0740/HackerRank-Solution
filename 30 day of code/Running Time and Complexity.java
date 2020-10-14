import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

     public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] numbers = new int[n];
    for (int i = 0; i < n; i++) {
      numbers[i] = in.nextInt();
    }

    for (int i = 0; i < numbers.length; i++) {
      if (isPrime(numbers[i]))
        System.out.println("Prime");
      else
        System.out.println("Not prime");
    }
  }
  
    public static boolean isPrime(int number) {
      if(number==1){
          return false;
      }
    else if(number>1) {
      for (int j = 2; j <= Math.sqrt(number); j++) {
        if (number % j == 0) {
          return false;
        }
      }
    }
    return true;
  }
}



