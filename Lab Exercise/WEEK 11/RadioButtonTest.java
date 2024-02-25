
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class RadioButtonTest extends JFrame implements ItemListener
{
    private JLabel lblnum1,lblnum2,lblresult;
    private JTextField txtnum1,txtnum2,txtresult;
    private JRadioButton sum, multiply;
    private ButtonGroup radioGroup;
    private Container c;
    
    public RadioButtonTest()
    {
        setTitle("Testing RadioButton");
        setSize(400,200);
        setLocation(200,200);
        
        c = getContentPane();
        c.setLayout(new GridLayout(4,2));
        
        lblnum1 = new JLabel("Enter first number : ",SwingConstants.LEFT);
        lblnum2 = new JLabel("Enter second number : ",SwingConstants.LEFT);
        lblresult = new JLabel("Result : ",SwingConstants.LEFT);
        
        txtnum1 = new JTextField(15);
        txtnum2 = new JTextField(15);
        txtresult = new JTextField(15);
        
        sum = new JRadioButton("Sum");
        multiply = new JRadioButton("Multiply");
        
        radioGroup = new ButtonGroup();
        radioGroup.add(sum);
        radioGroup.add(multiply);
        
        txtresult.setEditable(false);
        sum.addItemListener(this);
        multiply.addItemListener(this);
        
        c.add(lblnum1);
        c.add(txtnum1);
        c.add(lblnum2);
        c.add(txtnum2);
        c.add(lblresult);
        c.add(txtresult);
        c.add(sum);
        c.add(multiply);
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    
    public void itemStateChanged(ItemEvent e)
    {
        float num1, num2, result;
        num1 = Float.parseFloat(txtnum1.getText());
        num2 = Float.parseFloat(txtnum2.getText());
        
        if (e.getSource() == sum)
        {
            result = num1 + num2;
            txtresult.setText("" + result);
        }
        else if (e.getSource() == multiply)
        {
           result = num1 * num2;
           txtresult.setText("" + result);
        }
    }
    
    public static void main (String [] args)
    {
        RadioButtonTest app = new RadioButtonTest();
    }
}
