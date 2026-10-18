import java.util.Deque;
import java.util.ArrayDeque;

public class DequeExample
{
    public static void main(String[] args)
    {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.offerFirst(20);
        deque.offerFirst(10);
        deque.offerLast(30);

        System.out.println("Deque: " + deque);

        System.out.println("First: " + deque.peekFirst());
        System.out.println("Last: " + deque.peekLast());

        deque.pollFirst();
        deque.pollLast();

        System.out.println("After removal: " + deque);
    }
}