// 45.	WAP to execute the threads according to thread priorities in java.
class Thread1 extends Thread
{
    public void run()
    {
        for(int i=0;i<=10;i++)
            System.out.println("Thread1 invoked ");
    }
}
class Thread2 extends Thread
{
    public void run()
    {
        for(int i=0;i<=10;i++)
            System.out.println("Thread2 invoked ");
    }
}
public class Question45 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t2.start();
        t1.start();
    }
}
