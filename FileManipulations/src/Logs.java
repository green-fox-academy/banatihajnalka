import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Logs {
    // Read all data from 'log.txt'.
    // Each line represents a log message from a web server
    // Write a function that returns an array with the unique IP adresses.
    // Write a function that returns the GET / POST request ratio.

    public static void main(String[] args) {
        String logs = "Logs.txt";
        Path filePath = Paths.get(logs);
        List<String> fromToWork = new ArrayList<>();

        try {
            fromToWork = Files.readAllLines(filePath);
        } catch (IOException e) {
        }
        System.out.println(fromToWork);

        int colNumber;
        ArrayList<String> justIP = splitTextFunction(fromToWork, 8);
        String[] uniqueIP = findUniqueFunction(justIP);
        printUniqueIPFunction(uniqueIP);

        ArrayList<String> justGetPost = splitTextFunction(fromToWork, 11);
        double occurenceGet = Collections.frequency(justGetPost, "GET");
        System.out.println(occurenceGet);
        double occurencePost = Collections.frequency(justGetPost, "POST");
        System.out.println(occurencePost);
        double ratio = (occurenceGet / occurencePost);
        System.out.println("The GET - POST ratio is: " + ratio);

    }


    private static void printUniqueIPFunction(String[] uniqueIP) {
        for (int i = 0; i < uniqueIP.length; i++) {
  //          System.out.println("These are the unique IPS: " + uniqueIP[i]);
        }
    }

    private static String[] findUniqueFunction(ArrayList<String> justIP) {
        // List<String> input= Arrays.asList(justIP);
         Set<String> fromuniqueIP = new HashSet<>(justIP);
         System.out.println("The number of unique IPs: " + fromuniqueIP.size());
         String[] uniqueIP = new String[fromuniqueIP.size()];
         uniqueIP = fromuniqueIP.toArray(new String[0]);
         return uniqueIP;
    }


    private static ArrayList<String> splitTextFunction(List<String> fromToWork, int colNumber) {
        int length = fromToWork.size();
        String[] outputSplitted = new String[length];
        ArrayList<String> justIP= new ArrayList<>();
        for (int i =0; i < fromToWork.size(); i++) {
           outputSplitted = fromToWork.get(i).split(" ");
           justIP.add(outputSplitted[colNumber]);
  //         System.out.println(outputSplitted[colNumber]);
        }
        return justIP;

    }


}
