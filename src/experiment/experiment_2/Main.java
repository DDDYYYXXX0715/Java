package experiment.experiment_2;

public class Main {
    public static void main(String[] args) {
        // 创建 Circle 和 Rectangle 对象
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        // 调用方法计算面积
        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Rectangle area: " + rectangle.calculateArea());

        // 展示对象信息
        System.out.println(circle);
        System.out.println(rectangle);
    }
}
