public class StringBufferBuilder 
{
    public static void main(String[] args) 
    {
        StringBuilder sb=new StringBuilder("java");
        sb.append("full stack");
        StringBuffer sf=new StringBuffer("java");
        sf.append("full stack");

        System.out.println("StringBuilder="+sb);
        System.out.println("StringBuffer="+sf);
    }
}
