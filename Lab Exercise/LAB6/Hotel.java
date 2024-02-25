
public class Hotel
{
    private String custIC;
    private String roomType;
    private int days;
    
    //Normal constructor
    public Hotel(String ic, String room, int day)
    {
        this.custIC = ic;
        this.roomType = room;
        this.days = day;
    }
    
    //printer toString
    public String toString()
    {
        return "Customer IC : " +custIC +"\nRoom Type : " +roomType +"\nNumber of days : " +days;
    }
    
    //calcRate
    public double calcRate()
    {
        double roomRate=0.0;
        
        if (roomType.equals("Superior"))
        {
            roomRate = 150;
        }
        else if (roomType.equals("Deluxe"))
        {
            roomRate = 200;
        }
        else if (roomType.equals("Executive"))
        {
            roomRate = 300;
        }
        return roomRate;
    }
    
    //calcCost
    public double calcCost()
    {
        return (calcRate() * days);
    }
}