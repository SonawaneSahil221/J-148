public class CompoundInterest {
    public static void main(String[] args) {
        double principal = 1000, rate = 5, time = 3;
        double amount = principal * Math.pow((1 + rate / 100), time);
        double ci = amount - principal;
        System.out.println("Compound Interest: " + ci);
    }
}

