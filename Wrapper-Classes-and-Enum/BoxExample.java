public class BoxExample
{
    public static void main(String[] args)
    {
        // Primitive
        int marks = 90;

        // Autoboxing
        Integer marksObject = marks;

        // Unboxing
        int newMarks = marksObject;

        System.out.println("Primitive Value: " + marks);
        System.out.println("Wrapper Value: " + marksObject);
        System.out.println("Unboxed Value: " + newMarks);
    }
}