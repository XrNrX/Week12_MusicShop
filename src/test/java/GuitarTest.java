import Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setup(){
        guitar = new Guitar("Ebony", "Black", 300, 500, 6, 2);
    }

    @Test
    public void getMaterial() {
        assertEquals("Ebony", guitar.getMaterial());
    }

    @Test
    public void getColor() {
        assertEquals("Black", guitar.getColor());
    }

    @Test
    public void getBuyPrice() {
        assertEquals(300, guitar.getBuyPrice());
    }

    @Test
    public void getSellPrice() {
        assertEquals(500, guitar.getSellPrice());
    }

    @Test
    public void getNumberOfStrings() {
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void getNumberOfPickups() {
        assertEquals(2, guitar.getNumberOfPickups());
    }

    @Test
    public void canIPlay() {
        assertEquals("WAH WAH WAH", guitar.play());
    }

    @Test
    public void hasMarkup() {
        assertEquals(200, guitar.calculateMarkup());
    }
}
