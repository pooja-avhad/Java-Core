class Animal
{
    void eat()
    {
        System.out.println("Eating");
    }
}


public class Dog1  extends Animal
{
    void bark()
    {
        System.out.println("Barking");
    }
    public static void main(String[] args) 
    {
        Animal obj=new Dog1();
        Dog1 obj2=(Dog1)obj;
        obj2.bark();
    }
}
