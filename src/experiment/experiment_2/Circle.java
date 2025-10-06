package experiment.experiment_2;

public class Circle {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    public double Area(){
        return Shape.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
