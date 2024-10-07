import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width;
        double height;

      do {
          System.out.println("Enter rectangle width.");
          while (!scanner.hasNextDouble()) {
              System.out.println("Invalid. Please enter a positive number.");
              scanner.next();
              System.out.println("Enter rectangle width");
          }
          width = scanner.nextDouble();
      }while (width<= 0);

      do {
          System.out.print("Enter rectangle height.");
          while (!scanner.hasNextDouble()) {
              System.out.println("Invalid. Please enter a positive number.");
              scanner.next();
              System.out.println("Enter rectangle height");
          }
          height = scanner.nextDouble();
      }while (height<= 0);


        double recArea= width*height;
        double recPerimeter=(width*2)+(height*2);
        double recDiagnol=Math.sqrt((height*height)+(width*width));

        //output
        System.out.println("The area of the rectangle is "+recArea);
        System.out.println("The perimeter is "+recPerimeter);
        System.out.println("The diagnol of the rectangle is "+recDiagnol);



    }
}
