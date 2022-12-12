package Lecture3.Pattern1;


/*'
Output
1
12
123
1234

' */
import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }
        

    }
    
}
