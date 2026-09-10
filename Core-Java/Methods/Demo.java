class Demo
{
    static void show()
    {
        System.out.println("Static Method");
    }

    void display()
    {
        System.out.println("Non-Static Method");
    }

    public static void main(String[] args)
    {
        Demo.show();

        Demo obj = new Demo();

        obj.display();
    }
}