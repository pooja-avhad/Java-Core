class MyTask implements Runnable
{
    public void run()
    {
        for(int i = 1; i <= 3; i++)
        {
            System.out.println("Child Thread: " + i);
        }
    }
}

public class RunnableExample
{
    public static void main(String[] args)
    {
        MyTask task = new MyTask();

        Thread t = new Thread(task);
        t.start();

        System.out.println("Main Thread");
    }
}