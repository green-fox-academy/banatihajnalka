package AirCraftCarrier;

public class MainAircraft {
    public static void main(String[] args) {
        Carrier bela = new Carrier(1000, 10);
        Carrier jozsi = new Carrier(1500, 5);
        bela.addAircrafts(new F16());
        jozsi.addAircrafts(new F35());
        
    }
}
