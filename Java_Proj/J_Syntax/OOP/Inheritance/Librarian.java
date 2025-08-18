package OOP.Inheritance;

public abstract class Librarian extends Member{

    String name;

    abstract Librarian(String name)
    {
        this.name = name;
    }
}