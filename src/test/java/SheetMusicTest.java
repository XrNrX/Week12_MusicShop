import Miscellaneous.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetmusic;

    @Before
    public void setup(){
        sheetmusic = new SheetMusic(20, 30);
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(20, sheetmusic.getBuyPrice());
    }

    @Test
    public void hasSellPrice() {
        assertEquals(30, sheetmusic.getSellPrice());
    }

    @Test
    public void hasMarkup() {
        assertEquals(10, sheetmusic.calculateMarkup());
    }
}
