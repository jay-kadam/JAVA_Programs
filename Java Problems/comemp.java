import java.sql.*;
class comemp
{
    public static void main(String[] args) 
    {
        Connection con=null;
        try
        {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb", "root", "admin");
            if(con!=null);
            System.out.println("Connection Established");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from comemp where emp_dept='comp'");
            while(rs.next());
            {
                System.out.println(rs.getInt(1)+""+rs.getString(1)+""+rs.getInt(3)+""+rs.getString(4));
            }
            rs.close();
        }    
        catch(Exception e)
        {

        }
    }
}