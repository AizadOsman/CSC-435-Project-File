
import java.util.Scanner;
public class QUESTION14
{
    public static void main(String [] args)
    {
        Scanner myObj = new Scanner(System.in);

        double tax_rate=0;
        
        System.out.println("Please enter net income value: ");
        int net_income = myObj.nextInt();
        
        if (net_income <= 15000)
        {
            System.out.println("You don't need to pay tax!");
        }
        else if (net_income > 15000 && net_income <= 30000)
        {
            tax_rate = (net_income - 15000) * 0.05;
            System.out.println("You are taxed at : " +tax_rate); 
        }
        else if (net_income > 30000 && net_income <= 50000)
        {
            tax_rate = (30000 - 15000) * 0.05 + (net_income - 30000) * 0.1;
            System.out.println("You are taxed at : " +tax_rate);
        }
        else if (net_income > 50000)
        {
            tax_rate = (30000 - 15000) * 0.05 + (50000 - 30000) * 0.1 + (net_income - 50000) * 0.15;
            System.out.println("You are taxed at : " +tax_rate);
        }
    }
}