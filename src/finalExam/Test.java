package finalExam;
class Father{
    //私有属性
    private String name ="zhangjun";

    //内部类
    class Child{
        //定义方法
        public void introFather(){
            System.out.println("Father's name is " + name);
        }
    }
}
public class Test {
    public static void main(String[] args){
        Father father = new Father();
        Father.Child child = father.new Child();

        child.introFather();
    }
}
