import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    public Triangle triangle;
    @Test
    public void money() {
        triangle = new Triangle();
        assertEquals(false,triangle.money(4));
        assertEquals(false,triangle.money(17));
        assertEquals(true,triangle.money(22));
        assertEquals(false,triangle.money(29));
        assertEquals(false,triangle.money(40));
        assertEquals(true,triangle.money(63));
        assertEquals(true,triangle.money(83));
        assertEquals(false,triangle.money(85));


    }

    @Test
    public void main() {
    }
}