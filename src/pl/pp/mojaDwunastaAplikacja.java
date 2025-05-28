package pl.pp;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.List;
import java.util.Scanner;

public class mojaDwunastaAplikacja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userDirectory = System.getProperty("user.dir");
        System.out.println("Bieżący katalog to:");
        System.out.println(userDirectory);

        Path inputFilePath;
        while (true) {
            System.out.print("Podaj ścieżkę do pliku wejściowego: ");
            String inputPath = scanner.nextLine();
            inputFilePath = Paths.get(inputPath);
            if (Files.exists(inputFilePath) && Files.isRegularFile(inputFilePath)) {
                break;
            } else {
                System.out.println("Plik nie istnieje. Podaj poprawną ścieżkę.");
            }
        }

        System.out.print("Podaj ścieżkę do pliku wyjściowego: ");
        String outputPath = scanner.nextLine();
        Path outputFilePath = Paths.get(outputPath);

        try {
            List<String> lines = Files.readAllLines(inputFilePath, Charset.defaultCharset());

            int lineCount = lines.size();

            System.out.println("Liczba linii w pliku: " + lineCount);

            String output = "Plik: " + inputFilePath.getFileName() + "\nLiczba linii: " + lineCount;
            Files.write(outputFilePath, output.getBytes(Charset.defaultCharset()));

            System.out.println("Wynik zapisany do pliku: " + outputFilePath.toAbsolutePath());

        } catch (IOException e) {
            System.out.println("Wystąpił błąd podczas pracy z plikami: " + e.getMessage());
        }
    }
}

