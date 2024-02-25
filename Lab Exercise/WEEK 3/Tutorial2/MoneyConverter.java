
import java.util.Scanner;
public class MoneyConverter
{
    public static void main(String [] args)
    {
        double JPY;
        double SGD;
        
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the amount of money in RM: ");
        double MYR = myObj.nextDouble();
        
        JPY = MYR * 0.040;
        SGD = MYR * 3.03;
        
        System.out.println("");
        System.out.println("The price in Japanese Yen is: " +JPY );
        System.out.println("The price in Singapore Dollar is: " +SGD);
    }
}
