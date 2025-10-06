package experiment.experiment_2;

public class Main {
    public static void main(String[] args){
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        System.out.println("圆的面积：" + circle.Area());
        System.out.println("矩形的面积：" + rectangle.Area());
        System.out.println("\n=== 多态性演示 ===");

    }
}
