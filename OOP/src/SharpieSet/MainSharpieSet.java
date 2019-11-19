package SharpieSet;

public class MainSharpieSet {
    public static void main(String[] args) {

        Sharpie green = new Sharpie("green");
        Sharpie blue = new Sharpie("blue");
        Sharpie yellow = new Sharpie("yellow");
        Sharpie lilac = new Sharpie("lilac");
        Sharpie white = new Sharpie("white");
        white.inkAmount = 10;

        SharpieSet mySharpieSet = new SharpieSet();

        mySharpieSet.add(green);
        mySharpieSet.add(blue);
        mySharpieSet.add(yellow);
        mySharpieSet.add(lilac);
        mySharpieSet.add(white);

        for (int i = 0; i < mySharpieSet.sharpieList.size(); i++) {
            System.out.println("My sharpie set contains: " + mySharpieSet.sharpieList.get(i).toString());
        }

        System.out.println(mySharpieSet.countUsable());


        for (int i = 0; i < mySharpieSet.sharpieList.size(); i++) {
        }

        System.out.println(mySharpieSet.countUsable());

        for (int  i = 0; i < 100; i++) {
            white.use();
        }
        mySharpieSet.removeTrash();

        System.out.println("After removal my set contains " + mySharpieSet.countUsable());
    }
}
