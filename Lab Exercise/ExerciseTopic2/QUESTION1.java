
import java.util.Scanner;
public class QUESTION1
{
   public static void main(String [] args)
   {
       Scanner sc = new Scanner (System.in);
       int Sum = 0;
       
       System.out.println("Please enter 10 number");
       
       for (int i=0; i<10; i++)
       {
           System.out.println("");
           System.out.println("Number " + (i+1) + ": ");
           int x = sc.nextInt();
           
           if(x %2 == 0)
           {
               System.out.println( (+x) + " is an even number");
               Sum = Sum + x;
           }
   }
   System.out.println("");
   System.out.println("Sum of all even number is " + Sum);
   }
}
