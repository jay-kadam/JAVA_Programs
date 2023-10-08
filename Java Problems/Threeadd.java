import java.util.*;
class Threeadd
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter 3 values:");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        int d=a+b+c;
        System.out.println("Addition of 3 nos.: "+d);
        sc.close();

    }
}