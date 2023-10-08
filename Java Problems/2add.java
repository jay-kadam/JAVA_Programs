import java.util.*;
class Twoadd
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter 2 values:");
        a=sc.nextInt();
        b=sc.nextInt();
        int c=a+b;
        System.out.println("Addition of 2 nos.: "+c);
        sc.close();

    }
}