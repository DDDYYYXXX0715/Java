package experiment.experiment_2;

public class Circle {
    private double radius;
    private  double area;

    public Circle(double radius){
        this.radius = radius;
        this.area =0.0;
    }
    public double calculateArea(){
        area = Math.PI * radius * radius;
        return area;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return area;
    }
    public String toString(){
        return "Circle[radius=" + radius + ", area=" + String.format("%.2f", calculateArea()) +"]";
    }
}
