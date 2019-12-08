package Printable;

import java.util.ArrayList;
import java.util.List;

public class MainPrintable {
    public static void main(String[] args) {

        Domino firstDomino = new Domino(3,2);
        ToDo firstToDo = new ToDo("Buy milk", "high", true);

        List<Domino> dominoes = new ArrayList<Domino>();
        dominoes.add(firstDomino);

        List<ToDo> todos = new ArrayList<ToDo>();
        todos.add(firstToDo);

        for (Domino d : dominoes) {
            d.printAllFields();
        }
        for (ToDo t : todos) {
            t.printAllFields();
        }
    }
}
