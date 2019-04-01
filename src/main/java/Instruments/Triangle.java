package Instruments;

public class Triangle extends Instrument {

    private int numberOfSides;

    public Triangle(String material, String color, int buyPrice, int sellPrice, int numberOfSides) {
        super(material, color, buyPrice, sellPrice);
        this.numberOfSides = numberOfSides;
    }

    public int getNumberOfSides() {
        return numberOfSides;
    }

    public String play(){
        return "Ting Ting Te Ting";
    }

}
