package day2;

import java.util.SortedMap;

public class VariablesConcepts {

    public static void main(String[] args) {

        System.out.println("========BYTE================");
        //byte [-128 to 127][1 Byte = 8 bits]
        byte b1=100;
        byte b2=100;
        byte b3=-128;
        byte b4=127;
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        int byteSum=b1+b2; // byte + byte


        System.out.println("========SHORT================");
        //short[-32768 to 32767][2 Bytes = 16 bits]
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        short s1=129;
        short s2 =-32768;
        short s3=32767;
        short s4=10;

        int shortTotal =b1+s1;

        System.out.println("========INT================");
        // int [-2147483648 to 2147483647] [4 byte]
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        int i1 =32768;

        System.out.println("========long================");
        //long[-9223372036854775808 to 9223372036854775807][8 Byte]
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        long l1 =10l;
        System.out.println(l1);

        //Floating Point:
        // float[up to 7 digits after decimal][4 Byte]
        System.out.println("========float================");
        float f1=12.33f; //(float)12.33;
        System.out.println(f1);
        float floatSum =b1+f1;

        //double[above 7 digits after decimal][8 Byte]
        double d1 =12.33333888;
        double total =f1+d1;




    }
}
