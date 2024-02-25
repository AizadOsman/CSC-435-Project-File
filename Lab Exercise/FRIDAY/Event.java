//array size determined by user

import java.util.*;
public class Event
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("How many events do you want to enter: ");
        int Event = sc.nextInt();
        Event arrEvent[] = new Event[10];
        
        for(int i=0; i<arrEvent.length; i++)
        {
           System.out.println("Please enter event ID: ");
           String eventID = sc.next();
           
           System.out.println("Please enter event organizer: ");
           String eventOrganizer = sc.next();
           
           System.out.println("Please enter the name of the event: ");
           String eventName = sc.next();
           
           System.out.println("Please enter the day of the event: ");
           int day = sc.nextInt();
           
           System.out.println("Please enter the month of the event: ");
           String month = sc.next();
           
           System.out.println("Please enter the year of the event: ");
           int year = sc.nextInt();
           
           System.out.println("Please enter the budget for the event: ");
           double eventBudget = sc.nextDouble();
           
           arrEvent[i] = new Event (eventID, eventOrganizer, eventName, day, month, year, eventBudget);
        }
        
        //find event
        for (int i=0; i<Event; i++)
        {
            if (arrEvent[i].getEventOrganizer.equals("CS230") && arrEvent[i].getEventDate.equals("January", 2023))
            {
                System.out.println("Event ID: " +eventID +"Event name: " +eventName +"Budget: " +eventBudget);
            }
            else 
            {
                System.out.println("The event doesn't exist!");
            }
        }
        
        //count and list events with budget more than 25000
        for (int i=0; i<Event; i++)
        {
            if (arrEvent[i].getEventBudget > 25000)
            {
                System.out.println("Event ID: " +eventID);
                System.out.println("Event organizer: " +eventOrganizer);
                System.out.println("Event name: " +eventName);
                System.out.println("Event date: " +getEventDate());
                System.out.println("Event budget: " +eventBudget);
            }
        }
    }
}