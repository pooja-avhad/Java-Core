class Animal
{
    void eat()
    {
        System.out.println("Eating");
    }
}

interface Pet
{
    void play();
}

class MyDog extends Animal implements Pet
{
    void bark()
    {
        System.out.println("Barking");
    }

    @Override
    public void play()
    {
        System.out.println("Playing");
    }
}

public class ExtendsImplementsExample
{
    public static void main(String[] args)
    {
        MyDog obj = new MyDog();

        obj.eat();
        obj.bark();
        obj.play();
    }
}
