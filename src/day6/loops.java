package day6;

public class loops
{
    // Ashish

    public static void main(String[] args) {

        System.out.println("==============================1 to 10================");
        int i=1;
        while(i<=10)
        {
            if(i==5)
            {
                System.out.println("Hello");
            }
            System.out.println(i); //1, 2, 3..............9, 10
            i++;
        }
        System.out.println("==============================10 to 1================");
        // 10 -1
        int j =10;
        while (j>0)
        {
            System.out.println(j);
            j--;
        }

        System.out.println("==============================Table of 2================");
         int k = 1;
        while (k<=10)
        {
            System.out.println(5*k); //2, 4, 6................18, 20
            k++; // k = k+1;
        }

        System.out.println("===================Table to 2 without I/D operator");


        int x =2;
        while(x<=20)
        {
            System.out.println(x);//2, 4, 6.......
            x = x+2;
        }


//        while (true)
//        {
//            System.out.println("Welcome to Hilton Hotel");
//        }
        System.out.println("================Print multiples of 5===================");
        int m =1;
        while (m<=100)
        {
            if(m%5==0) {
                System.out.println(m); //5, 10
                if(m==50)
                {
                    System.out.println("We have reached halfway");
                }
            }
            m++;
        }
    }
}
