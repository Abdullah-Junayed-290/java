public class function {
    public static void main(String[] args) {
        //write a function to add two numbers
        int a = 5;
        int b = 10;
        int sum = add(a, b);
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
        //write a function to subtract two numbers
        int difference = subtract(a, b);
        System.out.println("The difference between " + a + " and " + b + " is: " + difference);
    }

    public static int add(int a, int b) {
        return a + b;
    }
    //write a function to subtract two numbers
    public static int subtract(int a, int b) {
        return a - b;
    } 

}
