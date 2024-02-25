
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class LabelTest extends JFrame
{
    private JLabel label1, label2, label3;
    private Container c;
    
    public LabelTest()
    {
        setTitle("Testing JLabel");
        setSize(300,200);
        setLocation(200,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        c = getContentPane();
        c.setLayout(new FlowLayout());
        
        label1 = new JLabel("Diploma in Computer Science");
        label2 = new JLabel("B.Sc (Hons) Information Technology");
        label3 = new JLabel("B.Sc (Hons) Data Communication and Network");
        c.add(label1);
        c.add(label2);
        c.add(label3);
        setVisible(true);
    }

    public static void main(String [] args)
    {
        LabelTest labelApp = new LabelTest();
    }
}
