//Problem Link - https://leetcode.com/problems/sort-characters-by-frequency/description/

package Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencySort {
    public static String frequencySort(String s) {
        // Count the frequency of each character
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Sort characters based on their frequency in descending order
        List<Character> sortedChars = new ArrayList<>(charCount.keySet());
        Collections.sort(sortedChars, (a, b) -> charCount.get(b) - charCount.get(a));

        // Build the result string by repeating characters according to their frequency
        StringBuilder result = new StringBuilder();
        for (char c : sortedChars) {
            result.append(String.valueOf(c).repeat(charCount.get(c)));
        }

        // Return the final sorted string
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "treee";
        System.out.println(frequencySort(s));
    }
}
