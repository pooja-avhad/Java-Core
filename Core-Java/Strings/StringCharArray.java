public class StringCharArray
{
    public static void main(String[] args)
    {
        String s = "Java";

        // String → char[]
        char[] chars = s.toCharArray();

        System.out.println("Characters:");

        for(char ch : chars)
        {
            System.out.println(ch);
        }

        // char[] → String
        String result = new String(chars);

        System.out.println("String = " + result);
    }
}