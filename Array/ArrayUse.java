package Array;

public class ArrayUse {
    public static void main(String[] args ){

        //  video example 
        int  n =10;
        int [ ] arr =new int[n];
        arr[0] =15;
        System.out.println(arr[0]);

        char chArray[] = new char [11];
        chArray[0]= 'a';
        String stArry[] = new String [12];
        stArry[0]= "hghgghgj";
        System.out.println(stArry[0]);

        double dArray []= new double [12];
        System.out.println(chArray[0]);
        System.out.println(dArray[2]);

        // Question What is this Output 

        // Q1
        int arry[]= new int [5];
        System.out.println(arry[0]);
        //output is );- 0 because if you not assign a vale in a blank array then every colume by defult assign the value is 0

        // Q2
        char chArr[] = new char[15];
        //System.out.println(chArr[15]);
        // OutPut is );- Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15 (the reason is Array is Start is 0 colume if you are assign in 15 colume then colume is counting is 0 to 14  )

        // Q3 
        boolean arrs[] = new boolean[5];
        System.out.println(arrs[0]);

         // OutPut is );- False because  whatever an boolean array is created, all elements are initialised to false 

        //  Question  );- how to find array length 
        // Answer is );- using arr.length  

    }
}
