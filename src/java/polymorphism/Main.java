package polymorphism;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Mammals();   // It is possible because Mammals is the instance of Animal class
        Animal a3 = new Dog();       // reference is type of Animal but object saved in the memory is
                                     // Mammals or Dog here

        a1.print();   // print() will be invoked from Animal class

        // even though the below called methods are from the Mammal and Dog class
        // but if you ctrl+click to the method it will take you to the
        // method from Animal class

        // So at compile time are only able to judge or only will be able to index on the basis
        // of the object
        a2.print();   // print() will be invoked from Mammal class
        a3.print();   // print() will be invoked from Dog class

        // but suppose if print() method is not present in the Dog class
        // will it be able to call the method ?
        // yes it will be
        // as the class Derived from Mammal has the print() method
        // so this time if the Dog does not override the method then
        // the method will be invoked from the parent class


        //a3.printDog();

        // So here as c method is not present in the Animal class
        // and we are type casting the Animal object int o Dog Class
        // so we will not be able to call the printDog() for a3

        ((Dog) a3).printDog();  // now by doing this it will work


        // Let's try one more thing
        // Dog extends Mammal and Mammal extends Animal
        // Would I be able to call a method from the Animal class
        // the method print() but this method will not be in Dog and Mammal

        a3.print();
        // this scenario will also work as Animal has the print() method
    }
}
