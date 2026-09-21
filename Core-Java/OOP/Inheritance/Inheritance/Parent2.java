public class Parent2
{
    void show()
    {
        System.out.println("Parent");
    }
}

class Child1 extends Parent2
{
    void show()
    {
        System.out.println("Child");
    }

    void display()
    {
        super.show();
    }

    public static void main(String[] args)
    {
        Child1 obj = new Child1();

        obj.display();
        obj.show();
    }
}
