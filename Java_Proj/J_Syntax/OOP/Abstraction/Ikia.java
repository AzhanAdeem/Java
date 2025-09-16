// This is the main abstract class
// Abstract classes are security. As now the user will not be able to create a object of this class.

abstract class Ikia extends Object {

    // Used to hide the implementation details from the user or I would say the
    // developer;
    // can't be instantiated directly
    // Concrete methods (inherited) and abstract methods (implemeted);
    // Concrete methods are defined and inherited in the parent class;

    Ikia() {
        super();
    }

    // Abstract method that you have to "@Override";
    // and it is a must to use it even if the object does't use it  
    abstract String price( );
}