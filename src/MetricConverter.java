import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double meters, miles, feet, inches;

        System.out.println("Enter the measurement in meters:");
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid measurement in meters:");
            scanner.next(); //
        }
        meters = scanner.nextDouble();

        miles = meters * 0.000621371;
        feet = meters * 3.28084;
        inches = meters * 39.3701;
        System.out.println("Measurement in miles: " + miles);
        System.out.println("Measurement in feet: " + feet);
        System.out.println("Measurement in inches: " + inches);
    }
}
