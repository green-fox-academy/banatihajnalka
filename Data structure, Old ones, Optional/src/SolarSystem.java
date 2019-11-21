import java.util.ArrayList;
import java.util.Arrays;

// Saturn is missing from the planetList
// Insert it into the correct position
// Create a method called putSaturn() which has list parameter and returns the correct list.
// Expected output: "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"

public class SolarSystem {
    public static void main(String[] args) {
        ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury","Venus","Earth","Mars","Jupiter","Uranus","Neptune"));
   //     String saturn = new String("Saturn");

        System.out.println(putSaturn(planetList));
    }

    private static ArrayList<String> putSaturn(ArrayList<String> planetList) {
        planetList.add(5, "Saturn");
        return planetList;
    }

}

