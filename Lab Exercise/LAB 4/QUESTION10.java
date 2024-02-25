import java.util.Scanner;
public class QUESTION10
{
    public static void main(String [] args) 
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter any integer number: ");
        int num = myObj.nextInt();
        
        if (num % 2 == 0)
        {
            System.out.println(num + " is even number");
        }
        else
        {
            System.out.println(num + " is odd number");
        }
    }
}
