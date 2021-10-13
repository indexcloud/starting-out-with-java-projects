import java.util.Scanner;

/**
 * This program times calls to the recursive Fibonacci method for 6 consecutive calls and displays the results.
 */

public class RecursiveFibonacciTimer {
    public static void main(String[] args) {
        System.out.print("Enter a positive integer: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        long currentTime = System.currentTimeMillis();
        long previousTime;
        long elapsedTime = 0;

        for (int k = 0; k <= 5; k++) {
            // Record time before calling the method
            previousTime = currentTime;
            System.out.print("The Fibonacci term at position ");
            System.out.print((number + k) + " is ");

            // Compute and print fib term for the next argument
            System.out.println(fib(number + k));

            // Record time after calling the method
            currentTime = System.currentTimeMillis();

            // Compute and print elapsed time in seconds
            elapsedTime = (currentTime - previousTime) / 1000;
            System.out.println("Computed in " + elapsedTime + " seconds.");
        }
    }

    public static long fib(long n) {
        if (n <= 1)
            return 1;
        else
            return fib(n - 2) + fib(n - 1);
    }
}
