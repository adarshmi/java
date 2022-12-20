package dsa.Oops1.class_and_object;

public class StudentClass {
    String name;
    int rollNumber;
    String Address;
    int year;
    String company_name;

    // Access Modifiers
    public String name1;
    private int rollNumber1;

   // function creater
    public void setRollnumber(int rn){
        if (rn<=0){
            return;
        }
        rollNumber1=rn;
    }

    // second function created
    public int getRollnumber(){
        return rollNumber1;

    }

}
