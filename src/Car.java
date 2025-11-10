public class Car {
    String brand;
    String model;
    int speed;


    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.speed = 0;
    }

    void start() {
        System.out.println(brand + " " + model + " a pornit!");
    }

    void accelerate(int amount) {
        speed += amount;
        System.out.println(brand + " " + model + " accelerează la " + speed + " km/h");
    }

    void stop() {
        speed = 0;
        System.out.println(brand + " " + model + " s-a oprit.");
    }
}
