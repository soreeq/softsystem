import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String wordsFile = "words.txt";
        String textFile = "text.txt";
        String resultFile = "result.txt";

        try {
            BufferedReader wordsReader = new BufferedReader(new FileReader(wordsFile));
            String line;
            while ((line = wordsReader.readLine()) != null) {
                String word = line.trim();
                int count = countWordOccurrences(word, textFile);
                writeResultToFile(word, count, resultFile);
            }
            wordsReader.close();

            System.out.println("Results written to " + resultFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int countWordOccurrences(String word, String textFile) throws IOException {
        BufferedReader textReader = new BufferedReader(new FileReader(textFile));
        String line;
        int count = 0;

        while ((line = textReader.readLine()) != null) {
            count += countOccurrencesIgnoreCase(line, word);
        }

        textReader.close();
        return count;
    }

    private static int countOccurrencesIgnoreCase(String text, String word) {
        int count = 0;
        int index = -1;
        text = text.toLowerCase();
        word = word.toLowerCase();

        while ((index = text.indexOf(word, index + 1)) != -1) {
            count++;
        }

        return count;
    }

    private static void writeResultToFile(String word, int count, String resultFile) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(resultFile, true));
        writer.write(word + " --> " + count);
        writer.newLine();
        writer.close();
    }
}
