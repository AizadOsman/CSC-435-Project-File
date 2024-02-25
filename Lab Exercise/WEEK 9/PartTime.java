

public class PartTime extends Employee
{
    int rate;
    int hourWork;
    public PartTime()
    {
        super();
        rate = 12;
        hourWork = 1000;
    }
    
    public PartTime(String n, String nn, int r, int hw)
    {
        super(n, nn);
        rate = r;
        hourWork = hw;
    }
    
    public void setPartTime(String n, String nn, int r, int hw)
    {
        super.setEmployee(n, nn);
        rate = r;
        hourWork = hw;
    }
    
    public int getR()
    { 
        return rate; 
    }
    public int getHr()
    { 
        return hourWork; 
    }
    
    public void display()
    {
        super.display();
        System.out.println ("Rate " + getR());
        System.out.println ("Number of working hour " + getHr());
    }
        
    public double calSalary()
    {
        return (getR() * getHr());
    }
}
