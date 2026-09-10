class ReturnType
{
    int addition(int a,int b)
    {
         int result=a+b;
         return result;
         
    }
    public static void main(String[] args) 
    {
        ReturnType obj=new ReturnType();
        int result = obj.addition(10,20);

System.out.println("Result=" +result);
    }
}