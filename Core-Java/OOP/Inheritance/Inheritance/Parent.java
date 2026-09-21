public class Parent 
{
    Parent()
    {
        System.out.println("Parent Constructor");
    }
}
class Child extends Parent

{
    Child()
    {
        super();
        System.out.println("Child Constructor");
    }
    public static void main(String[] args) 
    {
        Child obj=new Child();
    
    }
}