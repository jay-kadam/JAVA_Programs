import java.util.*;

class Account 
{
    private int balance;

    public Account(int initialBalance) 
    {
        this.balance = initialBalance;
    }

    public synchronized void deposit(int amount) 
    {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited " + amount + ", balance is now " + balance);
        notifyAll();
    }

    public synchronized void withdraw(int amount) 
    {
        while (balance < amount) 
        {
            try 
            {
                wait();
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        }
        balance -= amount;
        System.out.println(Thread.currentThread().getName() + " withdraw " + amount + ", balance is now " + balance);
    }
}

class Customer implements Runnable 
{
    private Account account;
    private int amount;

    public Customer(Account account, int amount) 
    {
        this.account = account;
        this.amount = amount;
    }

    public void run() 
    {
        String threadName = Thread.currentThread().getName();
        if (amount >= 0) {
            account.deposit(amount);
        } else {
            account.withdraw(-amount);
        }
    }
}

public class bankingmulti 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        int initialBalance = sc.nextInt();
        Account account = new Account(initialBalance);

        System.out.print("Enter number of transactions: ");
        int numTransactions = sc.nextInt();

        System.out.print("Enter transaction amount: ");
        for (int i = 0; i < numTransactions; i++) 
        {
            int amount = sc.nextInt();
            Thread t = new Thread(new Customer(account, amount), "Thread " + (i + 1));
            t.start();
        }

    }
}