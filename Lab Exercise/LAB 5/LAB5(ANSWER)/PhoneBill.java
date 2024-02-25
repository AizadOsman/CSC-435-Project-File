import java.util.*;
public class PhoneBill
{
    private String staffNo;
    private String name;
    private String deptName;
    private int minutes;
    
    //Question a.i) (normal constructor with parameter) // dalam soalan kalau tak mention with/w o parameter, buat je parameter
    public PhoneBill(String staffNo, String name, String deptName, int minutes)
    {
        this.staffNo = staffNo;
        this.name = name;
        this.deptName = deptName;
        this.minutes = minutes;
    }
    
    //Question a. ii) (accessor/retriever/getter) // lepas get besarkan huruf e.g getStaff
    public String getStaffNo()
    {
        return staffNo;
    }
    public String getName()
    {
        return name;
    }
    public String getDeptName()
    {
        return deptName;
    }
    public int getMinutes()
    {
        return minutes;
    }
    
    //Question a. iii) (printer toString method)
    public String toString ()
    {
        return "Staff No: "+staffNo+ "\nName: "+name+ "\nDept Name: "+deptName+ "\nMinutes: "+minutes;
    }
    
    //Question a.iv) (processor)
    public double calPhoneBill()
    {
        double billAmt = 0.0;
        
        if(minutes <=100)
        {
            billAmt = minutes * 0.20;
        }
        else if (minutes <=250)
        {
            billAmt = 100 * 0.20 + (minutes - 100) * 0.35;
        }
        else
        {
            billAmt = 100 * 0.20 + 150 * 0.35 + (minutes - 250) * 0.15;
        }
        return billAmt;
    }
    
    //Question b.i) (create array of 50)
    public static void main(String [] args)
    {
        Scanner inp = new Scanner (System.in);
        PhoneBill arrPhone[] = new PhoneBill[50];
        
        for(int i=0; i<50; i++)
        {
            System.out.println("Staff Id: ");
            String staffNo = inp.next();
            
            System.out.println("Name: ");
            String name = inp.next();
            
            System.out.println("Department name (HRM/SALE/ACCT): ");
            String deptName = inp.next();
            
            System.out.println("Minutes: ");
            int minutes = inp.nextInt();
            
            arrPhone[i] = new PhoneBill (staffNo, name, deptName, minutes);
        }
        
        //Question b.ii)
        double totalHRM=0.0, totalSALE=0.0, totalACCT=0.0;
        for(int i=0; i<50; i++)
        {
            if(arrPhone[i].getDeptName().equals("HRM"))
            totalHRM += arrPhone[i].calPhoneBill();
            else if (arrPhone[i].getDeptName().equals("SALE"))
            totalSALE += arrPhone[i].calPhoneBill();
            else if (arrPhone[i].getDeptName().equals("ACCT"))
            totalACCT += arrPhone[i].calPhoneBill();
        }
        System.out.println("Phone bill amount fot HRM : " +totalHRM);
        System.out.println("Phone bill amount fot SALE : " +totalSALE);
        System.out.println("Phone bill amount fot ACCT : " +totalACCT);
    }
}
