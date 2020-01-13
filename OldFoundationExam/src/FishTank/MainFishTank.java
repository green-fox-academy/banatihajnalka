package FishTank;

public class MainFishTank {

    public static void main(String[] args) {

        Aquarium aquarium = new Aquarium();

        aquarium.addFish(new Clownfish("kati", 29));
        aquarium.addFish(new Tang("zita", 15));
        aquarium.addFish(new Kong("lajos", 9));

        aquarium.getStatus();
        aquarium.feedAllFish();
        aquarium.removeFish();
        aquarium.getStatus();

    }


}
