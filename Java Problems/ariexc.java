public class ariexc 
{
    public static void main(String[] args) 
    {
        try 
        {
            int i = Integer.parseInt(args[0]);
            int j = Integer.parseInt(args[5]);
            double div = i / j;
            System.out.println("Division of " + i + " & " + j + " is :" + div);
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Please Enter Two Numbers through Command Line\n"+e);
        }
    }
}