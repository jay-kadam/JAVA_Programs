import java.util.*;
class strequal 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String firstString = sc.nextLine();
        System.out.println("Enter second string: ");
        String secondString = sc.nextLine();
        
        if (firstString.equals(secondString)) 
        {
            System.out.println("Both strings are equal.");
        } 
        else 
        {
            System.out.println("Both strings are not equal.");
        }
    }
}
