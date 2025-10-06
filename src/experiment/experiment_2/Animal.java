package experiment.experiment_2;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public abstract void makeSound();

    public static class Main {
        public static void main(String[] args){
            Dog dog = new Dog("鼠标", 1, "边牧");
            Cat cat = new Cat("gloden", 2, "橘色");

            System.out.println("狗发出的声音：");
            dog.makeSound();
            System.out.println("猫发出的声音：");
            cat.makeSound();

            System.out.println("\n=== 动物信息 ===");
            System.out.println("狗的名字：" + dog.getName());
            System.out.println("狗的年龄：" + dog.getAge());
            System.out.println("狗的品种：" + dog.getBreed());

            System.out.println("猫的名字：" + cat.getName());
            System.out.println("猫的年龄：" + cat.getAge());
            System.out.println("猫的颜色：" + cat.getColor());


            Animal animal1 = dog;
            Animal animal2 = cat;

            System.out.print("animal1发出的声音：");
            animal1.makeSound();
            System.out.print("animal2发出的声音：");
            animal2.makeSound();

        }
    }
}
