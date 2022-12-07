package Lecture2.Scope.Assignment;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int i=1;

        while(i<=10){
            System.out.println(i*n);
            i++;

        }
    }
}
