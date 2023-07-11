package polymorphism;

public class Dog extends Mammals{

    Dog() {
        this.a = 15;
    }

    @Override
    void print() {
        System.out.println("DHAMAKAA!");
        super.print();   // we are calling the constructor of the parent class by using super keyword
        // and here the print() method will be invoked from the parent class of the current class

        System.out.println("Printing from class Dog: " + a);
    }

    void printDog() {
        System.out.println("Printing from class Dog: " + a);
    }
}
