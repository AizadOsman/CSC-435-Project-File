
import java.io.*;
import java.util.*;
import java.text.DecimalFormat;
public class Employee
{
    public static void main(String [] args)
    {
        try
        {
            FileReader reader = new FileReader("employee.txt");
            BufferedReader in = new BufferedReader (reader);
            
            FileWriter full = new FileWriter("fullTime.txt");
            PrintWriter ft = new PrintWriter (full);
            
            String input;
            int totalEmployee1 = 0;
            double max1 = 0.0;
            String nameHigh = "";
            
            ft.println("FULL TIME EMPLOYEES");
            ft.println("");
            
            while((input=in.readLine()) != null)
            {
                StringTokenizer word = new StringTokenizer(input, ",");
                
                int code = Integer.parseInt(word.nextToken());
                String name = word.nextToken();
                String dept = word.nextToken();
                int sal = Integer.parseInt(word.nextToken());
                String type = word.nextToken();
                
                if (type.equals("F"))
                {
                    ft.println(code + "\t" + name + "\t" + dept + "\t\t" + sal);
                    
                    totalEmployee1++;
                    
                    if (sal > max1)
                    {
                        max1 = sal;
                        nameHigh = name;
                    }
                }
            }
            ft.println("");
            ft.println("Total number of full time employee : " + totalEmployee1);
            ft.println("Total highest salary : " +max1);
            ft.println("The name of employee with the highest salary is " +nameHigh);
            
            in.close();
            ft.close();
        }
        catch(FileNotFoundException fnf)
        {
          System.out.println(fnf.getMessage());  
        }
        catch(EOFException eof)
        {
            System.out.println(eof.getMessage());
        }
        catch(IOException io)
        {
            System.out.println(io.getMessage());
        }
    }
}
