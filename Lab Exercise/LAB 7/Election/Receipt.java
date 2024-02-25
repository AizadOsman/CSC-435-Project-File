
import java.util.*;
public class Receipt
{
    //i) 
    private int date;
    private String nameReceived;
    private double sum;
    private String aimPayment;
    private String assignedBy;
    
    // ii) mutator, setter
    public void SetData(int d, String nr, double s, String Ap, String assBy)
    {
        date = d;
        nameReceived = nr;
        sum = s;
        aimPayment = Ap;
        assignedBy = assBy;
    }
    
    // iii) acessor
    public int getDate()
    {
      return date;  
    }
    public String getNameReceived()
    {
      return nameReceived;  
    }
    public double getSum()
    {
      return sum;  
    }
    public String getAimPayment()
    {
      return aimPayment;  
    }
     public String getAssignedBy()
    {
      return assignedBy;  
    }
    
    // iv) processor
    public double calculateNetPayment()
    {
        double payment;
        
        if (sum <= 500)
        {
          payment = sum;  
        }
        else if (sum <= 1000)
        {
            payment = sum * 0.95;
        }
        else
        {
            payment = sum * 0.90;
        }
        return payment;
    }
    
    // v) toString 
    public String toString()
    {
        return "\nDate : " +date + "\nReceived from : " +nameReceived +"\nSum : " +sum +"\nBeing payment to : " +aimPayment + "\nIssued by : " +assignedBy;
    }
    
    //b)
    public static void main(String [] args)
    {
        Receipt rcp = new Receipt ();
        Scanner s = new Scanner (System.in);
        
        String dt, by, forP;
        double pr;
        
        System.out.println("Enter date receipt: ");
        dt = s.nextLine();
        
        System.out.println("Enter name: ");
        by = s.nextLine();
        
        System.out.println("Enter sum receipt: ");
        pr = s.nextDouble();
        
        System.out.println("Enter aim payment receipt: ");
        forP = s.nextLine();
    }
}
