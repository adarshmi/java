package Lecture3.Pattern1;

import java.util.Scanner;

public class BasicPattern {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=n){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        

    }
}

