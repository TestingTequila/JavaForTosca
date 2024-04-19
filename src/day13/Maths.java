package day13;

public class Maths
{
    //In a class we can have 2 or more methods with same name provided
    // 1. Parameters data type is different
    // 2. Parameters order is different
    // 3. Parameters count is different

    public int addition(int a, int b)
    {
        int sum=a+b;
        System.out.println("Addition of int and int " + a + " and " +b +" is " + sum);
        return sum;
    }

    public void addition(double c, int d)
    {
        double sum=c+d;
        System.out.println("Addition of " + c + " and " +d +" is " + sum);
    }
    public void addition(double c, double d)
    {
        double sum=c+d;
        System.out.println("Addition of " + c + " and " +d +" is " + sum);
    }

    public void addition(double c, float d)
    {
        double sum=c+d;
        System.out.println("Addition of " + c + " and " +d +" is " + sum);
    }



    public void addition(float c, double d)
    {
        double sum=c+d;
        System.out.println("Addition of " + c + " and " +d +" is " + sum);
    }

    public void addition(float c, double d, int a)
    {
        double sum=c+d;
        System.out.println("Addition of float/double/int is " + c + " and " +d +" is " + sum);
    }

     public  void subtraction(){

     }
    public  void subtraction(int a){

    }

    public  void subtraction(double a){

    }

    public  void subtraction(double a, int b){

    }

    public  void subtraction(int a, double b){

    }

    public  void subtraction(int a, int b){

    }
}
