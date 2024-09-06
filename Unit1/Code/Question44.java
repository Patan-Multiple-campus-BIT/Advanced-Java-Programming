// 44.	Write a Java program that creates two threads. The first thread, named "ThreadA," should print odd numbers from 1 to 10 at intervals of 0.7 seconds, and the second thread, named "ThreadB," should print even numbers from 2 to 20 at intervals of 1.2 seconds. Ensure proper synchronization to avoid interference between the two threads. Provide the code for your program, including the main method.

class NumberGenerator
{
    public synchronized void printOdd()
    {
        for(int i=1;i<=10;i+=2)
        {
           System.out.println(Thread.currentThread().getName()+" prints "+i);
           try
           {
            Thread.sleep(700);
           }
           catch(InterruptedException e)
           {
            e.printStackTrace();
           }
        }
    }
    public synchronized void printEven()
    {
        for(int i = 2;i<=20;i+=2)
        {
            System.out.println(Thread.currentThread().getName()+" prints "+i);
            try
            {
                Thread.sleep(1200);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
class ThreadA extends Thread
{
    private NumberGenerator gen;
    public ThreadA(NumberGenerator pri)
    {
        this.gen = pri;
        this.setName("ThreadA");
    }
    @Override
    public void run()
    {
        gen.printOdd();
    }
}
class ThreadB extends Thread
{
    private NumberGenerator gen;
    public ThreadB(NumberGenerator pri)
    {
        this.setName("ThreadB");
        this.gen = pri;
    }
    @Override
    public void run(){
        gen.printEven();
    }
}
public class Question44
{
    public static void main(String[] args) {
        NumberGenerator numgen = new NumberGenerator();
        ThreadA threadA = new ThreadA(numgen);
        ThreadB threadB = new ThreadB(numgen);

        threadA.start();
        threadB.start();
    }
}