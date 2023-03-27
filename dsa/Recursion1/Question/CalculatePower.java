package dsa.Recursion1.Question;


// Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to return the answer.
// Do this recursively.


public class CalculatePower {
    public static int power(int x, int n) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
		 if (n==0){
			 return 1;
		 }
		 	int smallOutput = power(x, n - 1);

			// Defining the final induction
			int output = x * smallOutput;
			return output;
		
	}
}
