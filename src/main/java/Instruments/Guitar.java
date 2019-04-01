package Instruments;

public class Guitar extends Instrument {

    private int numberOfStrings;
    private int numberOfPickups;

    public Guitar(String material, String color, int buyPrice, int sellPrice, int numberOfStrings, int numberOfPickups) {
        super(material, color, buyPrice, sellPrice);
        this.numberOfStrings = numberOfStrings;
        this.numberOfPickups = numberOfPickups;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public int getNumberOfPickups() {
        return numberOfPickups;
    }

    public String play(){
        return "WAH WAH WAH";
    }

}
