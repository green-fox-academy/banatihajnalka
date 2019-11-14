import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
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

        try {                                                          //read into an arraylist
            fromToWork = Files.readAllLines(filePath);
        } catch (IOException e) {
        }
        System.out.println(fromToWork);


        ArrayList<String> justIP = splitTextFunction(fromToWork);
        String[] uniqueIP = findUniqueFunction(justIP);
        printUniqueIPFunction(uniqueIP);
    }

  //  private static String[] justIPFunction(String[] outputSplitted) {
 //      Str
 //   }

    private static void printUniqueIPFunction(String[] uniqueIP) {
        for (int i = 0; i < uniqueIP.length; i++) {
            System.out.println("Theese are the unique IPS: " + uniqueIP[i]);
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


    private static ArrayList<String> splitTextFunction(List<String> fromToWork) {
        int length = fromToWork.size();
        String[] outputSplitted = new String[length];
        ArrayList<String> justIP= new ArrayList<>();
        for (int i =0; i < fromToWork.size(); i++) {
           outputSplitted = fromToWork.get(i).split(" ");
           justIP.add(outputSplitted[8]);
           System.out.println(outputSplitted[8]);
        }
        return justIP;

    }


}
