import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evens = new ArrayList<>();

        for (int num : numbers) {
            if (num % 2 == 0) {
                evens.add(num);
            }
        }

        System.out.println("Even numbers: " + evens);
    }
}
