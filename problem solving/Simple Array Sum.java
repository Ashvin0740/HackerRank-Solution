import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int sum=0;
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
             sum = sum+(sc.nextInt());
        }
        System.out.println(sum);
    }
}
