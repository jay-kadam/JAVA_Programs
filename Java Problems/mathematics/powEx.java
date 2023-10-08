//powEx.java
package mathematics;
public class powEx 
{
    public void power(int base,int exp)
    {
        int p=1;
        for(int i=1;i<=exp;i++)
        {
            p=p*base;
        }
        System.out.println("Power= "+p);
    }
}