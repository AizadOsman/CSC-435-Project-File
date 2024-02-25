
import java.util.Scanner;
public class QUESTION15
{
    public static void main(String [] args)
    {
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Please enter the amount of working hour: ");
        int hour = myObj.nextInt();
        
        double labor_charge;
        if (hour < 2) 
        {
            System.out.println("No charges for less than 2 working hour!");
        }
        else if (hour >= 2 && hour <= 6)
        {
            labor_charge = 2.00;
            System.out.println("You are paid as much as RM " +labor_charge);
        }
        else if (hour > 6)
        {
            labor_charge = hour * 0.45;
            System.out.println("You are paid as much as RM " +labor_charge);
        }
    }
}
