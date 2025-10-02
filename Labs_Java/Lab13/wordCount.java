
// A program that takes a string as a sentence;
// and print how many times each word appears in the list;

public class wordCount {

    private String sente;
    int wordCount = 0;
    String[] wordList = new String[10];
    String[][] wordSet = new String[10][2];

    public wordCount(String inputSen) {
        this.setStr(inputSen);
    }

    void setStr(String inp) {
        this.sente = inp;
    }

    // Method for splitting
    String[] split() {
        wordList = this.sente.split("\\s+"); // regularExpression
        return wordList;
    }

    // Method to count words;
    void count(String[] wordList) {

        // Nested loops to itterate through the array and the words to compare;

        for (String word1 : wordList) { // Take one word from the list;
            for (String word2 : wordList) { // Take a word to compare with;

                if (word1.length() == word2.length()) {

                    if (word1 == word2) {
                        wordCount++;
                    }

                    System.out.printf("The total num of times word %s came is %d\t\n", word1, wordCount);

                    // If you want to be really accurate;

                    for (int k = 0; k < word1.length(); ++k) {

                        // Created a char array to loop through the string or use charAt(index);
                        char[] charArray1 = word1.toCharArray();
                        char[] charArray2 = word2.toCharArray();

                        // { k == word1.length()-1 && } used earlier to ensure the length was reached;

                        boolean[] areAllEqualArr = new boolean[word1.length()];
                        int charEqualityCount = 0;

                        if (charArray1[k] == charArray2[k]) {
                            charEqualityCount++;
                            areAllEqualArr[k] = true;
    
                        }
                        if (charEqualityCount == word1.length() && areAllEqualArr.length == word1.length()) {
                            wordCount++;
                        }
                        System.out.printf("The total num of times word %s came is %d", word1, wordCount);
                    }

                } else {

                    for (int k = 0; k < word1.length(); ++k) {

                        // Created a char array to loop through the string or use charAt(index);
                        char[] charArray1 = word1.toCharArray();
                        char[] charArray2 = word2.toCharArray();
                        int numOfCharEqul = 0;
                        // { k == word1.length()-1 && } used earlier to ensure the length was reached;
                        if (charArray1[k] == charArray2[k]) {
                            numOfCharEqul++;
                        }
                        if (numOfCharEqul == word1.length()) {
                            wordCount++;
                        }

                        System.out.printf(
                                "\nThe words %s & %s are not completely identical but are similiar till: %d \n", word1,
                                word2, word1.length());
                        // System.out.printf("The total num of times word %s came is %d \n", word1,
                        // wordCount);

                    }// End of for loop in else;
                }// End of else if word not equalin length check;
            } // End 2nd for; 

            this.append( word1, wordCount);

        }// End of 1st for;
    }

    // Method for word appending / setting in the array;
    void append(String word, int count) {

        // int i = 0;
        for (int i = 0; i < wordSet.length; ++i) {
            for (int j = 0; j < wordSet[0].length; j++) {
                wordSet[0][0] = word;
                wordSet[0][1] = String.valueOf(count);
            }
        }
    }

    @Override
    public String toString() {

        for ( String[] x: wordSet ) {
            System.out.println(x);
        }

        return "**** **** **** This is the word count **** **** **** \nThe sentence you Entered:"+sente;
    }

}