import java.util.Arrays;
import java.util.List;

public class StreamPractice
{
    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(4, 1, 3, 2);

        numbers.stream()
               .filter(n -> n > 2)
               .map(n -> n * 10)
               .sorted()
               .forEach(System.out::println);
    }
}