package Lecture3.Pattern1;

import java.util.Scanner;
/*'
Output
1
21
321
4321
' */

public class ReverseNumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print(i - j + 1);
                j++;
            }
            System.out.println();
            i++;
        }

    }
}
