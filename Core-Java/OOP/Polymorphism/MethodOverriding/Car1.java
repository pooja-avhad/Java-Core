class Vechicle
{
    void start()
    {
        System.out.println("Vechicle");
    }
}


public class Car1  extends Vechicle
{
    @Override 
    void start()
    {
        System.out.println("Car");
    }
    public static void main(String[] args) 
    {
         Vechicle obj=new Car1();
        obj.start();
    }
}
