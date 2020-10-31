import java.io.*;
import java.util.*;

public class Solution { 

   
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine().replaceAll("[!,?._'@\\s]+", " ");
    StringTokenizer st = new StringTokenizer(s);
    int count = st.countTokens(); 
    System.out.println(count);
    for (int i = 0; i < count; i++) {
        System.out.println(st.nextToken());
    }
    sc.close();
   }
}

