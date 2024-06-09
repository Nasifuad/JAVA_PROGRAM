package JAVA;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class word_count {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text:");
        String input = scanner.nextLine();
        scanner.close();

        Map<String, Integer> wordCountMap = new TreeMap<>();

        String[] words = input.toLowerCase().replaceAll("[^a-zA-Z0-9\\s]", "").split("\\s+");
        for (String word : words) {
            if (!word.isEmpty()) {
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
