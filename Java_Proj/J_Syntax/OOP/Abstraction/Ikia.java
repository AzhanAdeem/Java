// This is the main abstract class

abstract class Ikia extends Object {

    // Used to hide the implementation details from the user or I would say the
    // developer;
    // can't be instantiated directly
    // Concrete methods (inherited) and abstract methods (implemeted)

    Ikia() {
        super();
    }

    abstract float price( );
}