package readingWriting;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReplaceVowels {
    public static void main(String[] args) throws IOException {

        Path absolutePath = Paths.get("C:/input/aa");
        System.out.println(Files.readAllLines(absolutePath));

    }

}
