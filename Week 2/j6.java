public class AdditionAndSqrt {
    public static void main(String[] args) {
        int a = 5, b = 10;

        // Using function
        System.out.println("Sum using function: " + add(a, b));

        // Using control statement
        int sum = 0;
        if (true) sum = a + b;
        System.out.println("Sum using control statement: " + sum);

        int num = 16;
        System.out.println("Square root of " + num + " is " + sqrt(num));
    }

    public static int add(int x, int y) {
        return x + y;
    }
