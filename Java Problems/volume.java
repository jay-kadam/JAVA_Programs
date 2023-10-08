import java.util.*;
class Method
{
    double r,s, b, h;
    final double pi=3.14;
    void findVolume(double s) 
    {
        double vol1=s*s*s;
        System.out.println("Volume of cube = "+vol1);
    }

    void findVolume(double r, double h) 
    {
        double vol2=pi*r*r*h;
        System.out.println("Volume of cylinder = "+vol2);
    }

    void findVolume(double s, double b, double h) 
    {
        double vol3=s*b*h;
        System.out.println("Volume of cuboid = "+vol3);
    }
}
class volume 
{
    public static void main(String args[]) 
    {
        double r,s, b, h;
        Scanner sc = new Scanner(System.in);
        Method obj = new Method();
        System.out.println("Enter the side of cube : ");
        s = sc.nextDouble();
        obj.findVolume(s);

        System.out.println("Enter the radius and height of the cylinder : ");
        r = sc.nextDouble();
        h = sc.nextDouble();
        obj.findVolume(r, h);

        System.out.println("Enter the length, width and height of the cuboid : ");
        s = sc.nextDouble();
        b = sc.nextDouble();
        h = sc.nextDouble();
        obj.findVolume(s, b, h);
    }
}