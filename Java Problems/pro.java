import java.sql.*;
import java.util.*;
class pro {
    // Scanner sc = new Scanner(System.in);
    // void getdata(int a,String name,String address,int salary)
    // {
    //     System.out.println("enter id");
        
        
    // }
    public static void main(String args[])
    {
        Connection con = null;
        Statement st;
        PreparedStatement ps;
       
        try
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","admin");
            if(con==null)
            {
                System.out.println("connnection failed");
            }
            st=con.createStatement();
            
            String sql="insert into emp values(?,?,?,?)";
            ps=con.prepareStatement(sql);
            ps.setInt(1,12);
            ps.setString(2,"jay");
            ps.setString(3,"symca");
            ps.setInt(4,67348);
            int n=ps.executeUpdate();
            if(n!=0)
            {
                System.out.println("sucessfull");
            }
            else
            {
                System.out.println(" failed");
            }
            ResultSet no1 =  st.executeQuery("select * from emp");
            while(no1.next())
            {
                System.out.println(no1.getInt(1)+"\t"+no1.getString(2)+"\t"+no1.getString(3)+"\t"+no1.getInt(4));
            } 
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
}