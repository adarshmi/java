package Lecture2.Scope.Assignment;

import java.util.Scanner;

public class TotalSalary {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int bs = sc.nextInt();
        char grade  = sc.next().charAt(0);
        double hra = 0.2 * bs;
        double da =0.5*bs;

        int allows ;

        if(grade == 'A'){
            allows=1700;
        }else if(grade == 'B'){
            allows = 1500;
        }else{
            allows = 1300;
        }
        double pf = 0.11 * bs;

        double totalSalary = bs + hra+ da + allows-pf;
        int ans = (int)Math.round(totalSalary);
        System.out.println(ans);




    }
}
