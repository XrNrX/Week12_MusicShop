import Instruments.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<ISell>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public int countStock(){
        return stock.size();
    }

    public void addStock(ISell stockItems){
        this.stock.add(stockItems);
    }

    public void removeStock(ISell stockItems){
        this.stock.remove(stockItems);
    }
}
