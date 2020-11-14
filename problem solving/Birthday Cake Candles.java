import java.util.Scanner;
import java.util.Arrays;
public class Solution {
    static int cakeCandles(int[] candles) {
        int tallest = 0;
        int count = 0;
        for (int candle : candles) {
            if (candle > tallest) {
                tallest = candle;
                count = 1;
            } else if (tallest == candle) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] candles = new int[n];
        for (int i = 0; i < n; i++) {
            candles[i] = scan.nextInt();
        }
        scan.close();
        int result = cakeCandles(candles);
        System.out.println(result);
    }
}
