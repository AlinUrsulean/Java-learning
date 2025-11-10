import java.util.ArrayList;
public class Garage {

    ArrayList<Car> cars = new ArrayList<>();
    void addCar(Car car) {
        cars.add(car);
        System.out.println(car.brand + " " + car.model + " adăugată în garajul nostru de masini scumpe.");
    }

    void showAllCars() {
        System.out.println("\n--- Mașinle din garaj ---");
        for (Car car : cars) {
            System.out.println(car.brand + " " + car.model + " (" + car.speed + " km/h)");
        }
    }

    void startAll() {
        System.out.println("\nPornim toate mașinile la drum spre bucovina!");
        for (Car car : cars) {
            car.start();
        }
    }
}
