class Vehicl1
{
    int speed=100;
}
class Car extends  Vehicl1
{
    int speed=200;
    void display()
    {
        System.out.println("Car Speed:"+speed);
        System.out.println("Vehicl Speed:"+super.speed);
    }
    public static void main(String[] args) 
    {
        Car obj=new Car();
        obj.display();
    }
}
