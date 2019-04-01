package Miscellaneous;

public abstract class ShopItems implements ISell {

    private int buyPrice;
    private int sellPrice;

    public ShopItems(int buyPrice, int sellPrice) {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
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
