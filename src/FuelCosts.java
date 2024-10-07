import java.util.Scanner;

public class FuelCosts
{
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    double gasGallons;
    double mpG;
    double priceperG;

    do {
        System.out.println("How many gallons of gas are in the car?");
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid. Please enter a number.");
            scanner.next();
            System.out.println("How many gallons of gas are in the car?");
        }
        gasGallons = scanner.nextDouble();
    } while (gasGallons <= 0);

    do {
        System.out.println("What is the fuel efficiency in miles per gallon?");
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid. Please enter a number.");
            scanner.next();
            System.out.println();
            System.out.println("What is the fuel efficiency in miles per gallon?");
        }
        mpG = scanner.nextDouble();
    } while (mpG <= 0);


    do {
        System.out.println("What is the price per gallon?");
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid. Please enter a number.");
            scanner.next();
            System.out.println();
            System.out.println("What is the price per gallon?");
        }
        priceperG = scanner.nextDouble();
    } while (priceperG <= 0);

    double hundredmileDrive=(100/mpG)*priceperG;
    System.out.println("The cost to drive 100 miles is $"+hundredmileDrive);

    double fulltankDrive = gasGallons*mpG;
    System.out.println("The car can travel "+fulltankDrive+" miles with a full tank off gas!");


}

    }


