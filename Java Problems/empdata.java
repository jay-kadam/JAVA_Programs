import java.util.*;
import java.sql.*;
public class empdata 
{
    public static void main(String[] args) 
    {
        int id, age;
        String name;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter id");
        id=sc.nextInt();

        System.out.println("Enter name");
        name=sc.next();

        System.out.println("Enter age");
        age=sc.nextInt();

        try(Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb", "root", "admin"))
        {
            String sql="INSERT INTO employee(Id, name, age)VALUES(?,?,?)";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, age);
            int rowinput=ps.executeUpdate();
            if(rowinput>0)
            {
                System.out.println("Successfull");
            }
            else
            {
                System.out.println("Error");
            }
        }
        catch(SQLException e)
        {
            System.out.println("404"+e.getMessage());
        }
    }    
}
