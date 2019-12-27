package AirCraftCarrier;

public class MainAircraft {
    public static void main(String[] args) {
        Carrier bela = new Carrier(64, 10);
        Carrier jozsi = new Carrier(46, 5);

        bela.addAircrafts(new F16());
        bela.addAircrafts(new F35());

        jozsi.addAircrafts(new F35());
        jozsi.addAircrafts(new F35());

        try {
            bela.fill();
        } catch (NoAmmoExeption e) {
            System.out.println(e.getMessage());
        }

        bela.fight(jozsi);
        System.out.println(bela.getStatus());
        System.out.println(jozsi.getStatus());
    }
}
