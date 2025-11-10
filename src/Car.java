public class Car {
    String brand;
    String model;
    String color;
    int speed;
    int year;

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
