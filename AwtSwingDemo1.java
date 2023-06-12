import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class AwtSwingDemo1 extends JFrame implements ActionListener
{
    JLabel l;
    JTextField tf;
    JButton b1,b2;



 AwtSwingDemo1()
{

    l = new JLabel("Message");
    tf = new JTextField();


    b1= new JButton("Show");
    b1.addActionListener(this);

    b2= new JButton("Clear");
    b2.addActionListener(this);

    setLayout(new GridLayout(2,2));
    add(l);
    add(tf);
    add(b1);
    add(b2);


    setTitle("Created by HArish");
    setSize(300,200);
    setLocation(500,400);
    setResizable(true);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}


public void actionPerformed(ActionEvent  ae)
{
    String s = (String)ae.getActionCommand();

    if(s.equals("Show"))
    {
        tf.setText("I love my INDAI");
    }
    if(s.equals("Clear"))
    {
        tf.setText("");
    }
}



    public static void main(String args[])
    {
        AwtSwingDemo1 ob =  new AwtSwingDemo1();
    }
}
