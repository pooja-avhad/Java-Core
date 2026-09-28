public class WrapperExample
{
    public static void main(String[] args)
    {
        // Primitive data types
        byte b = 10;
        short s = 20;
        int i = 30;
        long l = 40L;
        float f = 50.5f;
        double d = 60.5;
        char c = 'A';
        boolean bool = true;

        // Wrapper classes
        Byte wb = b;
        Short ws = s;
        Integer wi = i;
        Long wl = l;
        Float wf = f;
        Double wd = d;
        Character wc = c;
        Boolean wbool = bool;

        System.out.println("byte      : " + wb);
        System.out.println("short     : " + ws);
        System.out.println("int       : " + wi);
        System.out.println("long      : " + wl);
        System.out.println("float     : " + wf);
        System.out.println("double    : " + wd);
        System.out.println("char      : " + wc);
        System.out.println("boolean   : " + wbool);
    }
}