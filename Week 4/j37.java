public class StringImmutability {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println("Original String: " + str);
        
        str.concat(" World"); // This doesn't modify str
        System.out.println("After concat: " + str); 
        
        str = str.concat(" World"); // Now it modifies str
        System.out.println("After reassignment: " + str);
    }
}

