import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SecondExercise {
    private static FileWriter getFileWriter(String filePath) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(filePath, true);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return fileWriter;
    }

    protected static void closeFileWriter(FileWriter fileWriter) {
        try {
            fileWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void printToFile(FileWriter fileWriter, String text, int repeat) {
        try {
            for (int i = 0; i < repeat; i++) {
                fileWriter.write(text + "\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filePath = scanner.nextLine();
        int howManyTimesToPrintTheTextToFile = scanner.nextInt();
        String textToAdd = scanner.nextLine();
        printToFile(getFileWriter(filePath), textToAdd, howManyTimesToPrintTheTextToFile);
    }
}
