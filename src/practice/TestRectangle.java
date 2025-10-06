package practice;

public class TestRectangle {
    public static void main(String[] args) {
        System.out.println("=== 长方形类功能测试 ===");

        // 测试1：使用无参构造函数创建对象，并使用set方法设置值
        System.out.println("\n--- 测试1：使用 setter 设置长和宽 ---");
        Rectangle rect1 = new Rectangle();
        rect1.setLength(5.5);
        rect1.setWidth(3.2);

        System.out.println("长方形1: " + rect1);
        System.out.println("面积: " + rect1.calculateArea());
        System.out.println("周长: " + rect1.calculatePerimeter());

        // 测试2：使用带参构造函数
        System.out.println("\n--- 测试2：使用构造函数初始化 ---");
        Rectangle rect2 = new Rectangle(10.0, 4.0);
        System.out.println("长方形2: " + rect2);
        System.out.println("面积: " + rect2.calculateArea());
        System.out.println("周长: " + rect2.calculatePerimeter());

        // 测试3：使用 getter 获取值
        System.out.println("\n--- 测试3：使用 getter 获取长和宽 ---");
        System.out.println("长方形2的长度: " + rect2.getLength());
        System.out.println("长方形2的宽度: " + rect2.getWidth());

        // 测试4：测试异常处理（设置负值）
        System.out.println("\n--- 测试4：尝试设置负值（应抛出异常）---");
        try {
            rect1.setLength(-2.0);
        } catch (IllegalArgumentException e) {
            System.out.println("捕获异常: " + e.getMessage());
        }

        System.out.println("\n所有测试完成。");
    }
}
