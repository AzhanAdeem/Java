
// This is the student class that uses the courselist class 
// The Student class is associatied with the courselist class

// Each studnt will create it's own object and have their separate courses.

public class Student {

    //Attributes

    private String stuName;
    private String seatNum;

    public Student() {}

    // Setters and Getters

    void setName(String name){
        this.stuName = name;
    }

    void setSeatNum(String num){
        this.seatNum = num;
    }

    String getName(){
        return this.stuName;
    }

    String getSeatNum() {
        return this.seatNum;
    }

    //@Overriding interprise methods;

    @Override
    public String toString(){

        return "Student Name: "+ this.getName() + "Seat Num:"+this.getSeatNum()+"\n";
    }



    
}
