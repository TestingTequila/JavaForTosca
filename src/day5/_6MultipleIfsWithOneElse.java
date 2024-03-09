package day5;

public class _6MultipleIfsWithOneElse
{
    public static void main(String[] args) {
        int score = 75;
        if(score>90)
        {
            System.out.println(" Excellent ...You got a grade A");
        }
        if(score<90 && score>=80)
        {
            System.out.println(" Very Good....You got a grade B");
        }
        if(score<80 && score>=70)
        {
            System.out.println("Good....You got a C");
        }
        if(score<70 && score>=60)
        {
            System.out.println("Fair...You got D");
        }
        else
        {
            System.out.println("Work Hard...You got F");
        }
    }

    //in Multiple if statement with one else statement, else will always execute if the latest condition it just checked is false.
}
