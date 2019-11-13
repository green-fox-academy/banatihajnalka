import javax.xml.transform.sax.SAXSource;
import java.sql.SQLOutput;
import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        System.out.println("Give me a number: ");
        Scanner scanner = new Scanner(System.in);
        int userInput1 = scanner.nextInt();

        System.out.println("Give me one more number: ");
        Scanner scanner2 = new Scanner(System.in);
        int userInput2 = scanner.nextInt();

        System.out.println("The number of legs are: " + ((userInput1 * 2) + (userInput2 * 4)));



    }
}