package day3;

public class StringConcatenation {
    public static void main(String[] args) {
        String x = "Hello";
        String y = "World";

        int a = 100;
        int b = 200;

        System.out.println(x); // Hello
        System.out.println(y); // World
        System.out.println(a); // 100
        System.out.println(b); // 200

        System.out.println(x + y); // HelloWorld
        System.out.println(a + b);//300
        System.out.println(x + a);//Hello100
        System.out.println(a + b + x);//300Hello
        System.out.println(a + b + x + y);//300HelloWorld
        System.out.println(x + y + a + b);//HelloWorld100200
        System.out.println(a + b + x + y + a + b);//300HelloWorld100200
        System.out.println(a + b + x + y + (a + b));//300HelloWorld300

        double d1 = 12.33;
        double d2 = 23.44;
        System.out.println(x + y + d1 + d2); //HelloWorld12.3323.44
        System.out.println(d1 + d2 + x + y + d1 + d2);


    }
}
