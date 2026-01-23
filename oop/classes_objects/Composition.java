

public class Composition {

    public static void main(String[] args) {

        // Composition = "has-a" relationship
        Car car = new Car();
        car.start();
    }
}

// Engine is a separate class
class Engine {

    public void start() {
        System.out.println("Engine started");
    }
}

// Car HAS an Engine → composition
class Car {

    // final → engine cannot be replaced
    private final Engine engine = new Engine();

    public void start() {
        // Delegates the responsibility to Engine
        engine.start();
    }
}
