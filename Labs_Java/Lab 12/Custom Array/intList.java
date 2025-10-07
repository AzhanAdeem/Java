//==============  This is a list that works like an arrayList till the basic functionality 
// =============  Like auto sizing

// User can specify the length and the name is the object name;
// No other data type as each data type requires a new class;
// so does the dimention but we can do it like python code was becoming lenthy;  
// The name will be the object name;
// Increase the size by : (orgSize * orgSize/2) + 1;

import java.util.Scanner;

public class intList {

    private int size;
    private int dimention;
    private String name;
    private String dataType;

    intList() {
        super();
    }

    intList(int size) {
        super();
        this.setSize(size);
    }

    // ============== Setters

    public void setSize(int size) {
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDataType(String dataType) {
    this.dataType = dataType;
    }

    public void setDimention(int dimention) {
    this.dimention = dimention;
    }

    //============== Getters

    public int getSize() {
        return this.size;
    }

    public String getName() {
        return this.name;
    }

    public String getDataType() {
        return this.dataType;
    }

    public int getDimention() {
        return this.dimention;
    }

    // ======   ======   End of setter and getters;

    // ==== ===== A method for creating a custom array

    void createArray(int size, int dimention, String dataType, String refName) {

        Scanner scanrRefVar = new Scanner(System.in);

        if (this.dataType.getClass().getSimpleName() == "String") {
            if (this.getDimention() == 1) {

                String[] list2 = new String[] { this.name };
                list2 = new String[this.size];

            } else if (this.getDimention() == 2) {

                System.out.println("Tell me the nested arrays length:");
                int nestedArrDimention = scanrRefVar.nextInt();

                String[] list = new String[] { this.name }; // Dimention and elements initialised;
                String[][] list2 = new String[][] { list };
                list2 = new String[this.size][nestedArrDimention];

                String[][] ans =  list2; // Shallow copy

            } else if (this.getDimention() == 3) {

                System.out.printf("\nTell me the 1st nested arrays length:");
                int nestedArrDimention = scanrRefVar.nextInt();

                System.out.printf("\nTell me the 1st nested arrays length:");
                int secNestedArrDimention = scanrRefVar.nextInt();

                String[] list = new String[] { this.name };
                String[][] list2 = new String[][] { list };
                String[][][] list3 = new String[][][] { list2 };
                list3 = new String[10][nestedArrDimention][secNestedArrDimention];

            } else {
                System.out.println("Enter a dimention > 4");
            }

        } else if (dataType.getClass().getSimpleName() == "int") {

            if (this.getDimention() == 1) {

                String[] list2 = new String[] { this.name };
                list2 = new String[this.size];

            } else if (this.getDimention() == 2) {

                System.out.println("Tell me the nested arrays length:");
                int nestedArrDimention = scanrRefVar.nextInt();

                String[] list = new String[] { this.name };
                String[][] list2 = new String[][] { list };
                list2 = new String[this.size][nestedArrDimention];

            } else if (this.getDimention() == 3) {

                System.out.printf("\nTell me the 1st nested arrays length:");
                int nestedArrDimention = scanrRefVar.nextInt();

                System.out.printf("\nTell me the 1st nested arrays length:");
                int secNestedArrDimention = scanrRefVar.nextInt();

                String[] list = new String[] { this.name };
                String[][] list2 = new String[][] { list };
                String[][][] list3 = new String[][][] { list2 };
                list3 = new String[10][nestedArrDimention][secNestedArrDimention];

            } else {
                System.out.println("Enter a dimention > 4");
            }

        } else if (dataType.getClass().getSimpleName() == "double") {

            if (this.getDimention() == 1) {

                String[] list2 = new String[] { this.name };
                list2 = new String[this.size];

            } else if (this.getDimention() == 2) {

                System.out.println("Tell me the nested arrays length:");
                int nestedArrDimention = scanrRefVar.nextInt();

                String[] list = new String[] { this.name };
                String[][] list2 = new String[][] { list };
                list2 = new String[this.size][nestedArrDimention];

            } else if (this.getDimention() == 3) {

                System.out.printf("\nTell me the 1st nested arrays length:");
                int nestedArrDimention = scanrRefVar.nextInt();

                System.out.printf("\nTell me the 1st nested arrays length:");
                int secNestedArrDimention = scanrRefVar.nextInt();

                String[] list = new String[] { this.name };
                String[][] list2 = new String[][] { list };
                String[][][] list3 = new String[][][] { list2 };
                list3 = new String[10][nestedArrDimention][secNestedArrDimention];

            } else {
                System.out.println("Enter a dimention > 4");
            }

        } else if (dataType.getClass().getSimpleName() == "float") {

            if (this.getDimention() == 1) {

                String[] list2 = new String[] { this.name };
                list2 = new String[this.size];

            } else if (this.getDimention() == 2) {

                System.out.println("Tell me the nested arrays length:");
                int nestedArrDimention = scanrRefVar.nextInt();

                String[] list = new String[] { this.name };
                String[][] list2 = new String[][] { list };
                list2 = new String[this.size][nestedArrDimention];

            } else if (this.getDimention() == 3) {

                System.out.printf("\nTell me the 1st nested arrays length:");
                int nestedArrDimention = scanrRefVar.nextInt();

                System.out.printf("\nTell me the 1st nested arrays length:");
                int secNestedArrDimention = scanrRefVar.nextInt();

                String[] list = new String[] { this.name };
                String[][] list2 = new String[][] { list };
                String[][][] list3 = new String[][][] { list2 };
                list3 = new String[10][nestedArrDimention][secNestedArrDimention];

            } else {
                System.out.println("Enter a dimention > 4");
            }
        }
        return ;
    }

    int[] autoSize() {

        int newSize = (this.size + (this.size / 2)) + 1;

        int[] newArray = new int[newSize];

        if ( this.getDimention() == 1) { 

            int[] list = new int[] {2,3,4};
            
            int j = 0;
            for (int i : list) {

                newArray[j] = i;

                j++;
            }
        }
        return newArray;
    } // auto size end;

    @Override
    public String toString() {
        // return this.getClass().getName() + "@" + Integer.toHexString(hashCode());
        return this.getClass().getName() + "is the name, and the size is:" + this.size;
    }

}
