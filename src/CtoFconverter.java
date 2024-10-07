import java.util.Scanner;

public class CtoFconverter
{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double celsius;
    double tempTest;

    do {
        System.out.print("What is the temperature in Celcius ?");
        while (!scanner.hasNextDouble()) {
            System.out.println(" Invalid Input. Please enter a number.");
            scanner.next();
            System.out.print("What is the temperature in Celcius ?");

        }
        celsius = scanner.nextDouble();
    }while(false);

        double fahrenheit= (celsius*9/5)+32;
        System.out.println("The temperature in Fahrenheit is " + fahrenheit+" degrees.");
//tests

    }
}


