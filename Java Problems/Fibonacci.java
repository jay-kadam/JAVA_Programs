import java.util.*;
public class Fibonacci
{
    public static int fiboRec(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        if(n == 1 || n == 2)
        {
            return 1;
        }
        return fiboRec(n-2) + fiboRec(n-1);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter range till which you want fibonacci series: ");
        int max = sc.nextInt();
        System.out.println("Fibonacci Series of "+max+" numbers is: ");
        for(int i = 0; i <= max; i++)
        {
            System.out.print(fiboRec(i) +"\n");
        }
        sc.close();
    }
    
}
