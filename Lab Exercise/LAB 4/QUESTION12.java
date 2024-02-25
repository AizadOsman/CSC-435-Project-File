
import java.util.Scanner;
public class QUESTION12
{
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        
        for (int i=0; i<4; i++)
        {
            System.out.println("Please enter first integer number: ");
            int num1 = myObj.nextInt();
            System.out.println("Please enter second integer number: ");
            int num2 = myObj.nextInt();
            System.out.println("Please choose operator to calculate both numbers [+] plus | [-] minus | [*] multiply | [/] divide : ");
            char operator = input.next().charAt(0);
        
            int answer = calculator(num1, num2, operator);
            System.out.println("Your answer is : " +answer);
            System.out.println("\n");
        }
    }
    
    public static int calculator(int num1, int num2, char operator)
    {
        int result = 0;
        
        if (operator == '+')
        {
            result = num1 + num2;
        }
        else if (operator == '-')
        {
            result = num1 - num2;
        }
        else if (operator == '*')
        {
            result = num1 * num2;
        }
        else if (operator == '/')
        {
            result = num1 / num2;
        }
        else 
        {
            System.out.println("Invalid input!");
        }
        return result;
    }
}
