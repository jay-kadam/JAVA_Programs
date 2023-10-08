import java.sql.*;
import java.util.*;
class Customer
{
    public static void main(String[] args) 
    {
        Connection con=null;
        PreparedStatement ps;
        try
        {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/fymca","root","admin");
            if(con!=null)
            {
                System.out.println("Connection established");
            }
            Scanner sc=new Scanner(System.in);
            String query="insert into Customer values(?,?,?,?)";
            ps=con.prepareStatement(query);

            System.out.println("**Customer details**");

            System.out.println("Enter customer id");
            int  cust_id=sc.nextInt();

            System.out.println("Enter customer name");
            String cust_name=sc.next();

            System.out.println("Enter customer address");
            String cust_address=sc.next();

            System.out.println("Enter customer no.");
            int  cust_no=sc.nextInt();

            ps.setInt(1,cust_id);
            ps.setString(2,cust_name);
            ps.setString(3,cust_address);
            ps.setInt(4,cust_no);

            int no=ps.executeUpdate();
            if(no!=0)
            System.out.println("data inserted sucessully");
            else
            System.out.println("cant insert");
            con.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        } 
    }
} 