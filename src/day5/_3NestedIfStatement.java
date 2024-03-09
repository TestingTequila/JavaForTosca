package day5;

public class _3NestedIfStatement
{
    public static void main(String[] args) {

        int age = 20;
        boolean hasTicket = true;
        boolean hasMoney= true;

        if(age>=18)
        {
            System.out.println("You are eligible to see the show");
            if(hasTicket)
            {
                System.out.println("You can enter the venue");
                if(hasMoney)
                {
                    System.out.println("Can buy Beer");
                }
            }
        }



    }
}
