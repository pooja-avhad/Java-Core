public class StringBuilderMethod
 {
    
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder("Java");

        // 1. append()
        sb.append(" Full Stack");
        System.out.println("After append: " + sb);

        // 2. insert()
        sb.insert(4, " Core");
        System.out.println("After insert: " + sb);

        // 3. delete()
        sb.delete(4, 9);
        System.out.println("After delete: " + sb);

        // 4. reverse()
        sb.reverse();
        System.out.println("After reverse: " + sb);
    }
}
