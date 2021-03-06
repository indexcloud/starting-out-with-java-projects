import java.util.Scanner;

/**
 * This program demonstrates a simple lambda expression.
 */

public class LambdDemo {
    public static void main(String[] args) {
        int num;

        Scanner keyboard = new Scanner(System.in);

        IntCalculator square = x -> x * x;

        System.out.print("Enter an integer number: ");
        num = keyboard.nextInt();

        System.out.println("The square is " + square.calculate(num));
    }
}
