import mathematics.*;
import java.util.*;
class mathematicsEx 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,d;
        System.out.println("Enter 2 value for maximum");
        a=sc.nextInt();
        b=sc.nextInt();
        maxEx ob1=new maxEx();
        ob1.max(a, b);

        System.out.println("Enter 2 value for power");
        c=sc.nextInt();
        d=sc.nextInt();
        powEx ob2=new powEx();
        ob2.power(c, d);
    }
}