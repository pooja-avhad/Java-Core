public class StartEndString
{
    public static void main(String[] args)
    {
        String s = "Java Full Stack";

        System.out.println("Starts with Java = " + s.startsWith("Java"));
        System.out.println("Starts with Full = " + s.startsWith("Full"));
        System.out.println("Starts with java = " + s.startsWith("java"));

        System.out.println("Ends with Stack = " + s.endsWith("Stack"));
        System.out.println("Ends with Java = " + s.endsWith("Java"));
        System.out.println("Ends with stack = " + s.endsWith("stack"));
    }
}