package Lecture2.while_loop;

import java.util.Scanner;

public class SumofEvenNnuber {
    
    // Given a number N, print sum of all even numbers from 1 to N.

    public static void main (String[]args){
        

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        int i = 1;

        while(i<=n){
            if(i%2==0){
                sum=sum+i;
            }
            i=i+1;
        }
        System.out.println(sum);
    }

    
}
