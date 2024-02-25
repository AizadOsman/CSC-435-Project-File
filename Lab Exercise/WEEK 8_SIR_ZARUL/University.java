import java.io.*;
import java.util.*;

//University has more than one college
class University
{
    //reference to refer to list of college
    private final List<College> colleges;
    University(List<College> colleges)
    {
        this.colleges = colleges;
    }
    
    //Getting total number of colleges
    public List<College> getTotalCollegesInUniversity()
    {
        return colleges;
    }
}
