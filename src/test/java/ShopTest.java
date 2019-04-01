import Instruments.Guitar;
import Instruments.Piano;
import Miscellaneous.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Piano piano;
    GuitarStrings guitarstrings;

    @Before
    public void setup(){
        shop = new Shop("Bangin Tunes!");
        guitar = new Guitar("Ebony", "Black", 300, 500, 6, 2);
        piano = new Piano("Beech", "Black", 5000, 10000, 88);
        guitarstrings = new GuitarStrings(10, 20);

    }

    @Test
    public void hasName() {
        assertEquals("Bangin Tunes!", shop.getName());
    }

    @Test
    public void shopStartsWithNoStock() {
        assertEquals(0, shop.countStock());
    }

    @Test
    public void addStock() {
        shop.addStock(guitar);
        assertEquals(1, shop.countStock());
    }

    @Test
    public void removeStock() {
        shop.addStock(guitar);
        shop.addStock(piano);
        shop.removeStock(piano);
        assertEquals(1, shop.countStock());
    }


}
