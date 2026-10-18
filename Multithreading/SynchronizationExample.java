class Counter
{
    static int count = 0;

    static synchronized void increment()
    {
        count++;
    }
}

public class SynchronizationExample
{
    public static void main(String[] args)
        throws InterruptedException
    {
        Thread t1 = new Thread(() ->
        {
            for(int i = 1; i <= 1000; i++)
            {
                Counter.increment();
            }
        });

        Thread t2 = new Thread(() ->
        {
            for(int i = 1; i <= 1000; i++)
            {
                Counter.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count: " + Counter.count);
    }
}