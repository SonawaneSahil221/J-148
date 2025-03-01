public class ReplaceDigits {
    public static void main(String[] args) {
        String str = "H3ll0 W0rld";
        String result = str.replaceAll("[0-9]", "*");
        System.out.println("Modified string: " + result);
    }
}
