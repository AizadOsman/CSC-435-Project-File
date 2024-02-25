
import java.util.Scanner;
public class Stationary
{
    public static void main(String [] args)
    {
        double totalPrice;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the quantity of pen: ");
        int pen = myObj.nextInt();
        System.out.println("Enter the quantity of book: ");
        int book = myObj.nextInt();
        
        totalPrice = (pen*2.50) + (book*4.0);
        
        System.out.println(""); // selang
        System.out.println("The total price is: RM " +totalPrice);
    }
}
