package wk10;

public class Human {
    private String name;
    private double height;
    private int age;

    public double weight;
    boolean isSmiling;      //default access-level  aka package-private
    protected boolean isHavingFun;


    public Human(){}

    public Human(String name, double height, int age, double weight, boolean isSmiling, boolean isHavingFun) {

        setAge(age);
        setName(name);
        setHeight(height);

        this.weight = weight;
        this.isSmiling = isSmiling;
        this.isHavingFun = isHavingFun;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", age=" + age +
                ", weight=" + weight +
                ", isSmiling=" + isSmiling +
                ", isHavingFun=" + isHavingFun +
                '}';
    }
}
