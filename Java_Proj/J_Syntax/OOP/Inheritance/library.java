package OOP.Inheritance;

public class library {

    int totalBooks, totalShelfs;
    String[] genre = {"Crime", "Comedy", "Drama", "Fiance", "History"};
    

    public library (int totalBooks, int totalShelfs) {

        this.totalBooks = totalBooks;
        this.totalShelfs = totalShelfs;

    }

    @Override
    public String toString( ){

        return this.totalBooks +"\t"+ this.totalShelfs;
    }
    
}
