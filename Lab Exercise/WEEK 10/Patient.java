import java.util.*;
public class Patient
{
    String patientName;
    int patientNumber;
    String patientAddress;
    String typeRoom;
    int noDay;
    
    //default constructor
    public Patient()
    {
        patientName = "";
        patientNumber = 0;
        patientAddress = "";
    }
    
    //normal constructor
    public Patient (String name, int num, String address)
    {
        this.patientName = name;
        this.patientNumber = num;
        this.patientAddress = address;
    }
    
    
    //constructor for main
    public Patient(String name, int num, String add, String room, int day)
    {
        patientName = name;
        patientNumber = num;
        patientAddress = add;
        typeRoom = room;
        noDay = day;
    }
    
    
    //mutator,setter
    public void setPatient(String name, int num, String address)
    {
        this.patientName = name;
        this.patientNumber = num;
        this.patientAddress = address;
    }
    
    //retriever
    public String getPatientName()
    {
        return patientName;
    }
    public int getPatientNumber()
    {
        return patientNumber;
    }
    public String getPatientAddress()
    {
        return patientAddress;
    }
    public int getNoDay()
    {
        return noDay;
    }
    
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
    
    
    //printer
    public void display()
    {
        System.out.println("Patient Name    : " +getPatientName());
        System.out.println("Patient Number  : " +getPatientNumber());
        System.out.println("Patient Address : " +getPatientAddress());
    }
    
    //b) i
    
    public static void  main(String [] args)
    {
       Scanner sc = new Scanner(System.in);
       Patient arrPatient [] = new Patient[3];
       
       for(int i=0; i<3; i++)
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
       double sumPayment=0;
       for(int i=0; i<3; i++)
       {
        sumPayment += arrPatient[i].calcPayment();
       }
       double totalAverage = sumPayment / arrPatient.length;
       System.out.println("The average collection for the day : " +totalAverage);
    } 
}
