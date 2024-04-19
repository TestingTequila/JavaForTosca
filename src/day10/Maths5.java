package day10;

public class Maths5
{

    public  void addition( )
    {
        int a=12;
        int b=8;
        int sum =a+b;
        System.out.println("sum: " + sum);
    }

    private  int salary;
    public  void calculateTax(int salary)
    {
        double tax = 0.3;
        this.salary = salary;
        System.out.println("My Tax Deducted: " + salary*tax);
    }
}
