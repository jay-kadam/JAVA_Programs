import java.util.*;
class not_volidate extends Exception{}
public class program13
{
    int age;
    public static void main(String args[])
    {
        try
        {
            System.out.println("Enter age:");
            Scanner sc = new Scanner(System.in);
            int age = sc.nextInt(); 
            if(age<18)
            {
                throw new not_volidate();
            }
            else
            {
                System.out.println("Age is greater than 18");
            }
        }
        catch(not_volidate vd)
        {
            System.out.println("Age is less than 18 not eligible to vote");
        }
    }
}