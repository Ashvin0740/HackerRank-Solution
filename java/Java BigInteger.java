import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger  n1 = new BigInteger(sc. next());
        BigInteger  n2 = new BigInteger(sc. next());

        BigInteger  A = n1.add(n2);
        BigInteger  B = n1.multiply(n2);
        System.out.println(A); 
        System.out.println(B); 
    }
}
