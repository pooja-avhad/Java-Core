class Demo1
{
    static void changeValue(int x)
    {
        x = 20;
        System.out.println("Inside method = " + x);
    }

    public static void main(String[] args)
    {
        int a = 10;

        changeValue(a);

        System.out.println("Original value = " + a);
    }
}