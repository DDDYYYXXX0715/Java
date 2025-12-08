package finalExam;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(){
        this.length=0;
        this.width=0;
    }
    public Rectangle(double length, double width){
        setLength(length);
        setWidth(width);
    }
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double Area(){
        return width * length;
    }
}
