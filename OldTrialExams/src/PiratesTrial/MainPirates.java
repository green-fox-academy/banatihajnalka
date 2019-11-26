package PiratesTrial;

import org.w3c.dom.ls.LSOutput;

public class MainPirates {
    public static void main(String[] args) {
        Pirate pirate1 = new Pirate();
        pirate1.name = "Jack";
        System.out.println(pirate1.name + " " + pirate1.healthPoints);

        Ship ship = new Ship();
        ship.addPirates();
        System.out.println(ship.pirateList.toString());


        System.out.println(ship.getPoorPirates());


    }


}
