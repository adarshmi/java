package Array.Question;

import java.util.Scanner;

public class returnofArraysum {

    // Question Given an array/list(ARR) of length N, you need to find and return the sum of all the elements in the array/list.

    // takeing intput by user 

    public static int []takekingInput(){
        Scanner s = new Scanner(System.in);
        int sizeofArray = s.nextInt();
        int inputStoreinArray[]=new int [sizeofArray];
        for(int i = 0; i<sizeofArray; i++){
            inputStoreinArray[i]=s.nextInt();

        }
        return inputStoreinArray;
    }

    public static int  sum (int inputStoreinArray[]){
        int sum =0;
        for (int i =0; i<inputStoreinArray.length;i++){
            sum=sum+inputStoreinArray[i];
        }
        return sum;
    }

    public static void main (String []args){
        int arin[] = takekingInput();
        int allSum = sum(arin);
        System.out.println(allSum);


    }

    
    //
}
