import java.util.Scanner;

/**
 * This program demonstrates passing arguments to a superclass constructor.
 */

public class CubeDemo {
    public static void main(String[] args) {
        double length;
        double width;
        double height;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the following dimensions of a cube:");
        System.out.print("Length: ");
        length = keyboard.nextDouble();

        System.out.print("Width: ");
        width = keyboard.nextDouble();

        System.out.print("Height: ");
        height = keyboard.nextDouble();

        Cube myCube = new Cube(length, width, height);

        System.out.println("Here are the cube's properties.");
        System.out.println("Length: " + myCube.getLength());
        System.out.println("Width: " + myCube.getWidth());
        System.out.println("Base Area: " + myCube.getArea());
        System.out.println("Surface Area: " + myCube.getSurfaceArea());
        System.out.println("Volume: " + myCube.getVolume());

    }
}
