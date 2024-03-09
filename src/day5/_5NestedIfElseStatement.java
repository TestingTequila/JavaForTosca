package day5;

public class _5NestedIfElseStatement
{
    public static void main(String[] args) {

        int age = 17;
        boolean hasTicket = true;
        boolean hasMoney= false;

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
                else
                {
                    System.out.println(" No Money---Cannot buy Beer");
                }
            }
            else {
                System.out.println(" No Tickets--You cannot enter the Venue ");
            }
        }
        else
        {
            System.out.println(" You are not eligible to watch the show");
        }



    }
}
