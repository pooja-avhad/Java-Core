import java.util.TreeMap;

public class TreeMapExample
{
    public static void main(String[] args)
    {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(30, "Amit");
        map.put(10, "Pooja");
        map.put(20, "Rahul");

        System.out.println(map);
    }
}