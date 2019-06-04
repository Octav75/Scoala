package readingWriting;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReplaceVowels {
    public static void main(String[] args) throws IOException {
        try {
            Path absolutePath = Paths.get("C:/input");
            List<String> fileLines = Files.readAllLines(Paths.get("C:/input"));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Eroare in fisierul a ");
        }

        File absoluteFile = new File("C:/output/b.txt");

    }

}
