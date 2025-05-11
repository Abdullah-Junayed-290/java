import java.util.Scanner; // Import the Scanner class
public class while_loop {
    public static void main(String[] args) {
        int i, n;
        System.out.println("Enter a number: ");
        n = new Scanner(System.in).nextInt();
        i = 1;
        while (i <= n) {
            System.out.println(i);
            i++;
        }
        System.out.println("The loop has ended.");
        System.out.println("The value of i is: " + i);}
}
