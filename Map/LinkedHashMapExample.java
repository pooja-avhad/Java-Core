import java.util.LinkedHashMap;

public class LinkedHashMapExample
{
    public static void main(String[] args)
    {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        map.put(3, "Amit");
        map.put(1, "Pooja");
        map.put(2, "Rahul");

        System.out.println(map);
    }
}