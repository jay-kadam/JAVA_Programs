import java.awt.*;
class empform extends Frame
{
    empform()
    {
        Label lb1=new Label("ID");
        lb1.setBounds(20, 50,50,20);
        add(lb1);
        TextField tf1=new TextField();
        tf1.setBounds(60,50,170,20);
        add(tf1);

        Label lb2=new Label("Name");
        lb2.setBounds(20, 85, 50, 20);
        add(lb2);
        TextField tf2=new TextField();
        tf2.setBounds(60, 85, 170, 20);
        add(tf2);

        Label lb3=new Label("Age");
        lb3.setBounds(20, 120, 50, 20);
        add(lb3);
        TextField tf3=new TextField();
        tf3.setBounds(60, 120, 170, 20);
        add(tf3);

        Button b1=new Button("Submit");
        b1.setBounds(80, 160, 100, 20);
        add(b1);

        setLayout(null);
        setVisible(true);
        setSize(300,400);

    }   
    public static void main(String[] args) {
        new empform();
    } 
}