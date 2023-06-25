import java.util.Scanner;

public class MetricConversion
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double meters;

        do
        {
            System.out.println("Enter a measurement in meters: ");
            meters = scanner.nextDouble();

            if (meters <= 0) {
                System.out.println("Please enter a positive measurement.");
            } else {
                break;
            }
        }
        while (true);

        double miles = meters / 1609.344;
        double feet = meters * 3.28084;
        double inches = meters * 39.3701;

        System.out.println("The measurement in miles is: " + miles);
        System.out.println("The measurement in feet is: " + feet);
        System.out.println("The measurement in inches is: " + inches);
    }
}
