package Lecture3.Pattern1;

import java.util.Scanner;

/* Your class should be named Solution.'
Read input as specified in the question.
Print output as specified in the question.
'Output 
*
**
***
****
'
'*/


public class TriangularStarPattern {
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i=0;
		while(i<=n) {
			int j = 1;
			while(j<=i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
