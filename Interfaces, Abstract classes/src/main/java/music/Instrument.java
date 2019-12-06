package main.java.music;

public abstract class Instrument {
    private String name;

    String getName() {
        return name;
    }
    
    Instrument(String name) {
        this.name = name;
    }

    public abstract void play();
}
