
public class Industry 
{
    private String code;
    private String name;
    private double yearRevenue;
    private double yearService;
    
    // a) normal constructor
    public Industry (String c, double yr, double ys)
    {
        code = c;
        yearRevenue = yr;
        yearService = ys;
    }
    
    // b) overloaded constructor
    Industry (String code)
    {
        this.code = code;
    }
    Industry (String code, String name)
    {
        this.code = code;
        this.name = name;
    }
    
    // c) Accessor
    public String getCode()
    {
        return code;
    }
    public String getName()
    {
        return name;
    }
    public double getYearRevenue()
    {
        return yearRevenue;
    }
    public double getYearService()
    {
        return yearService;
    }
    
    // d) print toString
    public String toString()
    {
        return ("Code " +code +"Name " +name +"Revenue for current year " +yearRevenue +"Year of services " +yearService);
    }
    
    // e) paytax()
    public double payTax()
    {
       double totalTax=0.0;
       double yearService=0.0;
       
       if (code.equals("IC01"))
       {
           if (yearService < 5)
           {
              totalTax = 0.05 * getYearRevenue(); 
           }
           else if (yearService >= 5)
           {
              totalTax = 0; 
           }
       }
       
       else if (code.equals("IC02"))
       {
           if (yearService < 5 )
           {
               totalTax = 0.10 * getYearRevenue();   
           }
           else if (yearService >= 5)
           {
               totalTax = 0.05 * getYearRevenue();
           }
       }
       
       else if (code.equals("IC03"))
       {
           if (yearService < 5)
           {
               totalTax = 0.15 * getYearRevenue();
           }
           else if (yearService >= 5)
           {
               totalTax = 0.10 * getYearRevenue();
           }
       }
       return totalTax;
    }
}
