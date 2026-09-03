public class StringVsBuilder 
{
    public static void main(String[] args) 
    {
        String s="java";
        s=s+"full stack";

        StringBuilder sb=new StringBuilder("java");
        sb.append("full stack");

        System.out.println("String="+s);
        System.out.println("StringBulider="+sb);
    }
}
