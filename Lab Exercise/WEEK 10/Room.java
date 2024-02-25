import java.util.*;
public class Room extends Patient
{
    String typeRoom;
    int noDay;
    
    //normal constructor
    public Room (String name, int num, String address, String room, int day)
    {
        super(name,num,address);
        this.typeRoom = room;
        this.noDay = day;
    }
    
    //mutator,setter
    public void setRoom(String name, int num, String address, String room, int day)
    {
        super.setPatient(name,num,address);
        typeRoom = room;
        noDay = day;
    }
    
    //retriever
    public String getTypeRoom()
    {
        return typeRoom;
    }
    public int getNoDay()
    {
        return noDay;
    }
    
    //printer
    public void display()
    {
        super.display();
        System.out.println("Room type       : " +getTypeRoom());
        System.out.println("Period (days)   : " +getNoDay());
    }
    
    //a) ii
    public double calcPayment()
    {
        double roomPrice = 0.0; 
        double normalPrice = 0.0;
        double totalPayment = 0.0;
        double discountPrice = 0.0;
        
        if (typeRoom == "Diamond")
        {
            roomPrice = 200.00;
            normalPrice = roomPrice * noDay;
        }
        else if (typeRoom == "Gold")
        {
            roomPrice = 100.00;
            normalPrice = roomPrice * noDay;
        }
        else if (typeRoom == "Silver")
        {
            roomPrice = 80.00;
            normalPrice = roomPrice * noDay;
        }
        else if (typeRoom == "Bronze")
        {
            roomPrice = 50.00;
            normalPrice = roomPrice * noDay;
        }
        
        if(noDay >= 20)
        {
            double discount20 = 0.25;
            discountPrice = normalPrice * 0.25;
        }
        
        totalPayment = roomPrice - discountPrice;
        return totalPayment;
    } 
    
    //b
    /*public static void  main(String [] args)
    {
       Scanner sc = new Scanner(System.in);
       Patient arrPatient [] = new Patient[50];
       
       for(int i=0; i<50; i++)
       {
           System.out.println("Please enter patient name : ");
           String patientName = sc.next();
           
           System.out.println("Please enter patient number : ");
           int patientNumber = sc.nextInt();
           
           System.out.println("Please enter patient address : ");
           String patientAddress = sc.next();
           
           System.out.println("Please enter room type : ");
           String typeRoom = sc.next();
           
           System.out.println("Please enter period days : ");
           int noDay = sc.nextInt();
           
           System.out.println("");
           
           arrPatient[i] = new Patient (patientName, patientNumber, patientAddress, typeRoom, noDay);
       }
       
       //b) ii
       int count20 = 0;
       for(int i=0; i<3; i++)
       {
           if(arrPatient[i].noDay >= 20 )
           {
               count20 ++;
           }
       }
       System.out.println("The number of patient that stay more than 20 days : " +count20++);
       
       //b) iii
       double totalPayment=0.0; int day = 0;
       for(int i=0; i<50; i++)
       {
        totalPayment += arrPatient[i].calcPayment();
        day += arrPatient[i].getNoDay();
       }
       double totalAverage = totalPayment / day;
       System.out.println("The average collection for the day : " +totalAverage);
    }*/
}

