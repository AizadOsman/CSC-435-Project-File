
public class Student
{
    private String stuNum;
    private String stuName;
    private String stuProg;
    private double cgpa;

    public Student()
    {
        stuNum = " ";
        stuName = " ";
        stuProg = " ";
        cgpa = 0.0;
    }
    
    public void setData(String s, String n, String p, double c)
    {
        stuNum = n;
        stuName = n;
        stuProg = p;
        cgpa = c;
    }
    
    public String toString()
    {
        return "Student ID : " +stuNum +"\nName : " +stuName +"\nProgram : " +stuProg +"\nCGPA : " +cgpa;
    }
}
