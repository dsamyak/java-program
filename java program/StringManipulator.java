/*practical no 10*/
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class StringManipulator {

    // 1. Reverse a String
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // 2. Check for Palindrome
    public static boolean isPalindrome(String str) {
        String reversed = reverseString(str);
        return str.equalsIgnoreCase(reversed);
    }

    // 3. Count Vowels and Consonants
    public static void countVowelsAndConsonants(String str) {
        int vowels = 0, consonants = 0;
        str = str.toLowerCase();
        
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
    }

    // 4. Remove Duplicate Characters
    public static String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        for (char c : str.toCharArray()) {
            if (!seen.contains(c)) {
                seen.add(c);
                sb.append(c);
            }
        }
        return sb.toString();
    }

    // 5. Find the Most Frequent Character
    public static char mostFrequentCharacter(String str) {
        Map<Character, Integer> freqMap = new HashMap<>();
        char mostFrequent = ' ';
        int maxCount = 0;
        
        for (char c : str.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
                if (freqMap.get(c) > maxCount) {
                    maxCount = freqMap.get(c);
                    mostFrequent = c;
                }
            }
        }
        return mostFrequent;
    }

    public static void main(String[] args) {
        String input = "hello";
        
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reverseString(input));
        System.out.println("Is Palindrome: " + isPalindrome(input));
        countVowelsAndConsonants(input);
        System.out.println("String without Duplicates: " + removeDuplicates(input));
        System.out.println("Most Frequent Character: " + mostFrequentCharacter(input));
    }
}
