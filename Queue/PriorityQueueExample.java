import java.util.PriorityQueue;

public class PriorityQueueExample
{
    public static void main(String[] args)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(30);
        pq.offer(10);
        pq.offer(20);

        System.out.println("Front: " + pq.peek());
        System.out.println("Removed: " + pq.poll());
        System.out.println("Front after removal: " + pq.peek());
    }
}