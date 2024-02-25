
//Parent class
public class Employee
{
    String name;
    String empNo;
    
    public Employee()
    {
        name = "Ali";
        empNo = "12222";
    }
    
    public Employee(String name, String empNo)
    {
        this.name = name;
        this.empNo = empNo;
    }
    
    public void setEmployee(String name, String empNo)
    {
        this.name = name;
        this.empNo = empNo;
    }
    
    public String getName()
    {
        return name;
    }
    public String getNo()
    {
        return empNo;
    }
    
    public void display()
    {
        System.out.println("Name of employee " +getName());  
        System.out.println("Employee number/id " +getNo());  
    }
    
    public static void main(String [] args)
    {
        Employee employee1 = new Employee();
        employee1.display();
        FullTime fulltimer1 = new FullTime();
        employee1.display();
        PartTime parttimer1 = new PartTime();
        employee1.display();
    }
}
