abstract class Animal1
{
    abstract void sound();
    
        void eat()
        {
            System.out.println("Eating");
        }
    }
    public class Dog3 extends Animal1
{
    @Override 
    void sound()
    {
        System.out.println("Dog Barks");
    }
    public static void main(String[] args) 
    {
        Dog3 obj=new Dog3();
        obj.sound();
        obj.eat();
    }
}
