package day8;

import com.sun.source.tree.NewArrayTree;

import javax.print.DocFlavor;

public class ExecutingResume {
    public static void main(String[] args) {

        // ClassName aliasName = new ClassName();
        Resume resume1 = new Resume();
        resume1.fName ="Jason";
        resume1.lName ="Hill";
        resume1.gender ='M';
        resume1.lastSalary =456456;

        Resume resume2 = new Resume();
        //resume2 =null;
        resume2.fName ="Kerrie"; // NPE

        new Resume().fName="Shahnaz";
        new Resume().lName ="Mehmood";
        new Resume().lastSalary =5654;

        System.gc();

        new Resume().fName="Jhanvi";
        new Resume().lName ="Kapoor";
        new Resume().gender ='F';



    }
}
