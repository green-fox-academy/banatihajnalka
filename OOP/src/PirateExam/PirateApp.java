package PirateExam;

public class PirateApp {

    public static void main(String[] args) {

        Ship ship1 = new Ship();
        Ship ship2 = new Ship();
        ship1.fillShip();
        ship2.fillShip();

        System.out.println("Ship1 before: " + ship1);
        System.out.println("Ship2 before: " + ship2);

        ship1.captain.drinkSomeRum(8);

        ship2.captain.drinkSomeRum(10);

        ship1.battle(ship2);
        System.out.println("Ship1 after: " + ship1);
        System.out.println("Ship2 after: " + ship2);

        }
}
