import java.util.Arrays;
import java.util.List;

public class StreamSortedExample
{
    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(30, 10, 40, 20);

        numbers.stream()
               .sorted()
               .forEach(System.out::println);
    }
}