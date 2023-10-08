class MyrunnableThread1 implements Runnable
{
    public void run()
    {
        while(true)
        {
            System.out.println("this is runnable1");
    
        }

    }
}

class MyrunnableThread2 implements Runnable
{
    public void run()
    {
        while(true)
        {
            System.out.println("this is runnable2");
        }

    }
}

public class runnablethread 
{
    public static void main(String[] args) 
    {
        MyrunnableThread1 ob1=new MyrunnableThread1();
        Thread t1=new Thread(ob1);
        MyrunnableThread2 ob2=new MyrunnableThread2();
        Thread t2=new Thread(ob2);
        
        t1.start();
        t2.start();
    }
}