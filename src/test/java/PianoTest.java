import Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void setup(){
        piano = new Piano("Beech", "Black", 5000, 10000, 88);
    }

    @Test
    public void hasMaterial() {
        assertEquals("Beech", piano.getMaterial());
    }

    @Test
    public void hasColor() {
        assertEquals("Black", piano.getColor());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(5000, piano.getBuyPrice());
    }

    @Test
    public void hasSellPrice() {
        assertEquals(10000, piano.getSellPrice());
    }

    @Test
    public void hasNumberOfKeys() {
        assertEquals(88, piano.getNumberOfKeys());
    }

    @Test
    public void canPlay() {
        assertEquals("Dum De Dum De Dum", piano.play());
    }

    @Test
    public void hasMarkup() {
        assertEquals(5000, piano.calculateMarkup());
    }
}
