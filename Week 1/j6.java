import java.util.Scanner;

public class CircleCalculations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of the circle:");
        double radius = sc.nextDouble();

        System.out.println("Choose an option:\n1. Area\n2. Circumference");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Area: " + (Math.PI * radius * radius));
                break;
            case 2:
                System.out.println("Circumference: " + (2 * Math.PI * radius));
                break;
            default:
                System.out.println("Invalid choice!");
        }
        sc.close();
    }
}
