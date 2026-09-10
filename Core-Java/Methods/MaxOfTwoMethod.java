class MaxOfTwoMethod
{
    void Max(int a,int b)
    {
       
        if(a>b)
        {
            System.out.println("Maximun="+a);
        }
        else
        {
            System.out.println("Maximun="+b);
            
        }
    }
    public static void main(String args[])
    {
        MaxOfTwoMethod obj=new MaxOfTwoMethod();
         obj.Max(25,40);
    }
}