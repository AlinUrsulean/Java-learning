//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Car car1 = new Car();
        car1.brand = "Batmobile";
        car1.model =  "x3";
        car1.color = "Darkblue";
        car1.speed = 3300;
        car1.year = 1999;

        car1.start();
        car1.accelerate(100);
        car1.stop();

        Car car2 = new Car();

        car2.model = "Nxcar";
        car2.speed = 500;


        car2.start();
        car2.accelerate(10);
        car2.stop();

    }
}
