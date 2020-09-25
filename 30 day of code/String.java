import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class String{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int c=0;c<n;c++) {
            String even = "";
            String odd = "";

            String s = sc.next();
            char[] charArray = s.toCharArray();
            for (int i = 0; i < charArray.length; i += 2) {
                even += charArray[i];
            }
            for (int j = 1; j < charArray.length; j += 2) {
                odd += charArray[j];
            }
            System.out.println(even + " " + odd);
        }
    }
}