public class Main {
    public static void main (String[] args) {


        Change changeObj = new Change(34000f);

        changeObj.makeChange();

        changeObj.returnChange();

        float num1 = 23.564f;
        int num2 = 23;

        System.out.println(num1 > num2);
        System.out.println(num2 - num1);
    }
    
}