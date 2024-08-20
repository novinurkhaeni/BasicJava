package Test;

import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map;

public class Sort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        input = input.toLowerCase().replaceAll("\\s+", "");

        Map<Character, Integer> vowelCount = new LinkedHashMap<>();
        Map<Character, Integer> consonantCount = new LinkedHashMap<>();

        for (char c : input.toCharArray()) {
            if (isVowel(c)) {
                vowelCount.put(c, vowelCount.getOrDefault(c, 0) + 1);
            } else if (isConsonant(c)) {
                consonantCount.put(c, consonantCount.getOrDefault(c, 0) + 1);
            }
        }

        StringBuilder vowels = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : vowelCount.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                vowels.append(entry.getKey());
            }
        }

        StringBuilder consonants = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : consonantCount.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                consonants.append(entry.getKey());
            }
        }

        System.out.println("Vowel Characters : ");
        System.out.println(vowels.toString());
        System.out.println("Consonant Characters : ");
        System.out.println(consonants.toString());
    }

    private static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }

    private static boolean isConsonant(char c) {
        return Character.isLetter(c) && !isVowel(c);
    }
}
