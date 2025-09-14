public class DriverClass {

    public static void main(String[] args) {

        myClone myObj1 = new myClone();
        try {
            // myClone myObj1 = new myClone();

            myClone myObj2 = (myClone) myObj1.clone(); // Type casted as java will create the object of class: Object;

            // ============= To print the objects
            System.out.println(myObj2);

            // ============= To Print the attributes of the objects
            System.out.println(myObj1.toString());
            System.out.println(myObj2.toString());

            // =============== To print the address of the classes
            System.out.println(myObj1.getClass().getName() + "@" + myObj1.hashCode());
            System.out.println(myObj2.hashCode());

        } catch (CloneNotSupportedException e) {

            System.out.println("Could not clone because of CloneNotSupportedException");
            e.printStackTrace();
        }

        try {

            Int3 intNum = new Int3(5);
            Int3 intNumCopy = (Int3) intNum.clone();

            //Attribute chnged.
            intNumCopy.j = 3;

            System.out.println(intNum);
            System.out.println(intNumCopy);

            System.out.println(intNum.hashCode());
            System.out.println(intNumCopy.hashCode());

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
