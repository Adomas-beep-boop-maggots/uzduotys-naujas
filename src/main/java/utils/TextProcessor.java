package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class TextProcessor {
    private List<String> words;

    public TextProcessor(String filePath) {
        words = new ArrayList<>();
        readFromFile(filePath);
    }

    private void readFromFile(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] wordsInLine = line.split("\\W+");
                for (String word : wordsInLine) {
                    words.add(word.toLowerCase());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void processCommands() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter command (sort, unique, group, or exit): ");
            String command = scanner.nextLine();
            switch (command) {
                case "sort":
                    printSortedWords();
                    break;
                case "unique":
                    printUniqueWords();
                    break;
                case "group":
                    printGroupedWords();
                    break;
                case "exit":
                    System.out.println("Exiting the program.");
                    return;
                default:
                    System.out.println("Invalid command, please try again.");
            }
        }
    }

    private void printSortedWords() {
        List<String> sortedWords = new ArrayList<>(words);
        Collections.sort(sortedWords);
        System.out.println("Sorted words: ");
        for (String word : sortedWords) {
            System.out.println(word);
        }
    }

    private void printUniqueWords() {
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println("Unique words: ");
        for (String word : uniqueWords) {
            System.out.println(word);
        }
    }

    private void printGroupedWords() {
        Map<String, Integer> wordOccurrences = new HashMap<>();
        for (String word : words) {
            wordOccurrences.put(word, wordOccurrences.getOrDefault(word, 0) + 1);
        }

        System.out.println("Grouped words and occurrences: ");
        for (Map.Entry<String, Integer> entry : wordOccurrences.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
