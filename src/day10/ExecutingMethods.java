package day10;

public class ExecutingMethods
{
    public static void main(String[] args) {
        Maths3 m3 = new Maths3();
        m3.a=12;
        m3.b=8;
        m3.addition();

        Maths3 m33 = new Maths3();
        m33.a=122;
        m33.b=88;
        m33.addition();

        Maths3 m333 = new Maths3();
        m333.a=1122;
        m333.b=858;
        m333.addition();

        System.out.println("================================Maths4====================");

        Maths4 m4 = new Maths4();
        m4.addition(12,8);

        Maths4 m44 = new Maths4();
        m44.addition(122,88);

        Maths4 m444 = new Maths4();
        m444.addition(1122,858);


        System.out.println("================================Maths5====================");

        Maths5 m5 = new Maths5();
        m5.addition();
        m5.calculateTax(5000);

        Maths5 m55 = new Maths5();
        m55.addition();
        m55.calculateTax(15000);

        Maths5 m555 = new Maths5();
        m555.addition();
        m55.calculateTax(60000);



    }
}
