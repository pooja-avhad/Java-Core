public class MethodWithParameter 
{
    void Welcome(String name)
    {
         System.out.println("Welcome="+name);
    }
    public static void main(String[] args) 
    {
        MethodWithParameter obj=new MethodWithParameter();
        obj.Welcome("Pooja");
    }
}