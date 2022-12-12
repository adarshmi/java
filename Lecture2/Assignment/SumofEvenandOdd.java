package Lecture2.Assignment;

import java.util.Scanner;

public class SumofEvenandOdd {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int even = 0,oddSum=0;

        while(0<num){
            int last= num % 10;
            if(last%2==0){
                even += last;
            }
            else{
                oddSum += last;
            }
            num = num / 10;
        }
        System.out.println(even + " " + oddSum);

    }
    
}
