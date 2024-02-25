

public class QUESTION5
{
   public static void main(String [] args)
   {
       int a=10, b=5, c=3, d=4, e=2, x, x2, y,y2, z;
        x = a * b - c + d / e;
        x2 = a * b % e;
        y = a * (b-c) + d / e;
        y2 = a + b * d % e;
        z = a * (b - (c + d) / e);
        
        System.out.println(x +" "+ y +" "+ z +" "+ x2 +" "+ y2);
   }
}
