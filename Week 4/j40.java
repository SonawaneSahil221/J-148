import java.util.Scanner;

public class BinaryAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first binary string: ");
        String binary1 = scanner.next();
        
        System.out.print("Enter second binary string: ");
        String binary2 = scanner.next();
        
        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);
        
        int sum = num1 + num2;
        System.out.println("Binary sum: " + Integer.toBinaryString(sum));
        
        scanner.close();
    }
}
