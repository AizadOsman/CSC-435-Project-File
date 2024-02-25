
import java.util.Scanner;
public class QUESTION11
{
    public static void main(String [] args)
    {
        String residential;
        
        Scanner myObj = new Scanner(System.in);
        for(int i=0; i<5; i++)
        {
           System.out.println(""); 
           System.out.println("Please enter residential code: ");
           int code = myObj.nextInt(); 
           
           switch (code)
           {
            case 1 :
                residential = "House";
                System.out.println("Code 1 = " +residential);
                break;
                
            case 2 :
                residential = "Office";
                System.out.println("Code 2 = " +residential);
                break;
                
            case 3 :
                residential = "Factory";
                System.out.println("Code 3 = " +residential);
                break;
                
            case 4 :
                residential = "Mosque, religious and charity welfare";
                System.out.println("Code 4 = " +residential);
                break;
                
            default :
                System.out.println("Invalid input!");
                break;
           }
        }        
    }
}
