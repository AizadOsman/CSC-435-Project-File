
import java.util.*;
public class ElectionApp //main methods
{
    public static void main(String [] args) //main method
    {
        Scanner s = new Scanner (System.in); //int
        Scanner ss = new Scanner (System.in); //string
        Election [] e = new Election [3]; //instance variable
        String name, area, party;
        int age, numPoll;
        int num = 0;
        
        for(int i = 0; i<e.length; i++)
        {
            System.out.println("Enter the name of candidate: ");
            name = ss.nextLine();
            System.out.println("Enter the age of the candidate: ");
            age = s.nextInt();
            System.out.println("Enter the party of the candidate: ");
            party = ss.nextLine();
            System.out.println("Enter the area of the candidate: ");
            area = ss.nextLine();
            System.out.println("Enter number of polls: ");
            numPoll = s.nextInt();
            e[i] = new Election (name, age, party, area, numPoll);
        }
        
        for (int k=0; k<e.length; k++)
        {
            num = e[k].determineWinner(e);
        }
        System.out.println("The new index of winner : " +num);
        
    }
}
