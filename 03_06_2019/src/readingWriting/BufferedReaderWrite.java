package readingWriting;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderWrite {
    public static void main(String[] args) throws IOException {
        File absoluteFile = new File("C:/input/cc.txt");
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(absoluteFile))){
            String fileLine;
            while ((fileLine = bufferedReader.readLine()) != null){
                System.out.println(fileLine);
            }
        }
    }
}
