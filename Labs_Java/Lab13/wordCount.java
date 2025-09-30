
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

    //Method for splitting
    void split() {
        wordList = this.sente.split("\\s+");
    }

    // Method to count words;
    void count(String[] wordList) {

        //Nested loops to itterate through the array and the words to compare;

        for (String word1 : wordList) { 
            for (String word2 : wordList) {

                int wordlen = word1.length();
                for (int k = 0; k < wordlen ; ++k) {
                    // Created a char array to loop through the string or use charAt(index);
                    char[] charArray1 = word1.toCharArray();
                    char[] charArray2 = word2.toCharArray();

                    // { k == word1.length()-1 && }  used earlier to ensure the length was reached; 
                    if (  charArray1[k] == charArray2[k]) {
                        wordCount++;                           
                    }
                    System.out.printf("The total num of times word %s came is %d", word1, wordCount);
                }
            }
        }
    }

    //Method for word appending setting in the array;
    void append(String word, int count) {

        //int i = 0;
        for ( int i = 0 ; i < wordSet.length; ++i) { 
            for (int j = 0; j < wordSet[0].length; j++ ) {    
                wordSet[0][0] = word;
                wordSet[0][1] = String.valueOf(count);
            }
        }
    }


}