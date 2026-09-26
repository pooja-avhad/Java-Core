public class Throw
{
    public static void main(String[] args)
    {
        int age = 15;

        try
        {
            if(age < 18)
            {
                throw new IllegalArgumentException("Age must be 18 or above");
            }
            else
            {
                System.out.println("Valid Age");
            }
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("Age must be 18 or above");
        }
    }
}

