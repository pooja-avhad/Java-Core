public class Vehicle
{
    int speed = 100;

    void start()
    {
        System.out.println("Vehicle Start");
    }

    public static void main(String[] args)
    {
        Car obj = new Car();

        System.out.println("Speed: " + obj.speed);
        obj.start();
        obj.display();
    }
}            

class Car extends Vehicle
{
    String brand = "BMW";

    void display()
    {
        System.out.println("Brand: " + brand);
    }
}
