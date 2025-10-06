//创建一个名为Person的类，该类具有以下属性和方法：
//	属性：name（表示人的名字，字符串类型）、age（表示人的年龄，整数类型）。
//	方法：introduce()方法，用于打印出人的名字和年龄信息。
//	构造函数：创建一个无参构造函数和一个有两个参数（分别对应name和age）的构造函数。
//	创建实例，使用无参构造函数和有参构造函数实例化了Person类的对象，并调用了introduce()方法来输出人的信息。
package experiment.experiment_2;

public class Person {
    private String name;
    private int age;

    //无参构造函数
    public Person(){
        this.name = "";
        this.age = 0;
    }
    //有参构造方法
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    //introduce()方法
    public void introduce(){
        System.out.println("我叫" + name + ",今年" + age + "岁。");
    }

    //主方法，用于测试
    public static void main(String[] args){
        Person p1 = new Person();
        p1.name = "张三";
        p1.age = 18;

        Person p2 = new Person("李四",20);

        p1.introduce();
        p2.introduce();
    }
}
