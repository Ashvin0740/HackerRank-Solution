import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for(int a = 0; a < t; a++){
        int n = sc.nextInt();
        int k = sc.nextInt();  
        int finalResult = 0;
        for(int i = 1; i < n ; i++){
            for(int j = i+1; j <= n ; j++){
                int amp = i&j;
                if(amp < k && amp > finalResult)
                    finalResult = amp;                    
            } 
        } 
        System.out.println(finalResult);
    }
}
}