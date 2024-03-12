package day6;

public class ForLoop
{
    // Ashish

    public static void main(String[] args) {

        System.out.println("==============================1 to 10================");

        for(int i=1; i<=10;  i++)
        {
            if(i==5)
            {
                System.out.println("Hello");
            }
            System.out.println(i); //1, 2, 3..............9, 10

        }
        System.out.println("==============================10 to 1================");
        // 10 -1

        for (int j =10;j>0;j--)
        {
            System.out.println(j);

        }

        System.out.println("==============================Table of 2================");

        for (int k = 1;k<=10; k++)
        {
            System.out.println(5*k); //2, 4, 6................18, 20
            // k = k+1;
        }

        System.out.println("===================Table to 2 without I/D operator");



        for(int x =2;x<=20;x = x+2)
        {
            System.out.println(x);//2, 4, 6.......

        }


//        while (true)
//        {
//            System.out.println("Welcome to Hilton Hotel");
//        }
        System.out.println("================Print multiples of 5===================");

        for (int m =1;m<=100; m++)
        {
            if(m%5==0) {
                System.out.println(m); //5, 10
                if(m==50)
                {
                    System.out.println("We have reached halfway");
                }
            }

        }

        String word= "Automation";

    }
}
