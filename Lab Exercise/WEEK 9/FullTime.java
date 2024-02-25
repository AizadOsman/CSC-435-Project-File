
public class FullTime extends Employee //inheritance
{
    double baseSalary;
    double allowance;
    int rate;
    int hourWork;
    
    public FullTime()
    {
        super(); // super() is from main class Employee attribute - name,empNo
        baseSalary = 2000.0;
        allowance = 500.0;
        rate = 12;
        hourWork = 1000;
    }
    
    public FullTime(String n, String nn, double s, double a, int r, int hw)
    {
        super(n, nn); // super() is from main class Employee attribute - name,empNo
        baseSalary = s;
        allowance = a;
        rate = r;
        hourWork = hw;
    }
    
    public double getSalary()
    {
        return baseSalary;
    }
    public double getAll()
    {
        return allowance;
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
        System.out.println("Salary : " +getSalary());
        System.out.println("Allowance : " +getAll());
        System.out.println("Rate : " +getR());
        System.out.println("Number of working hour : " +getHr());
    }
    
    public double calSalary()
    {
        return (getSalary() + getAll() + (getR() * getHr()));
    }
}
