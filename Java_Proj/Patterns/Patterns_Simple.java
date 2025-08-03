

public class Patterns_Simple {
    public static void main(String[] var0) {

        // Upward tri;
       short var2;
       for(short var1 = 0; var1 <= 4; ++var1) {  //0 -> 4                               0     for num of lines; Total 4 lines
          for(var2 = 0; var2 <= var1; ++var2) {  //var2(0,1,2,3,4) <= var1(0,1,2,3,4)   0 1   for num of stars per line;
             System.out.printf("*");      //                                     0 1 2
          }
          System.out.println();
       }

       System.out.println("");

       //Downward tri;
       short var3;
       for(var2 = 0; var2 < 6; ++var2) {       // Total 6 lines;
          for(var3 = 5; var3 > var2; --var3) { // 1st iteration 5 stars
             System.out.printf("*");
          }
 
          System.out.println();
       }
 
       //Both up and downward tri;
       short var4;
       for(var3 = 0; var3 < 6; ++var3) {        // max lines 6 (0 - 5), ++i but 0 is starting;
          for(var4 = 0; var4 <= var3; ++var4) { // Last line will have 5 stars as =;  
            System.out.printf("*");
          }
 
          System.out.println("");
       }
 
       for(var4 = 0; var4 < 6; ++var4) {             // lines 6 9 0 - 5)
          for(short var5 = 5; var5 > var4; --var5) { // (0 - 4) 5x; fist line will have 5 stars
             System.out.printf("*");
          }
 
          System.out.println("");
       }
 
    }
 }