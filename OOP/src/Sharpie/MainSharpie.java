package Sharpie;

public class MainSharpie {
    public static void main(String[] args) {

        Sharpie green = new Sharpie("green", 40);
        System.out.println(green.inkAmount);
        green.use();
        System.out.println(green.inkAmount);
    }
}
