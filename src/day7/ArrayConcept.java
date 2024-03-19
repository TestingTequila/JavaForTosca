package day7;

public class ArrayConcept {
    public static void main(String[] args) {

        //12,34,56,78,36

        int a = 12;
        int b = 34;
        int c = 56;
        int d = 78;
        int e = 36;

        //dataType variableName = value;
        //dataType[] arrayName    = {value1, value2, value3...............valueN}

        int[] numbers = {12, 34, 56, 78, 36, 88, 44, 66, 77, 122, 432, 444, 44};
        System.out.println(numbers[2]);
        System.out.println(numbers[4]);
        System.out.println(numbers.length);

        // Jason, Kerrie, Lee, Divya, John, Ashish
        //dataType[] arrayName    = {value1, value2, value3...............valueN}


        String[] names = {"Jason", "Kerrie", "Lee", "Divya", "John", "Ashish", "Shahnaz"}; //names[0] -names[5], 6
        //loops

        int i=0;
        while (i<names.length)
        {
            if(names[i].equals("Shahnaz"))
            {
                System.out.println("She is amazing...");
            }
            System.out.println(names[i]);
            i++;//6
        }

        // for loop


        for (int i1=0;i1<names.length; i1++)
        {
            if(names[i1].equals("Shahnaz"))
            {
                System.out.println("She is amazing in for loop as well...");
            }
            System.out.println(names[i1]);
            //6
        }
       // System.out.println(names.length);

        System.out.println("==============Advanced For loop / For each loop====================");

        for(String n: names)
        {
            if(!(n.equals("Jason")||n.equals("Kerrie")||n.equals("Lee")||n.equals("John")||n.equals("Ashish")||n.equals("Shahnaz")))
            {
                System.out.println(n);
            }
        }

        // for each String n in names

    }
}
