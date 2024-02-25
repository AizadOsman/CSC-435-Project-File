
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class CalcTicket extends JFrame implements ActionListener
{
    private JLabel lblprice, lblticket, lbltotal;
    private JTextField txtprice, txtticket, txttotal;
    private JButton calculate, reset;
    private JRadioButton rbtadult, rbtchild;
    private ButtonGroup radioGroup;
    private Container c;

    public CalcTicket()
    {
        setTitle("Calculate Ticket Price");
        setSize(400,200);
        setLocation(200,200);
        
        c = getContentPane();
        c.setLayout(new GridLayout(5,2));
        
        lblprice = new JLabel("Enter ticket price (RM) : ",SwingConstants.LEFT);
        lblticket = new JLabel("Enter number of ticket : ",SwingConstants.LEFT);
        lbltotal = new JLabel("Total Price (RM) : ",SwingConstants.LEFT);
        
        txtprice = new JTextField(15);
        txtticket = new JTextField(15);
        txttotal = new JTextField(15);
        
        calculate = new JButton("Calculate");
        reset = new JButton("Reset");
        
        rbtadult = new JRadioButton("Adult");
        rbtchild = new JRadioButton("Children");
        
        radioGroup = new ButtonGroup();
        radioGroup.add(rbtadult);
        radioGroup.add(rbtchild);
        
        txttotal.setEditable(false);
        calculate.addActionListener(this);
        reset.addActionListener(this);
        
        c.add(lblprice);
        c.add(txtprice);
        c.add(lblticket);
        c.add(txtticket);
        c.add(rbtadult);
        c.add(rbtchild);
        c.add(lbltotal);
        c.add(txttotal);
        c.add(calculate);
        c.add(reset);
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e)
    {
        double price, ticket, total=0;
        price = Double.parseDouble(txtprice.getText());
        ticket = Double.parseDouble(txtticket.getText());
        
        if (e.getSource() == calculate)
        {
            if (rbtadult.isSelected())
            {
                total = ticket * price;
            }
            else if (rbtchild.isSelected())
            {
                total = ticket * price * 0.5;
            }
            txttotal.setText("" + total);
        }
        else if (e.getSource() == reset)
        {
            txtprice.setText("");
            txtticket.setText("");
            txttotal.setText("");
            rbtadult.setSelected(false);
            rbtchild.setSelected(false);
        }
    }
    
    public static void main(String [] args)
    {
        CalcTicket app = new CalcTicket();
    }
}
