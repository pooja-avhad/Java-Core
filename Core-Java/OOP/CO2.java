public class CO2
{
    String name;
    int age;

    void display()
    {
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
    public static void main(String[] args) 
    {
        CO2 obj=new CO2();
        obj.name="pooja";
         obj.age=21;

        CO2 obj1=new CO2();
         obj1.name="Rani";
        obj1.age=22;

        obj.display();
        obj1.display();
        
    }

}
