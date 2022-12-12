package Lecture3.Pattern1;

import java.util.Scanner;

/*'
Output
E
DE
CDE
BCDE
ABCDE' */

public class InterestingAlphabets {
    public static void main(String[] args) {
		//Your code goes here
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {

            int j = 1;
            char staringChar = (char) ('A' + n-i );
            while (j <= i) {
                System.out.print(staringChar);
                staringChar++;
                j++;
            }
            System.out.println();
            i++;
        }

    }
}
