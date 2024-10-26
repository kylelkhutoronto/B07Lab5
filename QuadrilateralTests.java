package lab4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QuadrilateralTests {

	@Test
	void testPerimeter() {
		Point p1 = new Point(0.0, 0.0);
		Point p2 = new Point(0.0, 1.0);
		Point p3 = new Point(2.0, 1.0);
		Point p4 = new Point(2.0, 0.0);
		Quadrilateral q1 = new Quadrilateral(p1, p2, p3, p4);
		assertEquals(q1.perimeter(), 6.0);
	}
	
	@Test
	void testTriangleArea() {
		Point p1 = new Point(0.0, 0.0);
		Point p2 = new Point(0.0, 1.0);
		Point p3 = new Point(2.0, 1.0);
		Point p4 = new Point(2.0, 0.0);
		Quadrilateral q1 = new Quadrilateral(p1, p2, p3, p4);
		assertEquals(q1.triangleArea(p1, p2, p3), 1.0);
	}
	
	@Test
	void testArea() {
		Point p1 = new Point(0.0, 0.0);
		Point p2 = new Point(0.0, 1.0);
		Point p3 = new Point(2.0, 1.0);
		Point p4 = new Point(2.0, 0.0);
		Quadrilateral q1 = new Quadrilateral(p1, p2, p3, p4);
		assertEquals(q1.area(), 2.0);
	}

}
