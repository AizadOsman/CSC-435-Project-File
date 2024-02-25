import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.border.*;

public class CheckBoxTest extends JFrame implements ItemListener
{
    private JLabel lblinfo;
    private JTextField txtinfo;
    private JCheckBox cs110, cs220, cs225;
    private JPanel panelNorth, panelSouth;
    private Container c;
    
    public CheckBoxTest()
    {
        setTitle("Testing CheckBox");
        setSize(400,150);
        setLocation(200,200);
        
        c = getContentPane();
        c.setLayout(new BorderLayout());
        
        panelNorth = new JPanel();
        panelNorth.setLayout(new GridLayout(2,1));
        
        panelSouth = new JPanel();
        panelSouth.setLayout(new GridLayout(1,3));
        panelSouth.setBorder(new TitledBorder(new EtchedBorder(), "Select the program code"));
        
        lblinfo = new JLabel("Program Information: : ",SwingConstants.LEFT);
        
        txtinfo = new JTextField(50);
        
        cs110 = new JCheckBox("CS110");
        cs220 = new JCheckBox("CS220");
        cs225 = new JCheckBox("CS225");
        
        txtinfo.setEditable(false);
        
        cs110.addItemListener(this);
        cs220.addItemListener(this);
        cs225.addItemListener(this);
        
        panelNorth.add(lblinfo);
        panelNorth.add(txtinfo);
        
        panelSouth.add(cs110);
        panelSouth.add(cs220);
        panelSouth.add(cs225);
        
        c.add(panelNorth, BorderLayout.NORTH);
        c.add(panelSouth, BorderLayout.SOUTH);
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void itemStateChanged(ItemEvent e)
    {
       if (e.getSource() == cs110)
       {
           txtinfo.setText("Diploma in Computer Science");
       } 
       else if (e.getSource() == cs220)
       {
           txtinfo.setText("B.Sc (Hons) Information Technology");
       } 
       else if (e.getSource() == cs225)
       {
           txtinfo.setText("B.SC (Hons) Data Communication and Networking");
       }
    }
    
    public static void main (String [] args)
    {
        CheckBoxTest app = new CheckBoxTest();
    }
}
