import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {

    public static void main(String[] args) {
        // Create a method that decrypts reversed-order.txt

        String reverseOrder = "ReversedOrder.txt";
        Path filePath = Paths.get(reverseOrder);
        List<String> fromReverseOrder = new ArrayList<>();

        try {
            fromReverseOrder = Files.readAllLines(filePath);
        } catch (IOException e) {
        }
        System.out.println(fromReverseOrder);

        String[] reversedOrder = reversedOrderFunction(fromReverseOrder);

    }

    private static String[] reversedOrderFunction(List<String> fromReverseOrder) {
        int length = fromReverseOrder.size();
        String[] output = new String[length];
        for (int i = fromReverseOrder.size() - 1; i > 0; i--) {
            System.out.print(fromReverseOrder.get(i));
            System.out.println();
        }
        return output;
    }
}

