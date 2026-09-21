public class ThisKeyword 
{
    String name;
    int age;
    ThisKeyword(String name,int age)
    {
        
        this.name=name;
        this.age=age;

        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
    public static void main(String[] args) 
    {
        ThisKeyword obj=new ThisKeyword("Pooja", 21);
    }
}
