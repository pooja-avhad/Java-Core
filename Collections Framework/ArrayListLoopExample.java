import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListLoopExample
{
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<>();

        names.add("Pooja");
        names.add("Riya");
        names.add("Amit");

        // 1. Normal for loop
        System.out.println("Using for loop:");

        for(int i = 0; i < names.size(); i++)
        {
            System.out.println(names.get(i));
        }


        // 2. For-each loop
        System.out.println("Using for-each loop:");

        for(String name : names)
        {
            System.out.println(name);
        }


        // 3. Iterator
        System.out.println("Using Iterator:");

        Iterator<String> it = names.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}