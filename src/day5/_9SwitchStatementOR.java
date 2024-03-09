package day5;

public class _9SwitchStatementOR
{
    public static void main(String[] args) {
        String dayOfWeek = "Saturday";
        switch (dayOfWeek)
        {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("I will go to office");
                break;
            default:
                System.out.println("Its weekend...i will party");
                break;
        }
    }
}

// switch doesn't supports && operator
