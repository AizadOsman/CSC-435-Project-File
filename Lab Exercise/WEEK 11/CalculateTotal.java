
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class CalculateTotal extends JFrame implements ActionListener
{
    private JLabel lblnum1, lblnum2, lbltotal;
    private JTextField txtnum1, txtnum2, txttotal;
    private JButton calculate, clear;
    private Container c;
    
    public CalculateTotal()
    {
        setTitle("Calculate Total");
        setSize(400,200);
        setLocation(200,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        c = getContentPane();
        c.setLayout(new GridLayout(4,2));
        
        lblnum1 = new JLabel("Enter first number :",SwingConstants.LEFT);
        lblnum2 = new JLabel("Enter second number :",SwingConstants.LEFT);
        lbltotal = new JLabel("Total :",SwingConstants.LEFT);
        
        txtnum1 = new JTextField(15);
        txtnum2 = new JTextField(15);
        txttotal = new JTextField(15);
        
        calculate = new JButton("Calculate");
        clear = new JButton("Clear");
        
        txttotal.setEditable(false);
        calculate.addActionListener(this);
        clear.addActionListener(this);
        
        c.add(lblnum1);
        c.add(txtnum1);
        c.add(lblnum2);
        c.add(txtnum2);
        c.add(lbltotal);
        c.add(txttotal);
        c.add(calculate);
        c.add(clear);
        
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == calculate)
        {
            float num1, num2, result;
            num1 = Float.parseFloat(txtnum1.getText());
            num2 = Float.parseFloat(txtnum2.getText());
            result = num1 + num2;
            txttotal.setText(Float.toString(result));
        }
        else if (e.getSource()== clear)
        {
            txtnum1.setText(" ");
            txtnum2.setText(" ");
            txttotal.setText(" ");
        }
    }
    
    public static void main(String [] args)
    {
        CalculateTotal calcApp = new CalculateTotal();  
    }
}
