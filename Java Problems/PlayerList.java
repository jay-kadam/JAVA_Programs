import game.*;
import java.util.*;
class PlayerList
{
    public static void main(String args[])
    {
        int n,m,i;
        Scanner sc=new Scanner(System.in);
        int ch;
        do 
        {
            System.out.println("\n1.Indoor \n2.Outdoor\n\nEnter Your Choice : ");
            ch = sc.nextInt();
            switch (ch) 
            {
                case 1:
                System.out.println("How many indoor player you want ");
                n=sc.nextInt();
            
                Indoor in[]=new Indoor[n];
            
                for(i=0;i<n;i++)
                {
                    System.out.println("Enter indoor player name ");
                    String name=sc.next();
                    in[i]=new Indoor(name);
                }
                System.out.println("Indoor Player are ");
                for(i=0;i<n;i++)
                {
                    in[i].display();
                }
                break;
                
                case 2:
                System.out.println("How many outdoor player you want ");
                m=sc.nextInt();
                Outdoor out[]=new Outdoor[m];
                for(i=0;i<m;i++)
                {
                    System.out.println("Enter outdoor player name ");
                    String name=sc.next();
                    out[i]=new Outdoor(name);
                }
                System.out.println("Outdoor Player are ");
                for(i=0;i<m;i++)
                {
                    out[i].display();
                }
                break;
            }
        }
        while (ch < 2);
    }
    protected void finalize()
    {   
        System.out.println("Finalize is called");
    }
}