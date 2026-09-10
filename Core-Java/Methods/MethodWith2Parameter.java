public class MethodWith2Parameter 
{
    void addition(int a,int b)
    {
         System.out.println("Addition="+(a+b));
    }
    public static void main(String[] args) 
    {
        MethodWith2Parameter obj=new MethodWith2Parameter();
        obj.addition(10,20);
    }
}
