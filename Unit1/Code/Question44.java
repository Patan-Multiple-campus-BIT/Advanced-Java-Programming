// 44.	Write a Java program that creates two threads. The first thread, named "ThreadA," should print odd numbers from 1 to 10 at intervals of 0.7 seconds, and the second thread, named "ThreadB," should print even numbers from 2 to 20 at intervals of 1.2 seconds. Ensure proper synchronization to avoid interference between the two threads. Provide the code for your program, including the main method.

class ThreadA extends Thread
{
    public void run()
    {
        for(int i = 1;i<11;i=i+2)
        {
            System.out.println(i+" from ThreadA");
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class ThreadB extends Thread
{
    public void run()
    {
        for(int i =2;i<=20;i=i+2)
        {
            System.out.println(i+" from ThreadB");
            
        try {
            Thread.sleep(1200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }
    }
}
class Question44
{
    public static void main(String[] args) throws InterruptedException
    {
        ThreadA obja = new ThreadA();
        ThreadB objb = new ThreadB();
        obja.start();
        objb.start();
    }
}