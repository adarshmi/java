package Lecture2.while_loop;

import java.util.Scanner;

public class SumOfNnumber {

    // Sum of Number
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int i = 1;
        int sum = 0;

        while(i<= n){
            sum = sum + i;
            i=i+1;

        }
        System.out.println(sum);

    }
    
}
