import javafx.scene.chart.ScatterChart;

import java.io.*;
import java.nio.file.Files;

public class CopyFile {

    public static void main(String[] args) {
        // Write a function that copies the contents of a file into another
        // It should take the filenames as parameters
        // It should return a boolean that shows if the copy was successful

        String fromCopy = "my-file.txt";
        String toCopy = "copied.txt";
        copyFilesFunction(fromCopy, toCopy);
    }

    private static void copyFilesFunction(String fromCopy, String toCopy) {
        try(
    FileReader fr = new FileReader(fromCopy);
    FileWriter fw = new FileWriter(toCopy)) {
        int c = fr.read();
        while (c != -1) {
            fw.write(c);
            c = fr.read();
        }
    } catch(IOException e) {
        e.printStackTrace();
    }
        File tempFile = new File(toCopy);
        boolean exists = tempFile.exists();
        System.out.println(exists);
}
}
