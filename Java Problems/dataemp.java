import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class dataemp 
{
    public static void main(String[] args)  
    {
        String first,last,email,address,contact,department;
        int id,age;
        double salary;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee ID: ");
        id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter first name: ");
        first = sc.nextLine();

        System.out.print("Enter last name: ");
        last = sc.nextLine();
        
        System.out.print("Enter age: ");
        age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter contact number: ");
        contact = sc.nextLine();

        System.out.print("Enter address: ");
        address = sc.nextLine();

        System.out.print("Enter email ID: ");
        email = sc.nextLine();

        System.out.print("Enter department: ");
        department = sc.nextLine();

        System.out.print("Enter salary: ");
        salary = sc.nextDouble();

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbtejkoli", "root", "")) {
            String sql = "INSERT INTO employees (id, first_name, last_name, age,contact_number, address, email, department, salary) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, first);
            ps.setString(3, last);
            ps.setInt(4, age);
            ps.setString(5, contact);
            ps.setString(6, address);
            ps.setString(7, email);
            ps.setString(8, department);
            ps.setDouble(9, salary);
            int rowsInserted = ps.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Employee registered successfully.");
            } else {
                System.out.println("Error: Employee registration failed.");
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}