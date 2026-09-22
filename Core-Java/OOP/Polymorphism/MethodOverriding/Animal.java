public class Animal 
{
    void sound()
    {
        System.out.println("Animal");
}
}

class Dog extends Animal
{
    @Override 
    void sound()
    {
        System.out.println("Dog");
    }
    public static void main(String[] args) 
    {
        Dog obj=new Dog();
        obj.sound();
        
        
    }
}
