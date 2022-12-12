package Lecture3.Pattern1;

/*' 
Output similar Pattern6
1
23
345
4567

' */

import java.util.Scanner;

public class Pattern6sec_type {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
            int n= sc.nextInt();
            int i=1;
            while(i<=n){
                int j=1;
                int startingNumber=i;
                while(j<=i){
                    System.out.print(startingNumber);
                    startingNumber++;
                    j++;
                }
                System.out.println();
                i++;
            }
        }
}
