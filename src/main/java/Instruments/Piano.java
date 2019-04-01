package Instruments;

public class Piano extends Instrument {

    private int numberOfKeys;

    public Piano(String material, String color, int buyPrice, int sellPrice, int numberOfKeys) {
        super(material, color, buyPrice, sellPrice);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public String play(){
        return "Dum De Dum De Dum";
    }
}
