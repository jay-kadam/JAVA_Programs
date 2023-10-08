//7.
import java.util.*;
abstract class Shape
{
    abstract void Calc_area(); 
}
class Rectangle extends Shape
{
    int l,b;
    Rectangle(int l,int b)
    {
        this.l=l;
        this.b=b;
    }
    public void Calc_area()
    {
        int area=l*b;
        System.out.println("Area of Rectangle: "+area);
    }
}
class Triangle extends Shape
{
    int base,height;
    Triangle(int base, int height)
    {
        this.base=base;
        this.height=height;
    }
    public void Calc_area()
    {
        double area=(height*base)/2;
        System.out.println("Area of Triangle: "+area);
    }
}
class Main_abstract
{
    public static void main(String args[])
    {
        int r1,h1,r2,h2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length and breadth of Rectangle: ");
        r1=sc.nextInt();
        h1=sc.nextInt();
        Rectangle s=new Rectangle(r1,h1);
        s.Calc_area();

        System.out.println("Enter the base and height of Triangle: ");
        r2=sc.nextInt();
        h2=sc.nextInt();
        Triangle c=new Triangle(r2,h2);
        c.Calc_area();

        sc.close();
    }
    
}