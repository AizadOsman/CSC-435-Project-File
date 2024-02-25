import java.util.Scanner;
public class QUESTION2
{
    public static void main(String [] args)
    {
        int c, thisIsAVaraible, q76354, number;
        
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter an integer number: ");
        int age = myObj.nextInt();
        
        System.out.println("");
        System.out.println("This is a Java \n program");
        System.out.println("This \n is \n a\n Java \n program");
        
        System.out.println("");
        System.out.println("Please enter a number 1: ");
        int x = myObj.nextInt();
        System.out.println("Please enter a number 2: ");
        int y = myObj.nextInt();
        System.out.println("Please enter a number 3: ");
        int z = myObj.nextInt();
        
        int result = x * y * z;
        
        System.out.println("The product is " +result); 
        
    }
}
