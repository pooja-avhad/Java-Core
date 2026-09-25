public class Encapsualtion 
{
    private int age;
    public void setAge(int age)
    {
        this.age=age;
    }
    public int getAge()
    {
        return age;
    }
    public static void main(String[] args) 
    {
        Encapsualtion obj=new Encapsualtion();
        obj.setAge(22);
        System.out.println(obj.getAge());
    }
}
