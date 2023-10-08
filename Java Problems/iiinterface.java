interface cs
{
    final static float pi=3.14f;
    
    void area();
}
class Circle implements cs
{
    int r;
    Circle(int r)
    {
        this.r=r;
    }
    public void area()
    {
        System.out.println("Area of circle: " +(pi*r*r));
    }
}
class Sphere implements cs
{
    int r;
    Sphere(int r)
    {
        this.r=r;
    }
    public void area()
    {
        System.out.println("Area of sphere: " +(4*pi*r*r));
    }
}
class iiinterface
{
    public static void main(String args[])
    {
        Circle ci=new Circle(10);
        Sphere sp=new Sphere(6);
        ci.area();
        sp.area();
    }
}