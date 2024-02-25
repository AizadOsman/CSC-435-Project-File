import java.util.Scanner;
public class QUESTION4
{      
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter number 1 : ");
        float num1 = sc.nextFloat();
        System.out.println("Please enter number 2 : ");
        float num2 = sc.nextFloat();
        System.out.println("Choose operator to calculate both numbers [+] plus | [-] minus | [*] multiply | [/] divide : ");
        char operator = input.next().charAt(0);
        
        float answer = calculator(num1, num2, operator);
        System.out.println("Your answer is: " +answer);
        
        System.out.println("");
        System.out.print("The average of the entered marks is: " +calAverage());
        
    }
    
    public static float calculator(float num1, float num2, char operator) 
    {
        float result=0;
        
        switch (operator)
        {   
            case '+': 
                result = num1 + num2;
                break;
            
            case '-':
                result = num1 - num2;
                break;
            
            case '*':
                result = num1 * num2;
                break;
            
            case '/':
                result = num1 / num2;
                break;
                
            default:
                System.out.println("Invalid operator!");
                break;
        }
        return result;
        
    }
    
    public static float calAverage()
    {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int average=0;
        
        System.out.println("How many marks do you want to calculate: ");
        int qty = sc.nextInt();
        
        for(int i=0; i<qty; i++)
        {
            System.out.println("Please enter the marks: " +(i+1));
            int marks = sc.nextInt();
            sum = sum + marks;
        }
        average = sum / qty;
        return average;
    }
}
