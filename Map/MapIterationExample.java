import java.util.Map;
import java.util.LinkedHashMap;

public class MapIterationExample
{
    public static void main(String[] args)
    {
        Map<Integer, String> students = new LinkedHashMap<>();

        students.put(101, "Pooja");
        students.put(102, "Rahul");
        students.put(103, "Amit");

        // 1. Print keys
        System.out.println("Keys:");

        for(Integer key : students.keySet())
        {
            System.out.println(key);
        }

        // 2. Print values
        System.out.println("Values:");

        for(String value : students.values())
        {
            System.out.println(value);
        }

        // 3. Print key-value pairs
        System.out.println("Entries:");

        for(Map.Entry<Integer, String> entry : students.entrySet())
        {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}