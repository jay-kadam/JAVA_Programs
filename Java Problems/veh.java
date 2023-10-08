import vehicle.*;
import java.util.*;
class veh 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int cc,price,regno,regyear;
        System.out.println("Enter CC of 2 wheeler");
        cc=sc.nextInt();
        System.out.println("Enter price of 2 wheeler");
        price=sc.nextInt();

        System.out.println("Enter Registration no. of 4 wheeler");
        regno=sc.nextInt();
        System.out.println("Enter Registration year of 4 wheeler");
        regyear=sc.nextInt();

        two_wheeler ob1=new two_wheeler();
        ob1.display(cc,price);

        four_wheeler ob2=new four_wheeler();
        ob2.show(regno,regyear);
    }
}