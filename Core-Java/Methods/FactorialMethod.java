public class FactorialMethod 
{
    void Factorial(int number)
    {
       int result=1;
        for(int i=1;i<=number;i++)
        {
            result=result * i;
        
             
        }
        System.out.println("Factorial = " + result);
    }
    public static void main(String[] args) 
    {
        FactorialMethod obj=new FactorialMethod();
        obj.Factorial(5);
        
    }
}
