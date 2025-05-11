import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int i, n;
        long fact = 1;
        System.out.print("Enter a number: ");
        n = new Scanner(System.in).nextInt();

        for (i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println("Factorial of " + n + " is: " + fact);
    }
}
