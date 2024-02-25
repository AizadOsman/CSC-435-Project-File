

public class Bicycle
{
    private String ownerName; //Data Member
    
    //Constructor: Initializes the data member
    public Bicycle() //default constructor
    {
        ownerName = "Unknown";
    }
    public Bicycle(String name) //normal constructor
    {
        ownerName = name;
    }
    public String toString() //printer
    {
        String out = "The owner name: " +ownerName;
        return out;
    }
    public static void main (String [] args) //main method
    {
        Bicycle bike = new Bicycle ("Kamal");
        System.out.println(bike.toString());
    }
}
