package com.example;

public class StringUtils {

    // Reverse a string
    public static String reverse(String input) {
        if (input == null) return null;
        return new StringBuilder(input).reverse().toString();
    }

    // Check if a string is palindrome
    public static boolean isPalindrome(String input) {
        if (input == null) return false;
        String reversed = reverse(input);
        return input.equalsIgnoreCase(reversed);
    }

    // Count occurrences of a character in a string
    public static int countChar(String input, char ch) {
        if (input == null) return 0;
        int count = 0;
        for (char c : input.toCharArray()) {
            if (c == ch) count++;
        }
        return count;
    }
}
