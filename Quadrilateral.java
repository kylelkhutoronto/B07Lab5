package lab4;

public class Quadrilateral {
	
	Point A;
	Point B;
	Point C;
	Point D;
	
	public Quadrilateral(Point A, Point B, Point C, Point D) {
		
		// assumes user inputs points in clockwise or counterclockwise order of a valid Quadrilateral
		
		this.A = A;
		this.B = B;
		this.C = C;
		this.D = D;
	}
	
	public double perimeter() {
		return A.distance(B) + B.distance(C) + C.distance(D) + D.distance(A);
	}
	
	public double area() {
		return triangleArea(A, B, C) + triangleArea(A, D, C); // two halves of the quad
	}
	
	public double triangleArea(Point A, Point B, Point C) {
		
		double semiP = 0, area = 0;
		
		semiP = (A.distance(B) + B.distance(C) + C.distance(A)) / 2;
		
		area = Math.sqrt(semiP * (semiP - A.distance(B)) * 
				(semiP - B.distance(C)) * (semiP - C.distance(A)));
		
		return area;
	}
}
