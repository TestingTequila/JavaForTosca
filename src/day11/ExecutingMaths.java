package day11;

public class ExecutingMaths
{
    public static void main(String[] args) {
        Maths math = new Maths();
        //int total1 =math.addition1(12,8); // void

        int total4=math.addition4(12,8); // int sum
        System.out.println("Addition4 result: "+total4);

        int total2=math.addition2(12,8); // int a
        System.out.println("Addition2 result: "+total2);

        int total3=math.addition3(12,8); // int b
        System.out.println("Addition3 result: "+total3);

        double empSalary=math.calculateSalary(1000.00, 5000.00);
        System.out.println("Salary Without Bonus: " + empSalary);
        double finalSalary=empSalary + 1000.00;
        System.out.println("This salary along with bonus should be credited: " + finalSalary);

        String emp2FirstName=math.empName2("Jason", "Roger"); // String firstName
        String nameToBePrintedOnIdCard=emp2FirstName+ " MEDMA";
        System.out.println("Name On IdCard: " + nameToBePrintedOnIdCard);

        System.out.println("===================================================");

        math.a=20;
        math.b=30;
        int total0=math.addition0();
        System.out.println("Method without parameter and with return type: "+total0);
        System.out.println(total0 * 2);




    }
}
