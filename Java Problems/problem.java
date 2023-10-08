import java.sql.*;
import java.util.*;
public class problem 
{
    void get(int r, String k, String j,int s)
    {
        Connection con;
        Statement st;
        PreparedStatement ps;
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "admin");
            if(con!=null)
             {
            System.out.println("connection sucessfull");
            }
            String sql = "insert into cmp values(?,?,?,?)";
            ps=con.prepareStatement(sql);
            ps.setInt(1,r);
            ps.setString(2, k);
            ps.setString(3, j);
            ps.setInt(4, s);
            int n = ps.executeUpdate();
            if(n!=0)
            {
                System.out.println("successfull");
            }
            else
            {
                System.out.println("unsuccessfull");
            }
            st= con.createStatement();
            ResultSet rs = st.executeQuery("select * from cmp");
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+(rs.getInt(4)));
            }
            con.close();
        }catch(Exception e)
        {
            e.printStackTrace();
        } 

    }
    public static void main(String args[]){
        problem p = new problem();
        Scanner sc = new Scanner(System.in);
        System.out.println("1-add or invaid");
        System.out.println("enter choice");
        int ch = sc.nextInt();
        switch(ch)
        {
            case 1:
                System.out.println("enter id");
                 int j = sc.nextInt();
            
                System.out.println("enter name");
                String d= sc.nextLine();
                
                System.out.println("enter department");
                String s= sc.nextLine();
            

                System.out.println("enter salary");
                int k = sc.nextInt();
                p.get(j, d, s, k);
                break;
            default:
                System.out.println("invalid");
                break;
        }

     


    }
}
