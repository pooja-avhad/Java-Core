public class VoidReturn 
{
    void display()
    {
        System.out.println("Hello Java");
    }
    int multiply(int a,int b)
    {
        int result=a*b;
        return result;
    }
    public static void main(String[] args)
     {
        VoidReturn obj=new VoidReturn();
        obj.display();
        int result=obj.multiply(10,20);
        System.out.println("Result="+result);
    }
}
