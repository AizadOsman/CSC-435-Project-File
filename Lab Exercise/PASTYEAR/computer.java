
public class computer
{
  private double price;
  private String model;
  private static int yearMade;
  private static int serialNo;
  
  public computer(double price, String model, int year, int serial)
  {
      this.price = price;
      this.model = model;
      this.yearMade = year;
      this.serialNo = serial;
  }
  //2 instance variable = year, serial
  //2 class variable = price, model
}
