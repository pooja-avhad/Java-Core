public class StringValueOf 
{
    public static void main(String[] args) 
    {
        int num=100;
        double price=99.5;
        char ch='A';
        boolean status=true;

        String s1=String.valueOf(num);
        String s2=String.valueOf(price);
        String s3=String.valueOf(ch);
        String s4=String.valueOf(status);

        System.out.println("Integer="+s1);
        System.out.println("Double="+s2);
        System.out.println("Character="+s3);
        System.out.println("Boolean="+s4);
         
    }
}
