class Shapearea
{
    static final double pi = 3.14;
    int s,l,w,h;
    double rad;
    float base,side;

    //Square
    Shapearea(int s)
    {
        this.s = s;
    }

    //Rectangle
    Shapearea(int l,int w )
    {
        this.l = l;
        this.w = w;
    }

    //Circle
    Shapearea(double rad)
    {
        this.rad = rad;
    }

    //Tringle
    Shapearea(float b,int l)
    {
        this.base = b;
        this.l = l;
    }

    //Cube
    Shapearea(float s)
    {
        this.side = s;
    }


    int area_Square()
    {
        return s*s;
    }

    int area_Rectangle()
    {
        return l*w;
    }

    double area_Circle()
    {
        return pi*(rad*rad);
    }

    float area_Triangle()
    {
        return (base*l)/2;
    }

    float area_Cube()
    {
        return 6 * side*side;
    }
}
class area
{
    public static void main(String args[])
    {
        Shapearea Square = new Shapearea(8);
        Shapearea Rectangle = new Shapearea( 9,  5);
        Shapearea Circle = new Shapearea((double)8);
        Shapearea Triangle = new Shapearea((float)5,(int)9);
        Shapearea Cube = new Shapearea((float)14);

        int aInt;
        double aDouble;
        float aFloat;
        aInt = Square.area_Square();
        System.out.println(" Area of Square is : " +aInt);
        aDouble = Rectangle.area_Rectangle();
        System.out.println(" Area of Rectangle is : "+aDouble);
        aDouble = Circle.area_Circle();
        System.out.println(" Area of Circle is : "+aDouble);
        aFloat = Triangle.area_Triangle();
        System.out.println(" Area of Triangle is : "+aFloat);
        aFloat = Cube.area_Cube();
        System.out.println(" Area of Cube is : " +aFloat);
    }
}