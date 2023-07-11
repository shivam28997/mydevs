package interfaces;

import java.util.List;

public class Main {
    public static void main(String[] args) {
       RedBird bird = new RedBird();
       Rocket rocket = new Rocket();

       bird.fly();
       rocket.doNotFly();
       rocket.fly();
       bird.doNotFly();

       printFly(List.of(bird, rocket));
    }

    public static void printFly(List<Flyable> flyables ) {
        for (Flyable flyable: flyables) {
            flyable.fly();
        }
    }
}
