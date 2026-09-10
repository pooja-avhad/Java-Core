class EvenOddMethod
{
    void EvenOdd(int number)
    {
        if(number%2==0)
        {
           System.out.println("Even:="+number);
        }
        else{
            System.out.println("Odd="+number);
        }
    }
    public static void main(String[] args) 
    {
        EvenOddMethod obj=new EvenOddMethod();
        obj.EvenOdd(7);
    }
}