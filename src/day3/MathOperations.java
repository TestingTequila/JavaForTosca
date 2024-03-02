package day3;

public class MathOperations {

    public static void main(String[] args) {
        //1. I/I = I
        System.out.println(10 / 2); // 5
        System.out.println(10 / 3); // 3

        //2. if double is either in N/D = D

        System.out.println(10.0 / 2);
        System.out.println(10.0 / 3);
        System.out.println(10.0 / 3.0);
        System.out.println(10 / 3.0);

        // 3. I/0=AE[divide by 0]
        //System.out.println(10/0);

        //4. IorD/0.0 = Infinity

        System.out.println(10 / 0.0);
        System.out.println(10.98 / 0.0);

        //If its only zeros in N or C at-least one has to be double=NaN
        System.out.println(0 / 0.0);
        System.out.println(0.0 / 0);
        System.out.println(0.0 / 0.0);

        //System.out.println(0/0);// AE


        //Modulo Operator [%] [This gives you the remainder]
        System.out.println(10 % 2); //0
        System.out.println(10 % 3); //1
        System.out.println(20 % 7); //6
        System.out.println(100 % 21);//16
    }

}
