package dsa.Recursion1.Question;

//Given the number 'n', write a code to print numbers from 1 to n in increasing order recursively.


public class PrintNumbers {
    public static void print(int n){
		//Write your code here
		if (n == 0) {
			return;
		}
		else{
			print(n - 1);
          System.out.print(n+" ");
		}
	}
}
