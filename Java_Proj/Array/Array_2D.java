// import java.util.*;
// import java.util.Arrays;

public class Array_2D {
    public static void main(String[] args) {
        
        //int[][] matRan = {{2,4,5,7},{7,5,3,2},{3,4,5,6}};
        //System.out.println(matRan[2].length);
         
        // long[][] mat1 = new long[3][3];// 3 x 3 matrix  or an array with 3 sub arrays and each sub-array has 3 elements; 
        // long[][] mat2 = new long[3][3];// [[1,2,3],[1,2,3],[1,2,3]]
        // long[][] mat3 = new long[3][3];// Java Syntax: {{1,2,3},{4,5,6},{7,8,9}} 

        // Scanner obj = new Scanner(System.in);
        
        // // These methods work;
        // System.out.println("The length of matrix is: "+mat1.length);
        // System.out.println("The length of child matrix is: "+mat1[0].length);

        // System.out.printf("Enter the elements of the matrix:\n");
        
        // //for loops to take user input in the Matrix.;
        // int i; // To make i global
        // for (i = 0; i <= (mat1.length-1); i++) { // for(String x: mat1){  }
            
        //     //System.out.printf("Enter the elements of the matrix:"); //Printed again and again;

        //     //Loop for the elements of child matrices;
        //     int j; // Local var;
        //     for (j = 0; j <= (mat1[i].length-1); j++) { // Even if I pass it mat1[0] it is correct
        //         System.out.printf("Enter the mat1[%d][%d] elements of the matrix:", i,j);
        //         mat1[i][j] = obj.nextInt();
        //     }
        // }

        // System.out.printf("\nEnter the elements of the 2nd matrix:\n");
        // for (i = 0; i <= (mat1.length-1); i++) {

        //     //Loop for child matrix
        //     int j;
        //     for (j = 0; j <= (mat1[0].length-1); j++) {
        //         System.out.printf("Enter the mat2[%d][%d] elements of the 2nd matrix:", i,j);
        //         mat2[i][j] = obj.nextInt();
        //     }
        // }

        // // ===========================================  Matirx Subtraction ==========================================================

        // for(i = 0; i <= (mat1.length-1); i++) {
        //     int j; // Local var;
        //     for(j = 0; j <= (mat1[0].length - 1); j++){ // | for (i = 0; i < mat1.length; j++) | for (int j: mat1[i]){}
        //          mat3[i][j] = mat1[i][j] + mat2[i][j];
        //     }
        // }


        // System.out.println("\nThe result of matrix addition is:");

        // for(i = 0; i <= (mat1.length-1); i++) {
        //     int j; // Local var;
        //     for(j = 0; j <= (mat1[0].length - 1); j++){

        //         // if ( i == 0) {// i == 1 means a new row or a new array has started;
        //         //     if (j == 0 ) System.out.printf("\n"); // j == 0 means the first element of the array;
        //         //     System.out.printf("%5d", mat3[i][j]);

        //         // } else if ( i == 1) { 
        //         //     if ( j == 0 ) System.out.printf("\n");
        //         //     System.out.printf("%5d", mat3[i][j]);

        //         // } else {
        //         //     if (j == 0 ) System.out.printf("\n");
        //         //     System.out.printf("%5d", mat3[i][j]);
        //         // }
        //             if ( j == 0) System.out.println(""); // When we enter the first column / element of the nested array.
        //             System.out.printf("%5d", mat3[i][j]);
        //     }
        // }
        // //System.out.printf("The result is: %d",mat3[i][j]);
        // //When I typed this:{ System.out.print("The result is"+ mat3);}
        // //Terminal printed:{ The result is[[J@6acbcfc0  };  // This is an object address

        // // ================================================     Matrix Subtraction    ======================================================  
        
        // for(i = 0; i <= (mat1.length-1); i++) {
        //     int j; // Local var;
        //     for(j = 0; j <= (mat1[0].length - 1); j++){
        //          mat3[i][j] = mat1[i][j] - mat2[i][j];
        //     }
        // }

        // System.out.println("\nThe result of matrix Subtraction is:");

        // for(i = 0; i <= (mat1.length-1); i++) {
        //     int j; // Local var;
        //     for(j = 0; j <= (mat1[0].length - 1); j++){

        //         if ( j == 0) System.out.printf("\n");
        //         System.out.printf("%5d",mat3[i][j]);
        //     }
        // }
        
     //=========================================== Martic Mltiplucation =================================
    
//      int[][] matMulti1 = new int[2][4];
//      int[][] matMulti2 = new int[4][3];
//      // ans will have []

//      int i; //Glo
//      for (i = 0; i < matMulti1.length; i++) {
//         for (int j = 0 ; j < matMulti1[i].length; j++){
//             System.out.printf("Enter the elemnt of the Matrix: ");
//             matMulti1[i][j] = obj.nextInt();
//         }
//      }
    
//      for(int row = 0; row<matMulti2.length;row++){
//         for(int col = 0 ; col < matMulti2[row].length; col++){
//             System.out.printf("Enter the elements of the 2nd Mat:");
//             matMulti2[row][col] = obj.nextInt();
//         }
//      }

//      //Using for each for the matrix Multi;

//      System.out.println("Element of 1st mat:");
//      for (int[] row : matMulti1) { 
//         for (int ele: row) { // for each;
//             //int arrayEle = matMulti1[i].indexOf(j).valueOf;  //indexOf() only for Strings;
//             //if ( matMulti1[i].indexOf(j) == 0 ){ System.out.printf("\n");}
//             System.out.printf("%6d", ele);
//         } 
//         System.out.println(); //for new line on every row change;;
//      }
//      //                  Mat multi rule;
//      //            [2][3] = [3][5] and ans will be [2][5];


//      // Mat3 mutiplier loop;
//      int[][] matMulti3 = new int[2][3];
//      for(int row3 = 0; row3 < matMulti3.length;row3++){
//         for(int col3 = 0;col3 < matMulti3[row3].length;col3++){

//            // 77 rule: [1st row][1 col] * [1st col][1 row], [1st row][2nd col] * [1 col][2 row], [1 row][3 col]*[3 row][1 col];
//            //          index of mat1[row] = index of mat2[col];

//           matMulti3[row3][col3] = matMulti1[row3][col3] * matMulti2[col3][row3]; //col will change rapidly so we swap;
//         }
//     }
    
//     System.out.println("The output mat3 is:");
//     for (int[] row : matMulti3) { 
//         for (int ele: row) { 
//             System.out.printf("%6d", ele);
//         } 
//         System.out.println();
//     }
        
    }
}