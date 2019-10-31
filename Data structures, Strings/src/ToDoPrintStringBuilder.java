public class ToDoPrintStringBuilder {
    public static void main(String[] args) {
        StringBuilder todoText = new StringBuilder(" - Buy milk\n");
        todoText.insert(0, "My todo");
        todoText.insert(todoText.length(), "- Download games\n");
        todoText.insert(todoText.length(), "\t- Diablo");

        System.out.println(todoText);
    }
}
