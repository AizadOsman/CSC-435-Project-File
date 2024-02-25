
import java.util.*;
public class Test
{
    private int age;
    
    public boolean isDiscount()
    {
        if (age <= 12 && age >= 60)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public double calPrice()
    {
       double memberPrice=0.0;
       double agePrice=0.0;
       double price=0.0;
       
       if (packageType.equals("A"))
       {
           price = 77.00;
       }
       else if (packageType.equals("B"))
       {
           price = 50.00;
       }
       
       if(age<= 12 && age >= 60)
       {
           agePrice = price * 0.5;
       }
       else
       {
           agePrice = 0.0;
       }
       
       if(isMember.getBoolean(true))
       {
           memberPrice = price * 0.15;
       }
       else
       {
           memberPrice = 0.0;
       }
       double totalPrice = price - agePrice - memberPrice;
       return totalPrice;
    } 
    
    
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        
    }
}
