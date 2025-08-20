public class Car {
    private String model;
    private String colour;

    public Car(String model, String colour) {
        this.model = model;
        this.colour = colour;
    }

    public void start() {
        System.out.println(model + " in " + colour + " colour is starting.");
    }
   
    public void stop() {
        System.out.println(model + " in " + colour + " colour is stopping.");
    }

   
    public static void main(String[] args) {
        Car myCar = new Car("Lamborghini", " Mat Black");
        myCar.start();
        myCar.stop();
    }
}
