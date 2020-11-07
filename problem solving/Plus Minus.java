import java.util.*;

public class solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        double num = sc.nextDouble();
        int positive = 0;
        int negative = 0;
        int zero= 0;
        for (int i =0; i< num; i++){
            int  tem = sc.nextInt();
            if ( tem > 0)
            {
            positive++;
            }
            else if (tem < 0)
            {
                negative++;
            }
            else
            {
                zero++;
            }
        }

            System.out.println(positive / num );
            System.out.println(negative / num );
            System.out.println(zero / num );
        

    }
}