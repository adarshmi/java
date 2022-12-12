package Lecture2.Assignment;

import java.util.Scanner;

public class FindPowerOfaNumber {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);

        int x=sc.nextInt();
        int n  = sc.nextInt();

        int ans=1 ;

        while(n>0){
            ans *=x;
            n--;
        }
        System.out.println(ans);
        
    }
    
}
