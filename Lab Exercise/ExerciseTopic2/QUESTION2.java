
import java.util.Scanner;
public class QUESTION2
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner (System.in);
        
        int highest = 0;
        
        System.out.println("Please enter any number: ");
        int num = sc.nextInt();
        
        while(num > 0)
        {
            int i = num %10;
            
            if(highest <i)
            {
                highest = i;
            }
            num = num/10;
        }
        System.out.println("The highest number entered is: " +highest);
    }
    
}
