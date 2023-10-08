import java.util.*;
class ascarr 
{
    public static void main(String args[])
    {
        int i,j,t;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }
        for(i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
}