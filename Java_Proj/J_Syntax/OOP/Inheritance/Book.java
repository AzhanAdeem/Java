//package OOP.Inheritance;

public class Book extends Shelf{

    int pages;
    String author;

    public Book ( int pages, String author) {
        super(23,23 ,author);
        this.pages = pages;
        this.author = author;
    }
    
}
