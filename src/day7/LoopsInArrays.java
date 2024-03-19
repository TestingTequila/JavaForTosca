package day7;

public class LoopsInArrays {
    public static void main(String[] args) {

        int[] numbers = {12, 34, 56, 78, 36, 88, 44, 66, 77, 122, 432, 444, 44};

        System.out.println("=======================while loop========================");

        int i = 0;
        while (i < numbers.length) {
            System.out.println(numbers[i]);
            i=i+2;
        }

        System.out.println("=======================for loop========================");
        for (int j = 0;j < numbers.length;j=j+2)
        {
            System.out.println(numbers[j]);
        }

        System.out.println("=======================for each========================");

        for(int num: numbers)
        {
            System.out.println(num);
        }

    }
}
