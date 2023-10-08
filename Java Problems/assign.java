import java.util.*;
class assign
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of student");
        int n=sc.nextInt();
        String sname[]=new String[n];
        float sper[]=new float[n];
        float max=0;
        int max_index=0;
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter student name");
            sname[i]=sc.next();
            System.out.println("Enter student percentage");
            sper[i]=sc.nextFloat();
            if(max<sper[i])
            {
                max=sper[i];
                max_index=i;
            }
        }
        System.out.println("Name= "+sname[max_index]);
        System.out.println("Percentage= "+sper[max_index]);
    }
}