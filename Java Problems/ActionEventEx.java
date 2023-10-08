import java.awt.*;
import java.awt.event.*;
class ActionEventEx extends Frame implements ActionListener
{
    TextField tf;
    ActionEventEx()
    {
        tf=new TextField();
        tf.setBounds(60,50,170,20);
        Button b=new Button("Click Here");
        b.setBounds(100,120,80,20);
        b.addActionListener(this);
        add(b);
        add(tf);
        setLayout(null);
        setVisible(true);
        setSize(300,400);
    }
    public void actionPerformed(ActionEvent e)
    {
        tf.setText("Welcome");
    }
    public static void main(String ar[])
    {
        new ActionEventEx();
    }
}