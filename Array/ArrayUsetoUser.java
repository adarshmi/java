package Array;
import java.util.*;

public class ArrayUsetoUser {

    public static int largestInArray(int Input[]){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i<Input.length;i++){
            if(Input[i]>max){
                max = Input[i];
            }
        }
        return max;
    }

    public static int [] takeInput(){
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int [ ] input = new int[size];
        for (int i =0; i<size; i++){
            input[i]=s.nextInt();
        }
        return input;

    }

    public static void print (int input []){
        int size = input.length;
        for (int i = 0; i<size; i++){
            System.out.print(input[i]+ " ");
        }
        System.out.println();

    }
    public static void main (String [ ] args){
        
        int arr[]=takeInput();
        print (arr);
        int largest = largestInArray(arr);
        System.out.println(" Largest " + largest);

        



    }
}
