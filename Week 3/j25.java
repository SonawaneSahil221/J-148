import java.util.Arrays;

public class SortStrings {
    public static void main(String[] args) {
        String[] words = {"banana", "apple", "cherry", "date"};
        Arrays.sort(words);
        System.out.println("Sorted words: " + Arrays.toString(words));
    }
}

