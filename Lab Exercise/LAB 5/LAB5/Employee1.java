
public class Employee1
{
    // instance variables - replace the example below with your own
    private String firstName;
    private String lastName;
    private int age;

    public Employee1(String fn, String ln, int age) //normal constructor method with parameter
    {
       this.firstName = fn; 
       this.lastName = ln; 
       this.age = age; 
    }
    
    public static void main(String [] args) // main method
    {
        Employee1 xc = new Employee1("Aizad", "Osman", 21); //instance declaration
        System.out.println(xc.firstName);
        System.out.println(xc.lastName);
        System.out.println(xc.age);
    }
}