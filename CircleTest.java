import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CircleTest{

    @Test
    void testPerimeter(){
        Point center = new Point(0.0, 0.0);
        Circle c1 = new Circle(center, 1.0);

        assertEquals(2* Math.PI * 1.0, c1.perimeter(), 0.0001);
        Circle c2 = new Circle(center, 2.5);
        assertEquals(2* Math.PI * 2.5, c2.perimeter(), 0.0001);
    }

}
