class Mythre extends Thread
{
    public Mythre(String name)
    {
        super(name);
    }
        public void run()
        {
        int i=0;
        while(i<10)
        {
            System.out.println("I'm happy!!");
            i++;
        }        
        }
}

public class priothread 
{
    public static void main(String[] args) 
    {
        Mythre ob1=new Mythre("Jay1");
        Mythre ob2=new Mythre("Jay2");
        Mythre ob3=new Mythre("Jay3");
        Mythre ob4=new Mythre("Jay4");
        ob1.setPriority(Thread.MAX_PRIORITY);
        ob1.start();
        ob2.setPriority(Thread.MIN_PRIORITY);
        ob2.start();
        ob3.start();
        ob4.start();
    }
}