import java.io.*;
import java.util.*;
public class StuApp
{
    public static void main(String [] args)
    {
        Scanner inp = new Scanner(System.in);
        Student std = new Student();
        
        System.out.println("Enter student number: ");
        String num = inp.next();
        
        System.out.println("Enter student name: ");
        String name = inp.next();
        
        System.out.println("Enter student program: ");
        String prog = inp.next();
        
        System.out.println("Enter cgpa: ");
        Double cgpa = inp.nextDouble();
        
        std.setData(num, name, prog, cgpa);
        
        System.out.println(std.toString());
    }
}
