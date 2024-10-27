public class Circle {
    Point C;
    double rad;

    public Circle(Point C, double rad){
        this.C = C;
        this.rad = rad;
    }

    public double perimeter(){
        return 2*Math.pi*this.rad;
    }

    public boolean isPointInside(Point x){
        double dist = x.distance(this.C);
        if(dist <= rad) return true;
        return false;
    }
}
