package dsa.Oops1.class_and_object;

public class test {
    // int a; 
    // int b; 
    // test() 
    // {   
    //     this(10, 20);   
    //     System.out.print("constructor one "); 
    // } 
    // test(int a, int b) 
    // { 
    //     this.a = a; 
    //     this.b = b; 
    //     System.out.print("constructor two "); 
    // } 
    static int marks;
    void set_marks(int marks)
    {
        this.marks=marks;               //Line 1
    }


    int price;
    static int count; 

    public test(int price) {
        this.price = price;
        count++;
    }    

}
