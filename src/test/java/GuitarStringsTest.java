import Miscellaneous.GuitarStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    GuitarStrings guitarstrings;

    @Before
    public void setup(){
        guitarstrings = new GuitarStrings(10, 20);
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(10, guitarstrings.getBuyPrice());
    }

    @Test
    public void hasSellPrice() {
        assertEquals(20, guitarstrings.getSellPrice());
    }

    @Test
    public void hasMarkup() {
        assertEquals(10, guitarstrings.calculateMarkup());
    }
}
