package finalExam;

public class TestRectangle {
    public static void main(String[] args){
        Rectangle rect = new Rectangle();
        rect.setWidth(10);
        rect.setLength(12);
        System.out.println("长方形的长为："+rect.getLength());
        System.out.println("长方形的宽为："+rect.getWidth());
        System.out.println("长方形的面积为：" + rect.Area());
    }
}
