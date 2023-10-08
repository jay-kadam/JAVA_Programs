class Mythread1 extends Thread
{
    public Mythread1(String name)
    {
        super(name);
    }
        @Override
        public void run()
        {
        // int i=0;
        // while(true)
        // {
        //     System.out.println("I'm happy!!");
        //     i++;
        // }        
        }
    
}

// class Mythread2 implements Runnable
// {
//     public Mythread2(Runnable r)
//     {
//         super(name)
//     }
//     @Override
//     public void run()
//     {
//         int i=0;
//         while(true)
//         {
//             System.out.println("I'm sad!!");
//             i++;
//         }        
//     }
// }

public class samthread 
{
    public static void main(String[] args) 
    {
        // Mythread1 ob1=new Mythread1();
        // Mythread2 ob2=new Mythread2();
        // ob1.start();
        // ob2.start();

        Mythread1 ob1=new Mythread1("Jay");
        ob1.start();
        System.out.println("id of thread is "+ob1.getId());
        System.out.println("name of the thread is "+ob1.getName());
    }
}
