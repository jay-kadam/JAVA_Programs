// constrcutor overloading method program 
import java.util.*;
class Shape{
    final double pi=3.14;
    void volume(int r){
        int v=r*r*r;
        System.out.println("volume of cube is : "+v);
    }
    void volume(int r,int h){
        double v=pi*r*r*h;
        System.out.println("volume of cyclinder is : "+v);
    }
    void volume(int l,int w,int h){
        int v=l*w*h;
        System.out.println("volume of cuboid is : "+v);
    }

}
class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius : ");
        int r=sc.nextInt();
        System.out.println("enter the height : ");
        int h=sc.nextInt();
        System.out.println("enter the weight : ");
        int w=sc.nextInt();
        System.out.println("enter the length : ");
        int l=sc.nextInt();

         Shape obj=new Shape();
         obj.volume(r);
         obj.volume(r, h);
         obj.volume(l, w, h);
    }
}





