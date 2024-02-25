
import java.util.*;
public class Hotel
{
    private String custIC;
    private String roomType;
    private int days;
    
    //i - normal constructor
    public Hotel(String cust, String room, int day)
    {
        this.custIC = cust;
        this.roomType = room;
        this.days = day;
    }
    
    //ii - printer toString()
    public String toString()
    {
        return "CustIC = " +custIC +"\nRoom type = " +roomType +"\nDays = " +days;
    }
    
    //iii - calculate calcRate() 
    double rate_amount = 0.0;
    public double calcRate()
    {
        if(roomType.equals("Superior"))
        {
            rate_amount = 150;
        }
        else if(roomType.equals("Deluxe"))
        {
            rate_amount = 200;
        }
        else if(roomType.equals("Executive"))
        {
            rate_amount = 300;
        }
        return rate_amount;
    }
    
    //calculate calcCost
    double cost=0.0;
    public double calcCost()
    {
        if(roomType.equals("Superior"))
        {
            cost = 150 * days;
        }
        else if(roomType.equals("Deluxe"))
        {
            cost = 200 * days;
        }
        else if(roomType.equals("Executive"))
        {
            cost = 300 * days;
        }
        return cost;
    }
    
    //accessor
    public String getCustIC()
    {
        return custIC;
    }
    public String getRoomType()
    {
        return roomType;
    }
    public int getDays()
    {
        return days;
    }
    public double getTotal_cost()
    {
        return cost;
    }
    
    //b i) ii)
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Hotel listHotel[] = new Hotel[3];
        
        for (int i=0; i<3; i++)
        {
            System.out.println("Please enter your identity card number: ");
            String custIC = sc.next();
            
            System.out.println("Choose your room type [Superior/Deluxe/Executive]: ");
            String roomType = sc.next();
            
            System.out.println("How many day(s) you wish to stay ? : " );
            int days = sc.nextInt();
            
            System.out.println(""); // skip one line
            
            listHotel[i] = new Hotel (custIC, roomType, days);
        }
        
        //b iii)
        for (int i=0; i<3; i++)
        {
            if (listHotel[i].getCustIC().equals("810205118789"))
            {
              System.out.println("Customer IC   : "+listHotel[i].getCustIC());
              System.out.println("Room type     :" +listHotel[i].getRoomType());
              System.out.println("Period day    : "+listHotel[i].getDays());
            }
        }
        System.out.println("Sorry, there is no customer ID (810205118789) found in the record !");
        
        //b) iv)
        double total_cost=0.0;
        for (int i=0; i<3; i++)
        {
            if(listHotel[i].getRoomType().equals("Superior"))
            {
                total_cost = listHotel[i].calcCost();
            }
            else if(listHotel[i].getRoomType().equals("Deluxe"))
            {
                total_cost = listHotel[i].calcCost();
            }
            else if(listHotel[i].getRoomType().equals("Executive"))
            {
                total_cost = listHotel[i].calcCost();
            }
        }
        
        //display output
        for (int i=0; i<3; i++)
        {
            System.out.println("Customer ID : " +listHotel[i].getCustIC());
            System.out.println("Room Type   : " +listHotel[i].getRoomType());
            System.out.println("Period day  : " +listHotel[i].getDays());
            System.out.println("Total cost  : " +listHotel[i].getTotal_cost());
            System.out.println(""); //for skip one line
        }
    }
}
