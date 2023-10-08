import java.util.*;
class conString 
{
    public static void main(String args[])
    {
        System.out.println("Enter the choice: ");
        System.out.println("1. Reverse of string");
        System.out.println("2. Concatination of two strings ");
        System.out.println("3. Length of string");
        System.out.println("4. Equals method in a string class");
        System.out.println("5. Convert string to Uppercase");
        System.out.println("6. Convert string to Lowercase");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
            String str,nstr=" ";
            char c;
            System.out.println("Enter the String: ");
            str=sc.next();
            for(int i=0;i<str.length();i++)
            {
                c=str.charAt(i);
                nstr=c+nstr;
            }
            System.out.println("1. Reverse of String: "+nstr);
            break;
            
            case 2:
            String s1, s2;
            System.out.println("Enter the String1:");
            s1=sc.next();
            System.out.println("Enter the String2:");
            s2=sc.next();
            System.out.println("2. Concatination of two strings: "+s1.concat(s2));
            break;

            case 3:
            String lstr;
            System.out.println("Enter the String:");
            lstr=sc.next();
            System.out.println("3. Length of string: "+lstr.length());
            break;

            case 4:
            String estr1, estr2;
            System.out.println("Enter the String1:");
            estr1=sc.next();
            System.out.println("Enter the String2:");
            estr2=sc.next();
            System.out.println("4. Equals method in a string class: "+estr1.equals(estr2));
            break;

            case 5:
            String ustr;
            System.out.println("Enter the String:");
            ustr=sc.next();
            System.out.println("5. Convert string to Uppercase: "+ustr.toUpperCase());
            break;

            case 6:
            String lostr;
            System.out.println("Enter the String:");
            lostr=sc.next();
            System.out.println("6. Convert string to Lowercase: "+lostr.toLowerCase());
            break;
        }
    }
}