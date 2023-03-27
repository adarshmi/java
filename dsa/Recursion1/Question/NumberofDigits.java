package dsa.Recursion1.Question;


//Given the number 'n', find out and return the number of digits present in a number .

public class NumberofDigits {
    public static int count(int n){
		//Write your code here
		if(n==0){
			return 0;
		}
			int smallestAns=count(n/10);
			return smallestAns+1;

		}
}
