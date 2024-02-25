
public class Employee2 //default constructor
{
    // instance variables - replace the example below with your own
    private String firstName;
    private String lastName;
    private int age;
    
    public static void main(String [] args) // main method
    {
        Employee2 xc = new Employee2(); //instance declaration
        xc.firstName = "Aizad";
        xc.lastName = "Osman";
        xc.age = 21;
        
        System.out.println(xc.firstName);
        System.out.println(xc.lastName);
        System.out.println(xc.age);
    }
}