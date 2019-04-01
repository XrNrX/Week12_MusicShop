import Miscellaneous.DrumSticks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumSticksTest {

    DrumSticks drumsticks;

    @Before
    public void setup(){
        drumsticks = new DrumSticks(5, 10);
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(5, drumsticks.getBuyPrice());
    }

    @Test
    public void hasSellPrice() {
        assertEquals(10, drumsticks.getSellPrice());
    }

    @Test
    public void hasMarkup() {
        assertEquals(5, drumsticks.calculateMarkup());
    }
}
