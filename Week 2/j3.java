public class PalindromeCheck {
    public static void main(String[] args) {
        int num = 121, original = num, reverse = 0;
        while (num > 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }
        System.out.println(original + " is " + (original == reverse ? "a Palindrome" : "not a Palindrome"));
    }
}
