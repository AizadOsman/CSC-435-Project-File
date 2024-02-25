

public class Employee
{
    // instance variables - replace the example below with your own
    private String firstName;
    private String lastName;
    private int age;

    public Employee() //normal constructor method without parameter
    {
        firstName = "Aizad";
        lastName = "Osman";
        age = 21;
    }
    
    public static void main(String [] args) // main method
    {
        Employee xc = new Employee(); //instance declaration
        System.out.println(xc.firstName);
        System.out.println(xc.lastName);
        System.out.println(xc.age);
    }
}
