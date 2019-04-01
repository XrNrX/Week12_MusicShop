package Instruments;

public class Trumpet extends Instrument {

    private int numberOfValves;

    public Trumpet(String material, String color, int buyPrice, int sellPrice, int numberOfValves) {
        super(material, color, buyPrice, sellPrice);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

    public String play(){
        return "BRRRUUUUMMMPPPH";
    }
}
