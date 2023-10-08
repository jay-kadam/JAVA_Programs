import java .sql.*;
class program
{
    public static void main(String[] args) 
    {
        Connection con=null;
        try
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jd","root","admin");
            if(con!=null)
            {
                System.out.println("connnection successful");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}