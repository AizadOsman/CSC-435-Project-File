
public class Rectangle
{
    // instance variables - replace the example below with your own
    private double width;
    private double length;

    //normal constructor without parameter
    public Rectangle()
    {
        // initialise instance variables
        width = 20;
        length = 30;
    }
    
    //mutator or setter
    public void setData(double w, double l) //tak perlu this.width or this.length
    {
        width = 'w';
        length = 'l';
    }
    
    //printer
    public void displayData()
    {
        System.out.println("Width: " + width);
        System.out.println("Length: " + length);
    }
}
