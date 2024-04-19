package day12;

public class Student
{
    public int getStudentMarks(String studentName)
    {
        int marks=-1;

        if(studentName.equals("Neha"))
        {
            marks= 100;
        }
        else if (studentName.equals("Jay"))
        {
            marks= 75;
        }

        else if (studentName.equals("Kerrie"))
        {
            marks= 92;
        }

        else if (studentName.equals("Muzaib"))
        {
            marks= 22;
        }
        else if (studentName.equals("Lee"))
        {
            marks= 72;
        }
        else if (studentName.equals("Rehmaan"))
        {
            marks= 98;
        }
        return marks;
    }

}
