import java.util.Scanner;

public class starPattern {
    public static void main(String[] args) {
        int i, j, n;
        System.out.print("Enter the number of rows: ");
        n = new Scanner(System.in).nextInt();
        
        for(i = 1; i <= n; i++){
            for(j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}