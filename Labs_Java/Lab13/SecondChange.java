public // This code provides you with the change of the amount entered

public class SecondChange {

    float amount;
    float totalBills;

    // Currency denominations array
    int[] listOfBills = { 5000, 1000, 500, 100, 50, 20, 10, 5, 2, 1 };

    // Counters for each denomination
    int totalFivThou;    // 5000
    int totalThou;       // 1000
    int totalFivHund;    // 500  
    int totalHund;       // 100
    int totalFift;       // 50
    int totalTwenty;     // 20
    int totalTen;        // 10
    int totalFiv;        // 5
    int totalTwo;        // 2
    int totalOne;        // 1

    // Default constructor
    SecondChange () { 
        super();
    }

    // Parameterized constructor - FIXED THE BUG HERE
    SecondChange (float amont) {            
        super();
        this.setAmount(amont); // Fixed: was 'amount' not 'amont'
    }

    // Setter method
    void setAmount(float amount) {
        this.amount = amount;
    }

    // Method to calculate change breakdown
    void makeChange() {
        float quanti = this.amount;

        System.out.println("Processing amount: " + quanti); // Debug line

        while (quanti > 0) {
            
            if (quanti >= listOfBills[0]) { // 5000
                totalFivThou++;
                quanti -= listOfBills[0];
                
            } else if (quanti >= listOfBills[1]) { // 1000
                totalThou++;
                quanti -= listOfBills[1];
                
            } else if (quanti >= listOfBills[2]) { // 500
                totalFivHund++; // FIXED: This should increment totalFivHund, not totalHund
                quanti -= listOfBills[2];
                
            } else if (quanti >= listOfBills[3]) { // 100
                totalHund++; // FIXED: This was mapped to totalTwenty incorrectly
                quanti -= listOfBills[3];
                
            } else if (quanti >= listOfBills[4]) { // 50
                totalFift++; // FIXED: This was mapped to totalTen incorrectly
                quanti -= listOfBills[4];
                
            } else if (quanti >= listOfBills[5]) { // 20
                totalTwenty++; // FIXED: This was mapped to totalFiv incorrectly
                quanti -= listOfBills[5];
                
            } else if (quanti >= listOfBills[6]) { // 10
                totalTen++; // FIXED: This was mapped to totalTwo incorrectly
                quanti -= listOfBills[6];
                
            } else if (quanti >= listOfBills[7]) { // 5
                totalFiv++; // FIXED: This was mapped to totalOne incorrectly
                quanti -= listOfBills[7];
                
            } else if (quanti >= listOfBills[8]) { // 2 - ADDED THIS MISSING CONDITION
                totalTwo++;
                quanti -= listOfBills[8];
                
            } else if (quanti >= listOfBills[9]) { // 1 - ADDED THIS MISSING CONDITION
                totalOne++;
                quanti -= listOfBills[9];
                
            } else {
                System.out.printf("\nRemaining amount less than 1: %.2f\n", quanti);
                break;
            }
        }
        
        return;
    }

    // Method to display the change breakdown
    void returnChange() {
        System.out.println("---------------------- The Change -------------------\n");

        System.out.printf("Total Five Thousand Bills: %d\n", totalFivThou);
        System.out.printf("Total Thousand Bills: %d\n", totalThou);
        System.out.printf("Total Five Hundred Bills: %d\n", totalFivHund); // FIXED: Added this line
        System.out.printf("Total Hundred Bills: %d\n", totalHund);
        System.out.printf("Total Fifty Bills: %d\n", totalFift); // FIXED: Added this line
        System.out.printf("Total Twenty Bills: %d\n", totalTwenty);
        System.out.printf("Total Ten Bills: %d\n", totalTen);
        System.out.printf("Total Five Coins: %d\n", totalFiv);
        System.out.printf("Total Two Coins: %d\n", totalTwo);
        System.out.printf("Total One Coins: %d\n", totalOne);
        
        // Calculate total number of bills/coins
        int totalItems = totalFivThou + totalThou + totalFivHund + totalHund + 
                        totalFift + totalTwenty + totalTen + totalFiv + totalTwo + totalOne;
        System.out.printf("Total Bills and Coins: %d\n", totalItems);
        
        System.out.println("\n--------------------   Complete    ----------------------------"); 
    }
} 