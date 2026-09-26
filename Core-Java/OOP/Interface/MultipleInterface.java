interface Animal
{
    void sound();
}

interface Pet
{
    void play();
}

class Dog implements Animal, Pet
{
    @Override
    public void sound()
    {
        System.out.println("Dog Barks");
    }

    @Override
    public void play()
    {
        System.out.println("Dog Plays");
    }
}

public class MultipleInterface
{
    public static void main(String[] args)
    {
        Dog obj = new Dog();

        obj.sound();
        obj.play();
    }
}