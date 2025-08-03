public class Patterns {
    public static void main(String[] args){

        //========================          Patterns        =================================
        //Note: while's logic is easier than for;

        //Triangle Upwards;
        short i;                  // short < int < long
        for (i = 0; i <= 4 ; i++) { // 0 -> 4 = 5 lines
            for (short j = 0; j <= i ; j++) System.out.printf("*"); //Print "*" stars, till the condition stands true;
                System.out.println("");  // To change the line
        }
        
        // Downward's Triangle;

        System.out.println("");     // Remove this and the trianges will combine;
        short h = 0;
        while( h < 6 ){     // h max 5; 6 lines;
            short l = 5;    // l will work till 1;
            while(l > h) {  // l will loop till 4; It will start with {5 > 0 = T}; 1st line will have 5 stars {0 - 4} T;
                System.out.printf("*"); 
                l--;        //Decrement from 5 - 0; l will become 0;
            }
            System.out.println(); 
            h++;
        }


        //Double triangle;
        short j = 0;
        while(j < 6){                       // j max 5 lines 6;
            short k = 0;                           
            while(k <= j ) {             // k max 5; last line will have 6 stars (0-5);
                System.out.printf("*"); 
                ++k;                       // Increment from 0 - 5; k will become 5; 6 but condition stands false;
            }
            System.out.println("");
            ++j;
        }

        short h2 = 0;
        while( h2 < 6 ){             // h max 5;
            short l = 5;             // l will work till 1;
            while(l > h2) {          // l will loop till 4; It will start with {5 > 0 = T}; 1st line will have 5 stars (0 - 4);
                System.out.printf("*"); 
                l--;                 //Decrement from 5 - 0; l will become 0;
            }
            System.out.println("");
            h2++;
        }
        
        int tRow = 5;
        int t3 = 0;     
        while ( t3 <= tRow) {      // tRow'th lines; 6 lines;

            int t4 = 0;
            while( t4 < (tRow - t3)){   // Skip TotalRow - t3 = spaces to skip; t3 fixed till loop ends
                System.out.print(" ");
                t4++;
            }
            t4 = 0;
            while( t4 <= t3){             // last line 6 stars; Till t4 becomes <= t3. We will get the stars printed; 
                System.out.print("* "); // The space here helps make it a Isosceles tri/ Pyramid;
                t4++;
            }

            System.out.println();
            t3++;
        }
    }
}

//char star = '*';
                // if  ( t3 == 0 & t4 == 0) {
                //     System.out.printf("%10c", star);

                // } else if ( t3 == 1 & t4 == 0) {
                //     System.out.printf("%8c", star);

                // } else if ( t3 == 2 & t4 == 0) {
                //     System.out.printf("%6c", star);

                // } else if ( t3 == 3 & t4 == 0) {
                //     System.out.printf("%4c", star);

                // }else if ( t3 == 4 & t4 == 0) {
                //     System.out.printf("%2c", star);

                // }else {
                //     System.out.printf("%c", star);
                // }
