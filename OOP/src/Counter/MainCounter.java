package Counter;

public class MainCounter {
    public static void main(String[] args) {

        Counter counter = new Counter();
        System.out.println(counter.value);
        counter.add();
        System.out.println(counter.value);
        System.out.println(counter.get());
    }
}
