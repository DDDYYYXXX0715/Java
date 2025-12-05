package experiment.experiment_2;

public class Rectangle {
    private double length;
    private double width;
    private double area;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
        this.area = 0.0;
    }
    public double calculateArea(){
        area = length * width;
        return area;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return area;
    }
    public String toString(){
        return "Rectangle[length=" + length + ", width=" + width + ", area=" + String.format("%.2f", calculateArea()) +"]";
    }
}
