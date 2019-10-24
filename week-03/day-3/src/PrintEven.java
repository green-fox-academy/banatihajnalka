public class PrintEven {
    public static void main(String[] args) {
        int evenNumber = 0;
        for (evenNumber = 0; evenNumber <= 500; evenNumber++)
            if (evenNumber % 2 == 0) {
                System.out.println(evenNumber);
            }
    }
}
