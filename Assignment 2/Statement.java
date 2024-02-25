
import java.util.Scanner;
import java.text.DecimalFormat;
import java.math.RoundingMode;
public class Statement
{   
    private static final DecimalFormat df = new DecimalFormat ("0.00");
    
    //Processor (calculate & return the price of room)
    static double calRcharge(int days, String rtype)
    {
        String room_type_name = " ";
        double room_charges = 0.00;
        
        if (rtype.equals("P"))
        {
            room_type_name=("Private Room");
            room_charges = days * 180;            
        }
        
        else if (rtype.equals("S"))
        {
            room_type_name=("Semi-private Room");
            room_charges = days * 120;
        }
        
        else if (rtype.equals("W"))
        {
            room_type_name=("Ward");
            room_charges = days * 75;
        }
            return room_charges;
    }    
    
    // to calc & return the telephone charge
    static double calPcharge(int days, String telephone_used)
    {   
        double telephone_charges = 0.00;
        
        if (telephone_used.equals("Y") || telephone_used.equals("y")) {
            telephone_charges = (days*1.75);
            }
        else if(telephone_used.equals("N") || telephone_used.equals("n")) {
            telephone_charges = 0;
            }
        return telephone_charges;
    }
    
    // to calc & return the television charge
    static double calTcharge(int days, String television_used)
    {   double television_charges = 0.00;
        
        if (television_used.equals("Y") || television_used.equals("y")) {
            television_charges = days*3.50;
            }
        else if(television_used.equals("N") || television_used.equals("n")) {
            television_charges = 0;
            }
        return television_charges;
    }
    
    public static void main (String [] args)
    {
        Scanner ab = new Scanner (System.in);
        
        int days = 0, choice = 0;
        String answer= "", rtype= "", telephone_used= "" , television_used= "", room_type_name= "";
        double totaldue=0.00, television_charges=0.00, telephone_charges=0.00, room_charges=0.00;
        double totalincome= 0.00, sumtelevision_charges=0.00, sumtelephone_charges=0.00, sumroom_charges=0.00;
        
        System.out.println("----------------- CEMPAKA HOSPITAL --------------------");
        System.out.println("\n---------------    MAIN MENU   ----------------------");
        System.out.println("\n 1) Compute and print bill");
        System.out.println("\n 2) - Quit");
        System.out.println("\n Enter your choice? [1/2]");
        choice = ab.nextInt();
        do {

            // display if compute
            if (choice == 1){
                System.out.println("Enter number of days in hospital: ");
                days = ab.nextInt();
                System.out.println("Enter type of room: \n[P - private room, S - Semi-private room and W - Ward] ");
                rtype = ab.next();
                System.out.println("Did you use the telephone facility? [Y/N]: ");
                telephone_used = ab.next();
                System.out.println("Did you use the television facility? [Y/N]: ");
                television_used = ab.next();
 
            }
            // display if quit
            else if (choice == 2){
                sumroom_charges = sumroom_charges + room_charges;
                sumtelephone_charges = sumtelephone_charges + telephone_charges;
                sumtelevision_charges = sumtelevision_charges + television_charges;
                totalincome = sumroom_charges + sumtelephone_charges + sumtelevision_charges;
                
                System.out.println("~~~~~ CEMPAKA HOSPITAL ~~~~~~~");
                System.out.println("~~~~~~ INCOME SUMMARY ~~~~~~");
                System.out.println("\nTotal Room Charge             : RM" +df.format(sumroom_charges));
                System.out.println("\nTotal Telephone Charge        : RM" +df.format(sumtelephone_charges));
                System.out.println("\nTotal Television Charge       : RM" +df.format(sumtelevision_charges));
                System.out.println("\nTOTAL INCOME                  : RM" +df.format(totalincome)); 
            }
            System.out.println("\nDo you still want to calculate another patient's bill? [Y/N]: ");
            answer = ab.next();
        } while (answer.equals("Y") || answer.equals("y"));                
                                
        room_charges = calRcharge(days, rtype);
        telephone_charges = calPcharge(days, telephone_used);
        television_charges = calTcharge (days, television_used);
        totaldue = room_charges+telephone_charges+television_charges;
                
        //print patient billing 
        System.out.println("~~~~~ CEMPAKA HOSPITAL ~~~~~~~");
        System.out.println("~~~~ PATIENT BILLING STATEMENT ~~~~~");
        System.out.println("");
        System.out.println("\nNumber of Days in Hospital      : " +(days));
        System.out.println("\nType of Room                    : " +(room_type_name));
        System.out.println("\nRoom Charge                     : " +df.format(room_charges));
        System.out.println("\nTelephone Charge                : " +df.format(telephone_charges));
        System.out.println("\nTelevision Charge               : " +df.format(television_charges));
        System.out.println("");
        System.out.println("\nTOTAL DUE                       : " +df.format(totaldue)); 
    }    
}
