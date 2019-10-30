import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me a number.");
        int userInput = scanner.nextInt();

        for (int i = 0; i < userInput; i++) { // loop soroknak
            String currentStr = ""; // minden sor elejen legyen egy ures string, amit feltoltunk a feltetelek alapjan
            if (i == 0 || i+1 == userInput) { // elso es utolso sor specialis esete
                for (int j = 0; j < userInput; j++) { // feltoltjuk az elso es az utolso sort annyi % jellel, amennyit megadtunk (hasznaljuk ki, hogy negyzet)
                    currentStr += "%";
                }
            } else { // nem az elso es nem az utolso sor
                for (int j = 0; j < userInput; j++) { // feltoltjuk annyi -valamivel-, amennyit megadtunk
                    if (j == 0 || j + 1 == userInput) { // elso es utolso karakter
                        currentStr += "%";
                    } else { // nem-elso es nem-utolso
                        if (j == i) { // atlo
                            currentStr += "%";
                        } else { // nem-atlo, nem-elso, nem-utolso
                            currentStr += " ";
                        }
                    }
                }
            }
            System.out.println(currentStr);
        }
    }
}