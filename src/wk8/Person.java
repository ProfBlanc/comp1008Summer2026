package wk8;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        setAge(age);
        setName(name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 0 && age <= 100)
            this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null && name.length() >= 5)
            this.name = name;
    }

    @Override
    public String toString() {
        return "wk8.Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
