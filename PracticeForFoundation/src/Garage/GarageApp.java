package Garage;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collections;

public class GarageApp {

    public static void main(String[] args) {
        Garage garage = new Garage();
        garage.add(new Toyota(), "HNG675");
        garage.add(new Porsche("red"), "TRE554");
        garage.add(new Suzuki("white", 35), "EDS987");

        garage.makeItLoud();
        System.out.println(garage.getHowManyCarsIn());
        System.out.println(garage.averageCarSpeed());
        System.out.println(garage.getCarColors());
        System.out.println(garage.getCar("TRE554"));
//        System.out.println(garage.getCarSecond("TRE554"));
        System.out.println("FILL::: " + garage.fill(500));




    }
}
