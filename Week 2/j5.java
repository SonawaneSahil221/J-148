public class ModWithoutOperator {
    public static void main(String[] args) {
        int dividend = 17, divisor = 5;
        int remainder = dividend - (divisor * (dividend / divisor));
        System.out.println("Remainder: " + remainder);
    }
}
