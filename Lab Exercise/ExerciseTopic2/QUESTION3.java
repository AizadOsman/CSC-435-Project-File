import java.util.Arrays;
public class QUESTION3
{
  public static void main(String [] args)
  {
      int num[] = {1,2,3,4,5,6,7,8,9,10};
      int length = num.length;
      
      //Print all number in the array
      System.out.println("The number in the array is: " +Arrays.toString(num));
      
      //Print the highest number in the array
      int max= Arrays.stream(num).max().getAsInt();
      System.out.println("The largest number in the array is " +max);
      
      //Summation of the number in the array
      int sum=0;
      for(int i=0; i<num.length; i++)
      {
          sum = sum + num[i];
      }
      System.out.println("The sum up of all of the number is: " +sum);
      
      //Average of the number in the array
      float average = (float)sum / length;
      System.out.println("The average of the number is: " +average);
  }
} 
