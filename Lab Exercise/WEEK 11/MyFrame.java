
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class MyFrame extends JFrame
{
    public MyFrame()
    {
        setTitle("My First Frame");
        setSize(400,200);
        setLocation(200,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String [] args)
    {
        MyFrame frame = new MyFrame();
    }
}
