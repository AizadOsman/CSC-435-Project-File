
public class Rectangle2
{
    // instance variables - replace the example below with your own
    private double width;
    private double length;

    //normal constructor without parameter ()
    public Rectangle2()
    {
        // initialise instance variables
        width = 20;
        length = 30;
    }
    
    //accessor
    public double getWidth()
    {
        return width;
    }
    public double getLength()
    {
        return length;
    }
    
    //printer
    public void displayData()
    {
        System.out.println("Width: " + getWidth());
        System.out.println("Length: " + getLength());
    }
}
