import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
     
        String largest = s.substring(0,k);
        String smallest = s.substring(0,k);
        String sub;
        for (int i=0; i<s.length()-k+1; i++){
            sub = s.substring(i,k+i);
            if (sub.compareTo(largest)>0) {largest=sub;}
            else if (sub.compareTo(smallest)<0) {smallest=sub;}
        }
     // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'


        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}