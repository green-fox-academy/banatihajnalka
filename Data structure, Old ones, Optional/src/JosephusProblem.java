import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class JosephusProblem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many people are there?");
        int countPeople = scanner.nextInt();
        List<Integer> people = new ArrayList<Integer>(countPeople);
        for (int i = 1; i <= countPeople; i++) {
            people.add(i);
        }
        System.out.println("Our current set: " + people);

        int currentToBeKilled = 1;
        int currentSize = people.size();

        while (people.size() > 1) {
            if (currentToBeKilled >= currentSize) {
                currentToBeKilled = currentToBeKilled % currentSize;
            }
            people.remove((currentToBeKilled));
            currentSize--;
            currentToBeKilled++;
            System.out.println("Our current set " + currentToBeKilled + ": " + people);
        }
    }

}
