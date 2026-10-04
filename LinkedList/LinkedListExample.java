import java.util.LinkedList;

public class LinkedListExample
{
    public static void main(String[] args)
    {
        LinkedList<String> names = new LinkedList<>();

        // Add elements
        names.add("Pooja");
        names.add("Riya");
        names.add("Amit");

        System.out.println("Original List: " + names);

        // Add at beginning
        names.addFirst("Neha");

        // Add at end
        names.addLast("Rahul");

        System.out.println("After Adding: " + names);

        // Get first and last
        System.out.println("First: " + names.getFirst());
        System.out.println("Last: " + names.getLast());

        // Remove first and last
        names.removeFirst();
        names.removeLast();

        System.out.println("Final List: " + names);
    }
}