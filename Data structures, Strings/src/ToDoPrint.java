import java.util.ArrayList;

public class ToDoPrint {
    public static void main(String[] args) {
        String todoText = " - Buy milk\n";

        ArrayList<String> toDoList = new ArrayList<>();
        toDoList.add(todoText);
        toDoList.add(0, "My todo:\n");
        toDoList.add("- Download games\n");
        toDoList.add("\t- Diablo");

        System.out.println(toDoList);
    }
    }
