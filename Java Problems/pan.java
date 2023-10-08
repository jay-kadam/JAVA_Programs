import java.util.*;
class Invalid_Data extends Exception { }
public class pan
{
    static int n;
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        try 
        {
            System.out.println("1. Mobile Number\n2. Pan Card Number \n Choose the Number");
            n = sc.nextInt();
            switch (n) 
            {
                case 1:
                System.out.println("Enter Mobile Number");
                Long num = sc.nextLong();
                if (num.toString().matches("(0/91)?[7*9][0-9]{9}")) 
                {
                    System.out.println("Your entered Number is: " + num);
                } 
                else 
                {
                    throw new Invalid_Data();
                }
                break;
                case 2:
                System.out.println("Enter Pan Card Number");
                String str = sc.next();
                if (str.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) 
                {
                    System.out.println("Your entered pan card number is: " + str);
                } 
                else 
                {
                    throw new Invalid_Data();
                }
                break;
                default:
                throw new Invalid_Data();
            }
        } 
        catch (Invalid_Data id) 
        {
            System.out.println("Invalid Data");
        }
        catch (NumberFormatException e) 
        {
            System.out.println("Invalid Data");
        }
    }  
}