package Lecture3.Pattern1;

import java.util.Scanner;


/* 'Output 
ABCD
BCDE
CDEF
DEFG' */
public class patternchar2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;

        while (i <= n) {
            int j = 1;
            char staringChar = (char) ('A' + i - 1);
            while (j <= n) {
                System.out.print(staringChar);
                staringChar++;

                j++;
            }
            System.out.println();
            i++;
        }

    }
}
