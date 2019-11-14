class Tree {
    String type;
    String leafColor;
    int age;
    String sex;

    void speak() {
        System.out.println("I am a tree with a type: " + type + " and it has a leaf color "+ leafColor + "." );
    }
}
public class Trees {
    public static void main(String[] args) {
        Tree tolgy = new Tree();
        tolgy.type = "Quercus";
        tolgy.leafColor = "green";
        tolgy.age = 6;
        tolgy.speak();

        Tree nyir = new Tree();
        nyir.type = "Betula";
        nyir.leafColor = "green";
        nyir.age = 7;
        nyir.speak();

        Tree bukk = new Tree();
        bukk.type = "Fagus";
        bukk.leafColor = "red";
        bukk.age = 8;
        bukk.speak();

        Tree hars = new Tree();
        hars.type = "Fagus";
        hars.leafColor = "green";
        hars.age = 8;
        hars.speak();

        Tree nyar = new Tree();
        nyar.type = "Populus";
        nyar.leafColor = "yellow";
        nyar.age = 10;
        nyar.speak();



    }

}