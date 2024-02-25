
import java.util.*;
public class Mark
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        double sum=0;
        double average=0;
        
        System.out.println("How many marks do you want to enter: ");
        int total_mark = sc.nextInt();
        
        System.out.println(""); // skip one line
        Mark markArray [] = new Mark[total_mark];
        for(int i=0; i<total_mark; i++)
        {
            System.out.println("Please enter the marks: ");
            double marks = sc.nextDouble();
            
            sum = sum + marks;
            average = sum / total_mark;
        }
        System.out.println(""); // skip one line
        System.out.println("The average of the mark is: " +average);
    }
}