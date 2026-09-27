package Packages.testpackage;

import Packages.mypackage.Employee;

public class Manager   extends Employee
{
    
    public void showSalary()
    {
        System.out.println(salary);
    }
    public static void main(String[] args)
{
    Manager m = new Manager();

    m.showSalary();
}
}
