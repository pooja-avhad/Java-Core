public class MethodOverloading 
{
    int addition(int a,int b)
    {
        int result=a+b;
        return result;
    }

        
    int addition(int a,int b,int c)
    {
          int result1=a+b+c;
        return result1;
    }

    public static void main(String[] args) 
    {
        MethodOverloading obj=new MethodOverloading();
        int result=obj.addition(10, 20);
        System.out.println("Result="+result);
        int result1=obj.addition(10,20,30);
        System.out.println("Result="+result1);
    }

}
