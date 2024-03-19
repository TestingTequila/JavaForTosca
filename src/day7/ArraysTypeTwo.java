package day7;

public class ArraysTypeTwo
{
    public static void main(String[] args) {

        // dataType[] arrayName = new dataType[countOfItemsYouWantTOStore]
        int[] num = new int[7];
        num[0]=12;
        num[1]=5;
        num[2]=45;
        num[4]=66;
        num[5]=67;
        num[6]=56;
        num[7]=100;

        for(int n: num)
        {
            System.out.println(n);
        }

    }
}

// static arrays