package exam;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ExamResults {
    public static void main(String[] args) {
        String filename = "exam/softsystem.txt";
        ResultAnalyzer analyzer = new ResultAnalyzer();

        try {
            //Czytanie z pliku
            Scanner scanner = new Scanner(new File(filename));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split(",");
                String firstName = data[0];
                String lastName = data[1];
                int[] points = new int[5];
                for (int i = 0; i < 5; i++) {
                    points[i] = Integer.parseInt(data[i + 2]);
                }
                Participant participant = new Participant(firstName, lastName, points);
                analyzer.addParticipant(participant);
            }
            scanner.close();

            // Sortowanie i wyswietlanie wynikow
            analyzer.sortByTotalPoints();
            analyzer.printResults();

            // Zapisywanie wynikow do pliku
            analyzer.saveResultsToFile("exam/result.txt");

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}