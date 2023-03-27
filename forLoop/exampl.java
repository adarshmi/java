package forLoop;

import java.util.Scanner;

public class exampl {
    public static void main (String[]args){
        // Scanner s = new Scanner(System.in);
        // int n = s.nextInt();
        for(int i = 0; i < 5; i++){
            System.out.println(i + " ");
            i = i + 1;
        }
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                 if (j == 1)
                     break;
                 System.out.print(j +" ");
             }
             System.out.println(i);
        } 



    }
    
}
