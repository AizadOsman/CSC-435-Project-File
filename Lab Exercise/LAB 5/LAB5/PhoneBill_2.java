
public class PhoneBill_2
{
    private String staffNo;
    private String name;
    private String deptName;
    private int minutes;
    private double cent;
    
    public PhoneBill_2(String sn, String n, String dn, int m, double c)
    {
      this.staffNo = sn;
      this.name = n;
      this.deptName = dn;
      this.minutes = m;
      this.cent = c;
    }
    
    public static void main(String [] args) // main method
    {
        PhoneBill_2 xc = new PhoneBill_2("s100", "Aiman Syafiq", "Sale", 120, 0.35); //instance declaration
        System.out.println(xc.staffNo);
        System.out.println(xc.name);
        System.out.println(xc.deptName);
        System.out.println(xc.minutes);
        System.out.println(xc.cent);
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
