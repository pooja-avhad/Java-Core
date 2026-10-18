import java.util.HashMap;

public class HashMapExample
{
    public static void main(String[] args)
    {
        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Pooja");
        students.put(102, "Rahul");
        students.put(103, "Amit");

        System.out.println(students);

        System.out.println("Student 101: " + students.get(101));

        students.put(102, "Riya");

        System.out.println("Updated Map: " + students);

        System.out.println("Contains key 103: " + students.containsKey(103));
    }
}