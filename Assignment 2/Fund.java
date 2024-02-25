import java.util.Scanner;
public class Fund
{
   private String faculty;
   private double amount_contribution;
   
   //normal constructor
   public Fund(String f, double ac)
   {
       faculty = f;
       amount_contribution = ac;
   }
   
   //accessor
   public String getFaculty()
   {
       return faculty;
   }
   public double getAmount_contribution()
   {
       return amount_contribution;
   }
   
   //main method
   public static void main(String [] args)
   {
       Scanner sc = new Scanner(System.in);
       Fund arrFund[] = new Fund [30];
       
       for (int i=0; i<30; i++)
       {
           System.out.println("Please enter faculty name [Computer/Business/Policy]: ");
           String faculty = sc.next();
           
           System.out.println("Please enter the contribution amount in RM (2 decimal point): ");
           double amount_contribution = sc.nextDouble();
           
           System.out.println(""); // for skip one line
           
           arrFund[i] = new Fund (faculty, amount_contribution);
           
           //if user input invalid code
           if(!(arrFund[i].getFaculty().equals("Computer") || arrFund[i].getFaculty().equals("Business") || arrFund[i].getFaculty().equals("Policy") ))
           {
               System.out.println("Invalid input! Please try again.");
               System.out.println(""); // for skip one line
           }
       }
       
       //calculate total amount of contribution from each faculty in RM
       double totalComputer=0.0, totalBusiness=0.0, totalPolicy=0.0;
       for (int i=0; i<30; i++)
       {
           if (arrFund[i].getFaculty().equals("Computer"))
           {
             totalComputer += arrFund[i].getAmount_contribution();  
           }
           else if (arrFund[i].getFaculty().equals("Business")) 
           {
             totalBusiness += arrFund[i].getAmount_contribution();  
           }
           else if (arrFund[i].getFaculty().equals("Policy"))
           {
             totalPolicy += arrFund[i].getAmount_contribution();  
           }
       }
       
       //calculate total number of contribution from each faculty
       int countComputer=0, countBusiness=0, countPolicy=0;
       for (int i=0; i<30; i++)
       {
           if (arrFund[i].getFaculty().equals("Computer"))
           {
             countComputer++; 
           }
           else if (arrFund[i].getFaculty().equals("Business")) 
           {
             countBusiness++; 
           }
           else if (arrFund[i].getFaculty().equals("Policy"))
           {
             countPolicy++;
           }
       } 

       //calculate average contribution of each faculty
       double averageComputer=0.0, averageBusiness=0.0, averagePolicy=0.0;
       for (int i=0; i<30; i++)
       {
           if (arrFund[i].getFaculty().equals("Computer"))
           {
             averageComputer = totalComputer / countComputer;
           }
           else if (arrFund[i].getFaculty().equals("Business"))
           {
             averageBusiness = totalBusiness / countBusiness;
           }
           else if (arrFund[i].getFaculty().equals("Policy"))
           {
             averagePolicy = totalPolicy / countPolicy;  
           }
       }
       
       //output display
       System.out.println("Faculty \t    Total amount of contribution \t     Number of Contribution \t      Average");
       System.out.println("1) Computer" +"\t\t\t"+ +totalComputer +"\t\t\t\t\t"+ +countComputer++ +"\t\t\t"+ +averageComputer);
       System.out.println("2) Business" +"\t\t\t"+ +totalBusiness +"\t\t\t\t\t"+ +countBusiness++ +"\t\t\t"+ +averageBusiness);
       System.out.println("3) Policy" +"\t\t\t"+ +totalPolicy +"\t\t\t\t\t"+ +countPolicy++ +"\t\t\t"+ +averagePolicy);
   }
}
