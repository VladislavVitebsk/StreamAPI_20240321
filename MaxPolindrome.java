package StreamAPI;

import java.util.stream.IntStream;

public class MaxPolindrome {
    public static void main(String[] args) {
        int maxPalindrome = IntStream.rangeClosed(10, 99)
                .flatMap(a -> IntStream.rangeClosed(10, 99).map(b -> a * b))
                .filter(MaxPolindrome::isPalindrome)
                .max()
                .orElseThrow();

        System.out.println("Максимальный палиндром: " + maxPalindrome);
    }

    public static boolean isPalindrome(int number) {
        String numStr = String.valueOf(number);
        return numStr.equals(new StringBuilder(numStr).reverse().toString());
    }
}
