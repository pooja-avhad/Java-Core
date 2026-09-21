public class parameterizedconstructor 
{
    parameterizedconstructor(String name,int age)
    {
        
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
    public static void main(String[] args) 
    {
        parameterizedconstructor obj=new parameterizedconstructor("Pooja", 22);
    }
}
