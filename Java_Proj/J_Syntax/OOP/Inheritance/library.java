package OOP.Inheritance;

public class library {

    int totalBooks, totalShelfs;
    String[] genre;
    

    public library (int tB, int slf) {
        
        this.totalBooks = tB;
        this.totalShelfs = slf;

    }

    @Override
    public String toString( ){

        return this.totalBooks +"\t"+ this.totalShelfs;
    }
    
}
