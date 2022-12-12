package Lecture3.Pattern1;



/*'
Outpur
1
23
345
4567
'
 */
import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] agrs){
    Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print(i+j-1);
                j++;
            }
            System.out.println();
            i++;
        }
	}
}
    

