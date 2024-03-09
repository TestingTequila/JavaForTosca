package day5;

import java.util.Calendar;

public class _8SwitchStatement
{
    public static void main(String[] args) {
        int dayOfWeek =10;
        switch (dayOfWeek)
        {
            case 1:
                System.out.println("Its Monday");
                break;
            case 2:
                System.out.println("Its Tuesday");
                break;
            case 3:
                System.out.println("Its Wednesday");
                break;
            case 4:
                System.out.println("Its Thursday");
                break;
            case 5:
                System.out.println("Its Friday");
                break;
            case 6:
                System.out.println(" Its Saturday");
                break;
            default:
                System.out.println("Invalid number given");
                break;
            case 7:
                System.out.println("Its Sunday");
                break;
        }
    }
}

// switch doesn't support && operator
