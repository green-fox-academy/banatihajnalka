import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give me a number.");
        int UserInput1 = scanner.nextInt();
        System.out.println("Please give me one more number.");
        int UserInput2 = scanner.nextInt();
        int girlsNumber = UserInput1;
        int boysNumber = UserInput2;

        if (girlsNumber == boysNumber && (girlsNumber + boysNumber) > 20) {
            System.out.println("The party is excellent!");
        } else if ((girlsNumber + boysNumber) > 20 && (girlsNumber % boysNumber != 0)) {
            System.out.println("Quite cool party!");
        } else if ((girlsNumber + boysNumber) < 20) {
            System.out.println("Average party.....");
        } else if (girlsNumber == 0) {
            System.out.println("Sausage party.");
        }
            }

        }
