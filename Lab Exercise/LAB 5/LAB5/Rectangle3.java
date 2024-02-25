
public class Rectangle3
{
    // instance variables - replace the example below with your own
    private double width;
    private double length;

    //normal constructor without parameter ()
    public Rectangle3()
    {
        // initialise instance variables
        width = 20;
        length = 30;
    }
    
    //processor
    public double calArea()
    {
        return (width * length);
    }
    
    //printer displayData()
    public void displayData()
    {
        System.out.println("Width: " + width);
        System.out.println("Length: " + length);
        System.out.println("Length: " + calArea());
    }
    
    //printer toString
    public String toString()
    {
        return "width = " + width + "\nLength = " + length + "\nArea = " + calArea();
    }
}