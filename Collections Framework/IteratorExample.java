import java.util.Iterator;
import java.util.ArrayList;


public class IteratorExample 
{
    public static void main(String[] args) 
    {
        ArrayList<String>name=new ArrayList<>();

        name.add("Pooja");
        name.add("Rani");

        Iterator<String>it=name.iterator();

        while(it.hasNext())
        {
            System.out.println(it.next());
        }

    }
}
