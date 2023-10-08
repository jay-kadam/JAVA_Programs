import java.util.*;
class arrpro 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        
        System.out.println("Enter 10 elements of the array:");
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = sc.nextInt();
        }
        
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) 
        {
            if (arr[i] > max) 
            {
                max = arr[i];
            }
        }
        System.out.println("Greatest Element: " + max);
        
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) 
        {
            if (arr[i] < min) 
            {
                min = arr[i];
            }
        }
        System.out.println("Smallest Element: " + min);

        int sum = 0;
        for (int i = 0; i < arr.length; i++) 
        {
            sum += arr[i];
        }
        System.out.println("Sum of Elements: " + sum);
        
        double average = (double) sum / arr.length;
        System.out.println("Average of Elements: " + average);
    }
}

