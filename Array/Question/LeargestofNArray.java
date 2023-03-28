package Array.Question;
import java.util.*;

public class LeargestofNArray {

    public static int largestInArray(int arr[]){ 
    int max = Integer.MIN_VALUE;
        for (int i = 0; i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int [] takeingInput( ){
        Scanner s = new Scanner(System.in);
        int sizeofArray = s.nextInt();
        int inputStoreinArray [] = new int[sizeofArray];
    
        for(int i = 0; i<sizeofArray; i++){
            inputStoreinArray [i]=s.nextInt();
        }
        return inputStoreinArray;
    }
    public static void print(int inputStoreinArray[]){
        int sizeofArray = inputStoreinArray.length;
        for(int i = 0;i<sizeofArray; i++){
            System.out.print(inputStoreinArray[i]+" ");
        }

    }
    public static void main(String []args){
       
   int arr [] = takeingInput();
    print(arr);
    int largested = largestInArray(arr);
    
    System.out.println(" Largest " + largested );

    
        
}
    

    
}
