public class RemoveAdjacentDuplicates {
    public static void main(String[] args) {
        String str = "aaabbcddd";
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (result.length() == 0 || result.charAt(result.length() - 1) != c) {
                result.append(c);
            }
        }

        System.out.println("String after removing adjacent duplicates: " + result);
    }
}
