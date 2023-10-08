import java.util.*;
abstract class Staff
{
    String member_name , address;
}
class FullTimeStaff extends Staff
{
    String departement;
    int salary;
    FullTimeStaff(String a ,String b, String c , int d)
    {
        member_name = a;
        address = b;
        departement = c;
        salary = d;
    }
    void showdata()
    {
        System.out.println("                            ");
        System.out.println("Full Time Staff:");
        System.out.println("Member_name:"+member_name);
        System.out.println("Address:"+address);
        System.out.println("Departemnt:"+departement);
        System.out.println("Salary:"+salary);
    }
}
class PartTimeStaff extends Staff
{
    int NumOfHours,RatePerHours;
    PartTimeStaff(String a ,String b, int c , int d)
    {
        member_name = a;
        address = b;
        NumOfHours = c;
        RatePerHours = d;
    }
    void showdata()
    {
        System.out.println("                            ");
        System.out.println("Part Time Staff:");
        System.out.println("Member_name:"+member_name);
        System.out.println("Address:"+address);
        System.out.println("Num Of Hours:"+NumOfHours);
        System.out.println("Rate Per Hours:"+RatePerHours);
    }
}
public class program6 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Choice:");
        int a = sc.nextInt();
        switch(a)
        {
            case 1:
                System.out.println("Enter Member Name:");
                String k = sc.next();
                System.out.println("Enter address:");
                String b = sc.next();
                System.out.println("Enter departement:");
                String c = sc.next();
                System.out.println("Enter salary:");
                int d = sc.nextInt();
                FullTimeStaff f = new FullTimeStaff(k, b, c, d);
                f.showdata();
                break;
            case 2:
                System.out.println("Enter Member Name:");
                String i = sc.next();
                System.out.println("Enter address:");
                String j = sc.next();
                System.out.println("Enter Number of Hours:");
                int l = sc.nextInt();
                System.out.println("Enter Rate per Hours:");
                int m = sc.nextInt();
                PartTimeStaff p = new PartTimeStaff(i,j, l, m);
                p.showdata();
                break;
            default:
                System.out.println("wrong choice");
                break;

        }
    }    
}