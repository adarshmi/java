package dsa.Oops1.class_and_object;

import java.util.Scanner;

public class StudentUse {
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        StudentClass s1 = new StudentClass();

        s1.name="Roy";
        s1.rollNumber = 123;
        s1.Address = "Noida";
    


        StudentClass s2 = new StudentClass();
        s2.name="Adarsh ";
        s2.rollNumber = 12;
        s2.Address = " Greater Noida";

        

        System.out.println(s1);
        System.out.println(s2.name);

    }
}
