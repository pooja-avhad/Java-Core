import java.util.ArrayList;

public class ArrayListExample
{
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<>();

        // Add elements
        names.add("Pooja");
        names.add("Rahul");
        names.add("Amit");

        System.out.println("Original List: " + names);

        // Get element
        System.out.println("First Name: " + names.get(0));

        // Update element
        names.set(1, "Riya");

        // Remove element
        names.remove(2);

        // Size
        System.out.println("Size: " + names.size());

        // Check element
        System.out.println("Contains Pooja: " + names.contains("Pooja"));

        // Final list
        System.out.println("Final List: " + names);
    }
}