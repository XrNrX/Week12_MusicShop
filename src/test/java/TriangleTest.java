import Instruments.Triangle;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriangleTest {
    
    Triangle triangle;
    
    @Before
    public void setup(){
        triangle = new Triangle("Steel", "Silver", 15, 25, 3);
    }

    @Test
    public void hasMaterial() {
        assertEquals("Steel", triangle.getMaterial());
    }

    @Test
    public void hasColor() {
        assertEquals("Silver", triangle.getColor());
    }

    @Test
    public void hasBuyPrice() {
        assertEquals(15, triangle.getBuyPrice());
    }

    @Test
    public void hasSellPrice() {
        assertEquals(25, triangle.getSellPrice());
    }

    @Test
    public void hasNumberOfSides() {
        assertEquals(3, triangle.getNumberOfSides());
    }

    @Test
    public void canPlay() {
        assertEquals("Ting Ting Te Ting", triangle.play());
    }

    @Test
    public void hasMarkup() {
        assertEquals(10 , triangle.calculateMarkup());
    }
}
