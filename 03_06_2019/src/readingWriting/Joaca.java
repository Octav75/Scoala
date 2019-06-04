package readingWriting;

import java.io.File;

public class Joaca {

    public static void main(String[] args) {
        int i;
        boolean isReusita;
        File dirNou = new File("C:/dirProba");
        if (dirNou.isDirectory())
            System.out.println("Directorul C:\\dirProba exista deja!");
        isReusita = dirNou.mkdir();
        if (isReusita)
            System.out.println("Am reusit sa creeam directorul " + "C:/irProba");
        else
            System.out.println("Nu am creeat directorul " + "C:/dirProba!");
    }
}
