import java.util.*;
class Areas
{
    int r,r1,h1;
    double pi = 3.14,area_circle,area_cylinder;
    Scanner sc = new Scanner(System.in);
    void area_of_circle()
    {
        System.out.println("Enter radius of cirlce:");
        r= sc.nextInt();
        area_circle = pi*r*r;
        System.out.println("Area of cirlce = "+area_circle);
    }
    void area_of_cylinder()
    {
        System.out.println("Enter radius of cylinder:");
        r1 = sc.nextInt();
        System.out.println("Enter height of cylinder:");
        h1 = sc.nextInt();
        area_cylinder = (22*r1*(r1+h1))/7;  
        System.out.println("Area of cylinder= "+area_cylinder);
    }
}
class Circle extends Areas
{
    void displayarea()
    {
        super.area_of_circle();
    } 
}
class Cylinder extends Areas
{
    void displayarea1()
    {
        super.area_of_cylinder();
    }    
}
public class suarea 
{
    public static void main(String args[])
    {
        Circle c= new Circle();
        c.displayarea();

        Cylinder d = new Cylinder();
        d.displayarea1();
    }    
}