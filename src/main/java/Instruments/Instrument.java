package Instruments;


public abstract class Instrument implements IPlay , ISell {

    private String material;
    private String color;
    private int buyPrice;
    private int sellPrice;

    public Instrument(String material, String color, int buyPrice, int sellPrice) {
        this.material = material;
        this.color = color;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public int getBuyPrice() {
        return buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public int calculateMarkup(){
        return getSellPrice() - getBuyPrice();
    }

}
