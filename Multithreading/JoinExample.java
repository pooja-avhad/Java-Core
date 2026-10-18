public class JoinExample
{
    static class MyThread extends Thread
    {
        public void run()
        {
            for(int i = 1; i <= 3; i++)
            {
                System.out.println("Child Thread: " + i);
            }
        }
    }

    public static void main(String[] args)
        throws InterruptedException
    {
        MyThread t = new MyThread();

        t.start();
        t.join();

        System.out.println("Main Thread finished");
    }
}