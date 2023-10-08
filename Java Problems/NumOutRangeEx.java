import java.util.*;
class NumOutRange extends Exception
{}
    class NumOutRangeEx
    {
        static int n; 
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            try
            {
                System.out.println("Enter Number:");
                n=sc.nextInt();
                if(n>100)
                {
                    throw new NumOutRange();
                }
                else
                {
                    for (int i=1;i<n;i++)
                    {
                        if(n%i==0)
                        {
                            System.out.println(i+" ");
                        }
                    }
                }   
            }
            catch(NumOutRange z)
            {
                System.out.println("Number is out of range");
            }
            catch(Exception e)
            {
                System.out.println(" "+e.getMessage());
            }
        }
    }
