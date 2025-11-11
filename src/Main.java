//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
//        Garage garage = new Garage();
//        Car car1 = new Car("Batmobiel","black"  );
////        car1.brand = "Batmobile";
////        car1.model =  "x3";
////        car1.color = "Darkblue";
////        car1.speed = 3300;
////        car1.year = 1999;
//        car1.start();
//        car1.accelerate(100);
//        car1.stop();
//        Car car2 = new Car("helper","this is greate ");
////        car2.model = "Nxcar";
////        car2.speed = 500;
//        car2.start();
//        car2.accelerate(10);
//        car2.stop();
//
//
//        garage.addCar(car1);
//        garage.addCar(car2);
//
//        garage.showAllCars();
//        garage.startAll();

//        Company company = new Company();
//
//        Manager manager = new Manager("Ana",20, 9000, 5 );
//        Developer dev1 = new Developer("Mihai",20, 7000, "Java");
//        Developer dev2 = new Developer("Elena",19, 7500, "Python");
//
//        company.addEmployee(manager);
//        company.addEmployee(dev1);
//        company.addEmployee(dev2);
//
//        company.showAllEmployees();
//        company.startWorkDay();




//        Animal a1 = new Dog();
//        Animal a2 = new Cat();
//        Animal a3 = new Animal();
//
//        a3.makeSound();
//        a1.makeSound();
//        a2.makeSound();



        PaymentProcessor processor = new PaymentProcessor();

        Payment card = new CardPayment("1234567890123456");
        Payment paypal = new PaypalPayment("user@example.com");
        Payment crypto = new CryptoPayment("0xAB12CD34EF56");

        processor.addPaymentMethod(card);
        processor.addPaymentMethod(paypal);
        processor.addPaymentMethod(crypto);

        processor.processAll(500.0);


    }
}
