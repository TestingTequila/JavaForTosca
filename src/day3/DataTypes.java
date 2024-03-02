package day3;

public class DataTypes
{
    public static void main(String[] args) {
        //char [a-z,A-Z,1-9, !-@#$%^&*(){}[]][2 bytes]
        char c1 = 'a';
        System.out.println(c1);
        char c11='b';
        System.out.println(c11);
        char c2='1';
        System.out.println(c2);
        char c3 ='2';
        System.out.println(c2);


        System.out.println(c1+c11); //97+98= 195
        System.out.println(c11+c2); //98+49 =147
        System.out.println(c2+c3);  //49+50=99

        char c4= '$'; //36
        char c5 ='%'; //37

        System.out.println(c4+""+c5); //73
        System.out.println(c4+""+c5); //$%

        System.out.println((int)c4); //$--->36
        System.out.println((int)c11); //b--->98

        System.out.println(c4+c11);//134
        System.out.println((int)c4+c11);//134
        System.out.println((int)c4+(int)c11);//134

        System.out.println(c11+0);//98
        System.out.println(c11+'0');//146

        System.out.println(0); //0
        System.out.println('0');// 0

        System.out.println('*' + 55); //42+55

        System.out.println('*' + '9'); //42+57

        System.out.println('*' + '5'); //


        //boolean [true/false][~1/8thByte=~1 bit]
        boolean b1=true;
        System.out.println(b1);
        boolean b2 =false;
        System.out.println(b2);










    }
}
