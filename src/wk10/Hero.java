package wk10;

public class Hero extends Human{

    public String heroName;
    protected String power;

    public Hero(){}

    public Hero(String name, double height, int age, double weight, boolean isSmiling, boolean isHavingFun, String heroName, String power) {
        super(name, height, age, weight, isSmiling, isHavingFun);
        this.heroName = heroName;
        this.power = power;
    }

    public String toString(){
        return super.toString()
                .replace("Human", "Hero")
                .replace("}", ", ")
                + "HeroName = " + heroName
                + ", Super Power = " + power + "}";
    }
}
