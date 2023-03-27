package forLoop;
/* Nth term of Fibonacci series F(n), where F(n) is a function, is calculated using the following formula - */

import java.util.Scanner;



public class Nth_Fibonacci_Number {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = 0;
        int b = 1;
        int c ;

        for(int i=0;i<n;i++){
            c= a+b;
            a=b;
            b=c;
        }
        System.out.println(a);
    }
}
