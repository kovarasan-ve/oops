// Program Title: Class "Car" with Methods
// Aim: To define a class Car with attributes like model, color and methods to start and stop the car.

class Car {
    // Attributes
    String model;
    String color;

    // Constructor
    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    // Method to start the car
    void start() {
        if (model == null || model.isEmpty()) {
            System.out.println("Car started (but model not shown)");
        } else {
            System.out.println("Car " + model + " (" + color + ") started");
        }
    }

    // Method to stop the car
    void stop() {
        System.out.println("Car stopped");
    }
}

public class Main {
    public static void main(String[] args) {
        // Test Case 1
        Car c1 = new Car("Tesla", "Red");
        c1.start();   // Output: Car Tesla (Red) started

        // Test Case 2
        Car c2 = new Car("BMW", "Black");
        c2.start();   // Output: Car BMW (Black) started

        // Test Case 3
        Car c3 = new Car("", "White");
        c3.start();   // Output: Car started (but model not shown)

        // Test Case 4
        Car c4 = new Car("Audi", "Blue");
        // Not calling start() → Output: Nothing

        // Test Case 5
        Car c5 = new Car("Kia", "Grey");
        c5.stop();    // Output: Car stopped
    }
}