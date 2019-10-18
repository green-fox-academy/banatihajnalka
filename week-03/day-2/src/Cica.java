import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class Cica {

    public static void main(String[] args) {
        int firstNumber = 1;
        double doubleNumber = 1.5;
        int secondNumber;
        secondNumber = 3;
        boolean isHungry = true;
        String name = "furkesz";
        char letter = 'a';

        int thirdNumber = firstNumber + secondNumber;
        System.out.println(thirdNumber);

        thirdNumber++;
        System.out.println(thirdNumber);

        thirdNumber = thirdNumber + 5;
        thirdNumber += 5;
        System.out.println(thirdNumber);

        boolean isThirdBigger = thirdNumber != firstNumber;
        System.out.println(isThirdBigger);

        boolean isHUngary = true;
        boolean isSleepy = false;
        System.out.println("boolean operators");
        System.out.println(isHungry || isSleepy);

        System.out.println("Hello " + name + "!");
        String anotherString = "Hello " + thirdNumber + "!";
        System.out.println(anotherString);

        thirdNumber++;
        if (thirdNumber == 15) {
            System.out.println("third number is 15");
        } else if (thirdNumber < 15) {
            System.out.println("third number is lower than 15");
        } else if (thirdNumber > 15) {
            System.out.println("third number is lower than 15");
        }

        // Scanner
        System.out.println("Please write me something here");
        Scanner scanner = new Scanner(System.in);
        String bejovo = scanner.nextLine();
        System.out.println("this was the input:" + bejovo);

        System.out.println("Give me a number");
        int giveNumber = scanner.nextInt();
        System.out.println("your number is: " + giveNumber);

        // For loop
        for (int i = 0; i < 10; i++) {
            System.out.println(i + 1);
        }

        System.out.println("Give me a number");
        Scanner scanner2 = new Scanner(System.in);
        int giveNumber2 = scanner2.nextInt();
        System.out.println("your number is: " + giveNumber2);
        for (int i = 0; i < giveNumber2; i++) {
            System.out.println(i + 1);
        }

       int a = 4;
        while (a < 10) {
            System.out.println(a);
            a++;
       }

        int b = 6;
        do {
            System.out.println(b);
            b++;
        } while (b < 10);

        System.out.println("please tell your name");
        String myName = scanner.nextLine();
        String output;
        if (myName.equals("Furkesz")) {
            output = "Hi Furkesz";
        } else if (myName.equals("Bela")) {
            output = "Nice to meet you Bela";
        } else if (myName.equals("Karoly")) {
            output = "What is up Karoly";
        } else {
            output = "Please leave the room";
        }
        System.out.println("Out from if: " + output);

    }

}