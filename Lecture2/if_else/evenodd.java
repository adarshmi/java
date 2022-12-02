package Lecture2.if_else;

import java.util.Scanner;

public class evenodd{
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n%2==0){
            System.out.println("Number Is Even");
        }else {
            System.out.println("Odd");
        }

    }
    
}
