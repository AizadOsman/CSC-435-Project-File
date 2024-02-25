
import java.util.Scanner;
public class QUESTION13
{
    public static void main(String [] args)
    {
        Scanner myObj = new Scanner(System.in);
        
        System.out.println("Volume of a Cylinder");
        System.out.println("");
        System.out.println("Please enter pie value: ");
        float pie = myObj.nextFloat();
        System.out.println("Please enter radius: ");
        float radius = myObj.nextFloat();
        System.out.println("Please enter height: ");
        float height = myObj.nextFloat();
        
        float volume = pie * (radius * radius) * height;
        
        System.out.println("The volume of the cylinder is : " +volume);
    }
}
