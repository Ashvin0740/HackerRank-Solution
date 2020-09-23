import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DataType {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        int I = scan.nextInt();

        double D = scan.nextDouble();
        String S = "is the best place to learn and practice coding!";
        
        System.out.println(i + I);
                System.out.println(D + d);
                        System.out.println(s + "" + S);

        scan.close();
    }
}