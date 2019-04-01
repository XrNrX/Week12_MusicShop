import Instruments.Trumpet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void setup(){
        trumpet = new Trumpet("Brass", "Gold", 800, 1500, 1);
    }

    @Test
    public void getMaterial() {
        assertEquals("Brass", trumpet.getMaterial());
    }

    @Test
    public void getColor() {
        assertEquals("Gold", trumpet.getColor());
    }

    @Test
    public void getBuyPrice() {
        assertEquals(800, trumpet.getBuyPrice());
    }

    @Test
    public void getSellPrice() {
        assertEquals(1500, trumpet.getSellPrice());
    }

    @Test
    public void getNumberOfValves() {
        assertEquals(1, trumpet.getNumberOfValves());
    }

    @Test
    public void canPlay() {
        assertEquals("BRRRUUUUMMMPPPH", trumpet.play());
    }

    @Test
    public void hasMarkup() {
        assertEquals(700, trumpet.calculateMarkup());
    }
}
