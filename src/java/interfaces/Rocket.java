package interfaces;

public class Rocket implements Flyable{

    @Override
    public void fly() {
        System.out.println("Rocker Flies");
    }

    @Override
    public void doNotFly() {
        System.out.println("Implemented in Rocket");
    }
}
