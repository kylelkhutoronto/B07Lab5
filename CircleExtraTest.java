import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CircleExtraTest {

    @Test
    void testPointInside1() {
        Point p1 = new Point(1, 2);
        double rad = 3;
        Circle c = new Circle(p1, rad);
        Point p2 = new Point(2, 1);
        assertTrue(isPointInside(p2));
    }

    @Test
    void testPointInside2() {
        Point p1 = new Point(-1, -1);
        double rad = 1;
        Circle c = new Circle(p1, rad);
        Point p2 = new Point(1, 1);
        assertFalse(isPointInside(p2));
    }

    @Test
    void testPointInside3() {
        Point p1 = new Point(0, 0);
        double rad = 2.3;
        Circle c = new Circle(p1, rad);
        assertTrue(isPointInside(p1));
    }

}