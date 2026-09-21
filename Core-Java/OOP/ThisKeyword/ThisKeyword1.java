public class ThisKeyword1 
{
    ThisKeyword1()
    {
        System.out.println("Default Construstor");
    }
    ThisKeyword1(String name)
    {
        this();
        System.out.println("Name:"+name);
    }
    public static void main(String[] args) 
    {
        ThisKeyword1 obj=new ThisKeyword1("Pooja");
    }
}
