import java.util.Scanner;

class Test implements Runnable 
{

    Scanner sc = new Scanner(System.in);
    static int counter, ctr;
    String ans[] = { "C", "D", "D", "B", "B" };

    Test() 
    {

    }

    synchronized void askQuestion() 
    {
        for (int i = 0; i < 5; i++) 
        {
            try 
            {
                String Q1 = "1) Which of the following is not a Java features?\n A.Dynamic\n B.Architecture Neutral\n C.Use of pointers\n D.Object-oriented";

                String Q2 = "\n2) ___ is used to find and fix bugs in the Java programs.\n A.JVM\n B.JRE\n C.JDK\n D.JDB\n";

                String Q3 = "\n3)What does the expression float a = 35 / 0 return?\n A.0 \n B.Not a Number\n C.Infinity\n D.Run time exception\n";

                String Q4 = "\n4)An interface with no fields or methods is known as a __.\n A.Runnable Interface\n B.Marker Interface\n C.Abstract Interface\n D.CharSequence Interface\n";

                String Q5 = "\n5)  Which keyword is used for accessing the features of a package ?\n A.package\n B.import\n C.extends\n D.export\n";
                String Ques[] = { Q1, Q2, Q3, Q4, Q5 };
                System.out.println(Ques[i]);
                System.out.println("Enter the option:  ");
                String a = sc.next();
                if (a.equalsIgnoreCase(ans[i])) 
                {
                    counter++;
                }
                Thread.sleep(800);
            } 
            catch (Exception e) 
            {
                System.out.println(e);
            }
        }

        System.out.println("\nYour Score= " + counter);
        if (counter >= 4) 
        {
            try 
            {
                for (int i = 5; i >= 1; i--) 
                {
                    System.out.print(i + "\t");
                    try 
                    {
                        Thread.sleep(1000);
                    } 
                    catch (InterruptedException e) 
                    {
                        e.printStackTrace();
                    }
                }
                System.out.println("Start..");
                nextRound();
            } 
            catch (Exception e) 
            {
                e.printStackTrace();
            }
        } 
        else 
        {
            System.out.println
                ("Thank you for taking the Java test. We appreciate the time and effort you  put into it.\n" +
                "After careful review of your test results, we regret to inform you that you have not passed the test.");
        }
    }

    synchronized void nextRound() 
    {
        System.out.println("\n Welcome to Second round\n");
        String ans[] = { "C", "D", "A", "A", "B", "D", "C", "B", "C", "A" };

        for (int i = 0; i < 10; i++) 
        {
            try 
            {
                String Q1 = "1) Find the output of the following program.\r\n" +
                        "\r\n" +
                        "public class Solution{\r\n" +
                        "       public static void main(String[] args){\r\n" +
                        "                     short x = 10;\r\n" +
                        "                     x =  x * 5;\r\n" +
                        "                     System.out.print(x);\r\n" +
                        "       }\r\n" +
                        "}\n" +
                        " A.50\n" +
                        " B.10\n" +
                        " C.Compiler Error\n" +
                        " D.Exception";

                String Q2 = "\n2)Find the output of the following program.\r\n" +
                        "\r\n" +
                        "public class Solution{\r\n" +
                        "       public static void main(String[] args){\r\n" +
                        "                     byte x = 127;\r\n" +
                        "                     x++;\r\n" +
                        "                     x++;\r\n" +
                        "                     System.out.print(x);\r\n" +
                        "       }\r\n" +
                        "}\r\n" +
                        "\r\n" +
                        " A.127\n" +
                        " B.129\n" +
                        " C.2\n" +
                        " D.-127\n";

                String Q3 = "\n3)\r\n" +
                        "When an array is passed to a method, what does the method receive?\n" +
                        " A.The Reference of the array\n" +
                        " B.The copy of the array\n" +
                        " C.Length of the array\n" +
                        " D.Copy of first element\n";

                String Q4 = "\n4)When is the object created with new keyword?\n A.At run time\n B.At compile time\n C.Depends on the code\n D.None\n";

                String Q5 = "\n5)  Identify the keyword among the following that makes a variable belong to a class,rather than being defined for each instance of the class\n A.final\n B.static\n C.volatile\n D.abstract\n";

                String Q6 = "\n6)Where does the system stores parameters and local variables whenever a method is invoked?.\n A.Heap\n B.Array\n C.Tree\n D.Stack\n";

                String Q7 = "\n7) Identify the modifier which cannot be used for constructor.\n A.public\n B.privated\n C.static\n D.protected\n";

                String Q8 = "\n8) What is the variables declared in a class for the use of all methods of the class called?\n A.Object\n B.Instance Variable\n C.Reference Variable\n D.None\n";

                String Q9 = "\n9) Which of the following exception is thrown when divided by zero statement is executed? \n A.NullPointerException\n B.NumberFormatexception\n C.ArithmeticException\n D.None\n";

                String Q10 = "\n10)Identify the interface which is used to declare core methods in java? \n A.Collection\n B.Set\n C.EventListener\n D.Comparator\n";

                String Ques[] = { Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10 };
                System.out.println(Ques[i]);
                System.out.println("Enter the option:  ");
                String a = sc.next();
                if (a.equalsIgnoreCase(ans[i])) 
                {
                    counter++;
                    if (ctr == 0) 
                    {
                        ctr = 100;
                        System.out.println("You Won Rs." + ctr);
                    } 
                    else 
                    {
                        ctr = ctr * 2;
                        System.out.println("You Won Rs." + ctr);
                    }
                } 
                else 
                {
                    System.out.println("You Won Rs." + ctr);
                }
                Thread.sleep(800);
            } 
            catch (Exception e) 
            {
                System.out.println(e);
            }
        }
        System.out.println("\n Your Money Rs. " + ctr);

        System.out.println("Thank you for taking the Java test. We appreciate the time and effort you  put into it.\n");
    }
    @Override
    public void run() 
    {
        System.out.println("Welcome to Test ");
        for (int i = 5; i >= 1; i--) 
        {
            System.out.print(i + "\t");
            try 
            {
                Thread.sleep(1000);
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
        }
        System.out.println("Start..\n");
        askQuestion();
    }
}

public class Quizz 
{

    public static void main(String args[]) 
    {
        Test obj = new Test();

        Thread t = new Thread(obj);
        t.start();
    }
}