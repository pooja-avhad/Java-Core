public class CompareToIgnoreCase 
{
    public static void main(String[] args) 
    {
        String a="Java";
        String b="java";

        System.out.println("CompareTo="+a.compareTo(b));
        System.out.println("CompareToIgnogreCase="+a.compareToIgnoreCase(b));
    }
}
