//package OOP.Inheritance;

public class Shelf extends Library {

    static  int    shelfNumber = 0;
    private int    genreIndex  = 0;
    private String genre;

    public Shelf (int totalBooks, int totalShelfs, String genre) {
        super(totalBooks, totalShelfs); // keyword; calls parent and initialize attribute; 
                                      // the parameters of the constructor are passed
        this.genre = genre;
        shelfNumber++;
    }
    
    // subclass method given presedence over parent method; 
    //  @Xyz is a java annotation (footnote);  Provides a system of checks and balances like in method naming;
    // reausibility and specific implementation;
    @Override 
    public String toString () {
        return "\t"+this.totalBooks+"\t"+this.totalShelfs;
    }

    public int getGenreIndex() {
        return genreIndex;
    }

    public int getTotalBooks () {
        return this.totalBooks;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre () {
        return genre;
    }

}