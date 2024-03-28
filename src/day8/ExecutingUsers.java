package day8;

public class ExecutingUsers
{
    public static void main(String[] args) {
        User u1 = new User();
        u1.name ="Ravi";
        u1.age=25;
        u1.city="Pune";

        User u2 = new User();
        u2.name ="Anjali";
        u2.age=27;
        u2.city="LA";

        User u3 = new User();
        u3.name ="Kareem";
        u3.age=30;
        u3.city="NY";


        System.out.println(u1.name + ": " + u1.age + ": " + u1.city); //Ravi
        System.out.println(u2.name + ": " + u2.age + ": " + u2.city); //Anjali
        System.out.println(u3.name + ": " + u3.age + ": " + u3.city); //Kareem

        System.out.println("=====u1=u2=u3==================");
        u1=u2=u3;

        System.out.println(u1.name + ": " + u1.age + ": " + u1.city); //Kareem
        System.out.println(u2.name + ": " + u2.age + ": " + u2.city); //Kareem
        System.out.println(u3.name + ": " + u3.age + ": " + u3.city); //Kareem

//
//        u1=u2; // u1 will break its original connection and start pointing where u2 is pointing
//
//        System.out.println("============================u1=u2========================");
//
//        System.out.println(u1.name + ": " + u1.age + ": " + u1.city); // Anjali
//        System.out.println(u2.name + ": " + u2.age + ": " + u2.city); // Anjali
//        System.out.println(u3.name + ": " + u3.age + ": " + u3.city); // Kareem
//
//        u2=u3; // u2 will break its original connection and start pointing where u3 is pointing
//
//        System.out.println("============================u2=u3========================");
//
//        System.out.println(u1.name + ": " + u1.age + ": " + u1.city); // Anjali, 27, LA
//        System.out.println(u2.name + ": " + u2.age + ": " + u2.city); // Kareem
//        System.out.println(u3.name + ": " + u3.age + ": " + u3.city); // Kareem
//
//        u3=u1; // u3 will break its original connection and start pointing where u1 is pointing
//
//        System.out.println("============================u3=u1========================");
//
//        System.out.println(u1.name + ": " + u1.age + ": " + u1.city); // Anjali, 27, LA
//        System.out.println(u2.name + ": " + u2.age + ": " + u2.city); // Kareem
//        System.out.println(u3.name + ": " + u3.age + ": " + u3.city); // Anjali
//
//
//        System.out.println("============================u1=u2=u3========================");
//
//        System.out.println(u1.name + ": " + u1.age + ": " + u1.city); // Anjali, 27, LA
//        System.out.println(u2.name + ": " + u2.age + ": " + u2.city); // Kareem
//        System.out.println(u3.name + ": " + u3.age + ": " + u3.city); // Anjali




    }
}
