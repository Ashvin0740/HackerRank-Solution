import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int d = scanner.nextInt();
        int m = scanner.nextInt();
        int y = scanner.nextInt();
        d = d - scanner.nextInt();
        m = m - scanner.nextInt();
        y = y - scanner.nextInt();

        int fine = 0;
        if ( y > 0  )
            fine = 10000;
        else if ( y==0 && m > 0 )
            fine = m*500;
        else if ( y==0 && d > 0 )
            fine = d * 15;
        System.out.printf("%d",fine );
    
    }
}