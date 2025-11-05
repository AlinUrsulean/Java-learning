import java.util.Scanner;

public class TemperatureConvertor {
        public static void main(String[] args)  {
            Scanner scanner =  new Scanner(System.in);
            System.out.println("Enter temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = fahrenheit - 32;
            System.out.println(celsius);
        }
    }