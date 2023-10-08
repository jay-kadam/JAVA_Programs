import java.util.*;
class vehicle
{
    protected int regn_Number, speed;
    protected String color, owner_Name;
    Scanner sc = new Scanner(System.in);
    void showdata1()
    {
        System.out.println("This is vehicle class");
        System.out.println("-----------------------");
    }
}
class Bus extends vehicle
{
    int route_number;
    void getdata()
    {
        super.showdata1();
        System.out.println("Enter regn_Number:");
        regn_Number= sc.nextInt();
        System.out.println("Enter speed:");
        speed= sc.nextInt();
        System.out.println("Enter color:");
        color = sc.next();
        System.out.println("Enter owner_Name:");
        owner_Name = sc.next();
        System.out.println("Enter route_number:");
        route_number = sc.nextInt();
    }
    void showdata()
    {
   
        System.out.println("**Bus details**");
        System.out.println("Regn_Number: "+regn_Number);
        System.out.println("Speed: "+speed);
        System.out.println("Color: "+color);
        System.out.println("Owner_Name: "+owner_Name);
        System.out.println("Route_number: "+route_number);
        System.out.println("                                 ");
    
    }
}
class Car extends vehicle
{
    String  manufacturerName;
    void getdata()
    {
        super.showdata1();
        System.out.println("enter regn_Number:");
        regn_Number= sc.nextInt();
        System.out.println("enter speed:");
        regn_Number= sc.nextInt();
        System.out.println("enter color:");
        color = sc.next();
        System.out.println("enter owner_Name:");
        owner_Name = sc.next();
        System.out.println("enter manufacturer_name:");
        manufacturerName = sc.next();
    }
    void showdata()
    {
        System.out.println("**Car details**");
        System.out.println("Regn_Number: "+regn_Number);
        System.out.println("Speed: "+speed);
        System.out.println("Color: "+color);
        System.out.println("Owner_Name: "+owner_Name);
        System.out.println("Manufacturer_name: "+manufacturerName);
    
    }
}
public class vehicles 
{
    public static void main(String[] args) 
    {
        Bus b = new Bus();
        b.getdata();
        b.showdata();

        Car c = new Car();
        c.getdata();
        c.showdata();
    }
}