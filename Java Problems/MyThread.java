public class MyThread implements Runnable
{
    public void run()
    {
        System.out.println("New thread running ");
        for(int i = 1; i <= 5; i++)
        {
            System.out.println(i);
        }
        System.out.println(Thread.currentThread());
    }
    public static void main(String[] args)
    {
        System.out.println("Main thread running");
        MyThread th = new MyThread();
        Thread t = new Thread(th);
        t.start();
    }
}