public class Finally 
{
    public static void main(String[] args) 
    {
        try{
            int a=10;
            int b=0;
            int result=a/b;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Divide by zero");
        }
        finally
        {
            System.out.println("Program completed");
        }
    }
}
