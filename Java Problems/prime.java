import java.util.*;
public class prime 
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int r1, r2, c=1, i, j;
        System.out.println("Enter the Start of the range:");
        r1=sc.nextInt();
        System.out.println("Enter the End of the range:");
        r2=sc.nextInt();
        System.out.println("List of prime numbers between "+r1+" and "+r2);
        for(i = r1; i <= r2; i++)
        {
            for( j = 2; j < i; j++)
            {
                if(i % j == 0)
                {
                    c = 0;
                    break;
                }
                else
                {
                    c = 1;
                }
            }
            if(c == 1)
            {
                System.out.println(i);
            }
        }
   }
}
