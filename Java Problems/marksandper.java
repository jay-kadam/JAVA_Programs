import java.util.*;
class mp
{
    Scanner sc=new Scanner(System.in);
    int sub1,sub2,sub3,total;
    float per;
    String name;
    void getdata()
    {
        System.out.println("Enter name");
        name=sc.next();
        System.out.println("Enter marks of sub1,sub2 and sub3:");
        sub1=sc.nextInt();
        sub2=sc.nextInt();
        sub3=sc.nextInt();
    }
    void setdata()
    {
        System.out.println("Name: "+name);
        System.out.println("Marks of sub1: "+sub1);
        System.out.println("Marks of sub2: "+sub2);
        System.out.println("Marks of sub3: "+sub3);
        total=sub1+sub2+sub3;
        System.out.println("Total marks obtained: "+total);
        per=total/3;
        System.out.println("Enter Percentage obtained: "+per);
    }
}
public class marksandper
{
    public static void main(String args[]) 
    {
        mp ob=new mp();
        ob.getdata();
        ob.setdata();
    }
}
