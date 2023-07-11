package interfaces;

// Class 'RedBird' must either be declared abstract or
// implement abstract method 'fly()' in 'Flyable'

public class RedBird implements Flyable{

    @Override
    public void fly() {
        System.out.println("Bird flies");
    }

    @Override
    public void doNotFly() {
        System.out.println("Implemented in RedBird");
    }
}
