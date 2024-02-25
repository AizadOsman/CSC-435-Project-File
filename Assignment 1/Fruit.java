
import java.util.Scanner;
public class Fruit
{
   private String nameFruit;
   private String typeFruit;
   private double priceFruit;
   private int quantityFruit;
   
   //Normal constructor with parameter
   public Fruit(String name, String type, double price, int quantity)
   {
       this.nameFruit= name;
       this.typeFruit = type;
       this.priceFruit = price;
       this.quantityFruit = quantity;
   }
    
   //Accessor
   public String getNameFruit()
   {
       return nameFruit;
   }
   public String getTypeFruit()
   {
       return typeFruit;
   }
   public double getPriceFruit()
   {
       return priceFruit;
   }
   public int getQuantityFruit()
   {
       return quantityFruit;
   }
   
   //Mutator,Setter
   public void setData (String name, String type, double price, int quantity)
   {
       nameFruit = name;
       typeFruit = type;
       priceFruit = price;
       quantityFruit = quantity;
   }
   
   //Printer
   public void displayData()
   {
       System.out.println("Fruit name : " + nameFruit);
       System.out.println("Fruit type : " + typeFruit);
       System.out.println("Fruit price : " + priceFruit);
       System.out.println("Fruit quantity : " + quantityFruit);
   }
   

   public double calFruitPrice()
   {
       double flat_discount = 0.03;
       double normal_price;
       double total_discount;
       double discount_price;
       double totalFruitPrice = 0.0;
       
       if (typeFruit.equals("Berry") || typeFruit.equals("Pepo"))
       {
           total_discount = 0.04 + flat_discount;
           normal_price = priceFruit * quantityFruit;
           discount_price = normal_price * total_discount;
           totalFruitPrice = normal_price - discount_price;
       }
       else if (typeFruit.equals("Pome") || typeFruit.equals("Drupe"))
       {
           total_discount = 0.05 + flat_discount;
           normal_price = priceFruit * quantityFruit;
           discount_price = normal_price * total_discount;
           totalFruitPrice = normal_price - discount_price;
       }

       return totalFruitPrice;
   }
   
   //Question b.i,ii
   public static void main(String [] args)
   {
       Scanner sc = new Scanner (System.in);
       Fruit arrFruit[] = new Fruit[10];

       for (int i=0; i<10; i++)
       {
           System.out.println("Please enter fruit: ");
           String nameFruit = sc.next();
           
           System.out.println("Please enter fruit type: ");
           String typeFruit = sc.next();
           
           System.out.println("Please enter the fruit price: ");
           double priceFruit = sc.nextDouble();
           
           System.out.println("Please enter the quantity of the fruit: ");
           int quantityFruit = sc.nextInt();
           
           System.out.println(""); // for skip one line

           arrFruit[i] = new Fruit (nameFruit, typeFruit, priceFruit, quantityFruit);
       }
       
       //Question b.iii
       int countBerry=0, countPome=0, countPepo=0, countDrupe=0;
       for(int i=0; i<10; i++)
       {
           if(arrFruit[i].getTypeFruit().equals("Berry"))
           {
               countBerry += arrFruit[i].getQuantityFruit();
           }
           else if(arrFruit[i].getTypeFruit().equals("Pome"))
           {
               countPome += arrFruit[i].getQuantityFruit();
           }
           else if(arrFruit[i].getTypeFruit().equals("Pepo"))
           {
               countPepo += arrFruit[i].getQuantityFruit();
           }
           else if(arrFruit[i].getTypeFruit().equals("Drupe"))
           {
               countDrupe += arrFruit[i].getQuantityFruit();
           }
       }
       System.out.println("The quantity of Berry fruit is : " +countBerry);
       System.out.println("The quantity of Pome fruit is : " +countPome);
       System.out.println("The quantity of Pepo fruit is : " +countPepo);
       System.out.println("The quantity of Drupe fruit is : " +countDrupe);
       System.out.println(""); // for skip one line
           
       //Question b.iv
       double totalBerry=0.0, totalPome=0.0, totalPepo=0.0, totalDrupe=0.0;
       for (int i=0; i<10; i++)
       {
           if(arrFruit[i].getTypeFruit().equals("Berry"))
           {
               totalBerry += arrFruit[i].calFruitPrice();
           }
           else if (arrFruit[i].getTypeFruit().equals("Pome"))
           {
               totalPome += arrFruit[i].calFruitPrice();
           }
           else if (arrFruit[i].getTypeFruit().equals("Pepo"))
           {
               totalPepo += arrFruit[i].calFruitPrice();
           }
           else if (arrFruit[i].getTypeFruit().equals("Drupe"))
           {
               totalDrupe += arrFruit[i].calFruitPrice();
           }
       }
       System.out.println("The total price of Berry Fruit : " +totalBerry);
       System.out.println("The total price of Pome Fruit : " +totalPome);
       System.out.println("The total price of Pepo Fruit : " +totalPepo);
       System.out.println("The total price of Drupe Fruit : " +totalDrupe);
       System.out.println(""); // for skip one line
       
       //Question b.v
       System.out.println("List of Pome and Pepo fruit with its price");
       for(int i=0; i<10; i++)
       {
           if (arrFruit[i].getTypeFruit().equals("Pome"))
           {
               System.out.println(arrFruit[i].getNameFruit() +" : "+ +arrFruit[i].calFruitPrice());
           }
           else if (arrFruit[i].getTypeFruit().equals("Pepo"))
           {
               System.out.println(arrFruit[i].getNameFruit() +" : "+ +arrFruit[i].calFruitPrice());
           }
       }
   }
}
