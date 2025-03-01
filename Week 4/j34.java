import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number N: ");
        String N = scanner.next();
        
        System.out.print("Enter digit D: ");
        char D = scanner.next().charAt(0);
        
        int count = 0;
        for (char c : N.toCharArray()) {
            if (c == D) {
                count++;
            }
        }
        
        System.out.println("Total count of digit " + D + " occurring in " + N + " is: " + count);
        scanner.close();
    }
}

