import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
    static String timeConversion(String s) {
         String[] str = s.split(":");
         int hour = Integer.parseInt(str[0]);
         String min = str[1];
         String secPeriod = str[2];
         String sec = str[2].substring(0, secPeriod.length() - 2);
         String Period = str[2].substring(secPeriod.length() - 2, secPeriod.length());
         String newTimeINString = "";

         if((0 <= hour && hour < 12) && (Period.equalsIgnoreCase("AM"))){
             newTimeINString = String.format("%02d",hour) + ":" + min + ":" + sec;

         }
         else if((0 <= hour && hour < 12) && (Period.equalsIgnoreCase("PM")))
         {
            newTimeINString = (12 + hour) + ":" + min + ":" + sec;
         }
         else if((hour ==12 ) && (Period.equalsIgnoreCase("AM")))
         {
   newTimeINString =  "00" + ":" + min + ":" + sec;
         }
         else if((hour ==12 ) && (Period.equalsIgnoreCase("PM")))
         {
   newTimeINString =  hour + ":" + min + ":" + sec;
         }
    return newTimeINString;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
