import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TicTacToe2 {
    public static void main(String[] args) {
        Path filepath = Paths.get("draw.txt");

        List<String> text = new ArrayList<>();
        try {
            text = Files.readAllLines(filepath);
            System.out.println(text);
        } catch (IOException e) {
            System.out.println("File does not exists");
        }

        String[][] ticTacToeArray = new String[text.size()][];
        for (int i = 0; i < text.size(); i++) {
            String row = text.get(i);
            ticTacToeArray[i] = text.get(i).split("");
        }

        for (int i = 0; i < ticTacToeArray.length; i++) {         //this equals to the row in our matrix.
            //          for (int j = 0; j < ticTacToeArray[i].length; j++) {
            if (ticTacToeArray[0][i].equals(ticTacToeArray[1][i]) && ticTacToeArray[1][i].equals(ticTacToeArray[2][i])) {  //this equals to the column in each row.
                System.out.print(ticTacToeArray[0][0]);
                break;
            } else if (ticTacToeArray[i][0].equals(ticTacToeArray[i][1]) && ticTacToeArray[i][1].equals(ticTacToeArray[i][2])) {
                System.out.println(ticTacToeArray[1][0]);
                break;
            } else if (ticTacToeArray[2][0].equals(ticTacToeArray[2][1]) && ticTacToeArray[2][1].equals(ticTacToeArray[2][2])) {
                System.out.println(ticTacToeArray[2][0]);
                break;
            } else if (ticTacToeArray[0][0].equals(ticTacToeArray[1][1]) && ticTacToeArray[1][1].equals(ticTacToeArray[2][0])) {
                System.out.println(ticTacToeArray[0][0]);
                break;
            } else if (ticTacToeArray[0][2].equals(ticTacToeArray[1][1]) && ticTacToeArray[1][1].equals(ticTacToeArray[2][0])) {
                System.out.println(ticTacToeArray[0][2]);
            } else {
            }

        } System.out.println("Draw");
    }
}
