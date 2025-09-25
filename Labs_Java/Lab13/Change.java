
// this code provides you with the change of the amont entered

public class Change {

    float amount;
    float totalBills;

    int[] listOfBills = { 5000, 1000, 500, 100, 50, 20, 10, 5, 2, 1 };

    int totalFivThou;
    int totalThou;
    int totalHund;
    int totalFift;
    int totalTwenty;
    int totalTen;
    int totalFiv;
    int totalTwo;
    int totalOne;
    int totalFivHund;

    Change() {
    }

    Change(float amount) {

        super();
        this.setAmount(amount);
    }

    void setAmount(float amount) {
        this.amount = amount;
    }

    void makeChange() {

        float quanti = this.amount;

        while (quanti > 0) {

            if (quanti >= listOfBills[0]) {

                totalFivThou++;
                quanti -= listOfBills[0];

            } else if (quanti >= listOfBills[1]) {

                totalThou++;
                quanti -= listOfBills[1];

            } else if (quanti >= listOfBills[2]) {

                totalFivHund++;
                quanti -= listOfBills[2];

            } else if (quanti >= listOfBills[3]) {

                totalTwenty++;
                quanti -= listOfBills[3];

            } else if (quanti >= listOfBills[4]) {

                totalTen++;
                quanti -= listOfBills[4];

            } else if (quanti >= listOfBills[5]) {

                totalFiv++;
                quanti -= listOfBills[5];

            } else if (quanti >= listOfBills[6]) {

                totalTwo++;
                quanti -= listOfBills[6];

            } else if (quanti >= listOfBills[7]) {

                totalOne++;
                quanti -= listOfBills[7];

            } else {

                System.out.printf("\n ");
                break;

            }
        }

        return;
    }

    void returnChange(){

        System.out.println("---------------------- The Change -------------------\n");

        System.out.printf("\nTotal Five Thousand Bills: %d ", totalFivThou);
        System.out.printf("\nTotal Thousand Bills: %d", totalThou);
        System.out.printf("\nTotal Hundred  Bills: %d", totalHund);
        System.out.printf("\nTotal Twenty   Bills: %d", totalTwenty);
        System.out.printf("\nTotal Ten      Bills: %d", totalTen);
        System.out.printf("\nTotal Five     Coins: %d", totalFiv);
        System.out.printf("\nTotal Two      Coins: %d", totalTwo);
        System.out.printf("\nTotal One      Coins: %d\n", totalOne);

        System.out.println( "\n--------------------   Empty    ----------------------------"); 

    }

}
