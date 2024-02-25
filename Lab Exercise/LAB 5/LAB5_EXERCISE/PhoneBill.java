
public class PhoneBill
{
    private String staffNo;
    private String name;
    private String deptName;
    private int minutes;
    
    //normal constructor with parameter
    public PhoneBill(String staffID, String staffName, String staffDepartment, int workingHour)
    {
        staffNo = staffID;
        name = staffName;
        deptName = staffDepartment;
        minutes = workingHour;
    }

    //mutator
    public void setData(String newStaffID, String newStaffName, String newStaffDepartment, int newWorkingHour)
    {
        this.staffNo = newStaffID;
        this.name = newStaffName;
        this.deptName = newStaffDepartment;
        this.minutes = newWorkingHour;
    }
    
    //retriever, accessor
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
        double cent=0;
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
    
    //printer
    public String toString()
    {
        return "Staff ID : " + staffNo + " Name : " + name + " Department : " + deptName + " Working hour : " + minutes + " Phone bill : " + calPhoneBill();
    }
}
