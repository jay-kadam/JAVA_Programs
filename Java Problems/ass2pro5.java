import java.util.*;
abstract class Shape
{
    public final double pi=3.14;
    Scanner sc = new Scanner(System.in);
    abstract void cal_area();
    abstract void cal_volumn();
}
class Sphere extends Shape
{
    int r;
    Sphere(int r)
    {
        this.r= r;
    }
    void cal_area() 
    {
        double area = 4*pi*r*r;
        System.out.println("area of Sphere:"+area);
    }
    void cal_volumn()
    {
        double volumn = (4/3)*pi*r*r*r;
        System.out.println("Volumn of Sphere:"+volumn);
    }
}
class Cone extends Shape
{
    int r,k;
    Cone(int r,int k)   
    {
        this.r= r;
        this.k=k;
    }
    void cal_area()
    { 
        double area = pi * r * k + pi * r * r ;
        System.out.println("area of Cone:"+area);
    }   
    void cal_volumn()
    {
        double volumn = pi*r*r*(k/3);
        System.out.println("Volumn of Cone:"+volumn);
    }
}
public class ass2pro5 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter radius of sphere:");
        int r=sc.nextInt();
        Sphere s= new Sphere(r);
        s.cal_area();
        s.cal_volumn();
        System.out.println("enter radius of cone:");
        int r1=sc.nextInt();
        System.out.println("enter height of cone");
        int h1=sc.nextInt();
        Cone c = new Cone(r1,h1);
        c.cal_area();
        c.cal_volumn();
    }
}