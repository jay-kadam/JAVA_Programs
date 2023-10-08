import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PasswordValidator 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter username: ");
        String username = sc.next();
        System.out.print("Enter password: ");
        String password = sc.next();
        
        Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}$");
        Matcher matcher = pattern.matcher(password);
        
        if (matcher.matches()) 
        {
            File file = new File("passwords.txt");
            try 
            {
                FileWriter writer = new FileWriter(file, true);
                writer.write(username + "," + password + "\n");
                writer.close();
                System.out.println("Password saved successfully.");
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        } 
        else 
        {
            System.out.println("Password does not meet the required conditions.");
        }
    }
}
