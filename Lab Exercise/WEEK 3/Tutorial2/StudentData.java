
import java.util.Scanner;
public class StudentData
{
    public static void main(String [] args)
    {
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Student Profile");
        System.out.println("");
        System.out.println("Name: ");
        String name = myObj.nextLine();
        System.out.println("Student ID: ");
        int id = myObj.nextInt();
        System.out.println("CGPA: ");
        double cgpa = myObj.nextDouble();
        
        System.out.println(""); //selang
        System.out.println("Name: " +name);
        System.out.println("Student ID: " +id);
        System.out.println("CGPA: " +cgpa);
    }
}
