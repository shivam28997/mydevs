package interfaces;

public interface Flyable {

    void fly();

    default void doNotFly() {
        System.out.println("Can not fly");
    }

}
