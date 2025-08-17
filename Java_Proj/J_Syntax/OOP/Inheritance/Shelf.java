package OOP.Inheritance;

public class Shelf extends library {

    static int shelfNumber = 0;
    private int genreIndex = 0;
    private String genre;

    public Shelf (int xys, int xgs, int totalBooks) {
        super(xys, xgs);
        this.genreIndex = totalBooks;
        shelfNumber++;
    }
    
    public int getgenreInex() {
        return genreIndex;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getgenre () {
        return genre;
    }

    @Override
    public String toString () {

        return "\t"+this.totalBooks+"\t"+this.totalShelfs;
    }


}
