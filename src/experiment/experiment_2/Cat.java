package experiment.experiment_2;

public class Cat extends Animal{
    private String color;
    public Cat(String name, int age, String color){
        super(name, age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void makeSound(){
        System.out.println("喵喵喵");
    }
}
