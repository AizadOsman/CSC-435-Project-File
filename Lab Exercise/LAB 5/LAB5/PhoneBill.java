//QUESTION A (I,II,III,IV)
public class PhoneBill
{
    private String staffNo;
    private String name;
    private String deptName;
    private int minutes;
    private double cent;
    
    //normal constructor
    public PhoneBill()
    {
        staffNo = "S013";
        name = "Aiman Syafiq";
        deptName = "Sale";
        minutes = 120;
    }
    
    public static void main(String [] args)
    {
        PhoneBill xc = new PhoneBill();
        System.out.println(xc.staffNo);
        System.out.println(xc.name);
        System.out.println(xc.deptName);
        System.out.println(xc.minutes);
    }
    
    //accessor,retriever
    public String getstaffNo()
    {
        return staffNo;
    }
    public String getname()
    {
        return name;
    }
    public String getdeptName()
    {
        return deptName;
    }
    public int getminutes()
    {
        return minutes;
    }
    
    //processor
    public double calPhoneBill()
    {
        if (minutes <= 100)
        {
            cent = 0.20;
        }
        else if (minutes >100 && minutes <=150) 
        {
            cent = 0.35;
        }
        else if (minutes > 150)
        {
            cent = 0.15 * minutes;
        }
        return (cent);
    }
    
    //printer toString
    public String toString()
    {
        return "Staff ID = " + staffNo + "\nStaff Name = " + name + "\nDepartment = " + deptName + "\nWorking hour : " +minutes + "\nPhone Bill : " +calPhoneBill();
    }
} 
