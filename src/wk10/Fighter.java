package wk10;

public class Fighter {

    private String name;
    private double health;
    private double strength;
    public Fighter(){}
    public Fighter(String name, double health, double strength) {
        setName(name);
        setHealth(health);
        setStrength(strength);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() < 3)
            throw new IllegalArgumentException("Name too short");

        this.name = name;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        if(health < 0 || health > 100)
            throw new IllegalArgumentException("Invalid Health");

        this.health = health;
    }
    public String attacks(Fighter attacker){
        this.health -= attacker.getStrength();
        return attacker.name + " attacked " + name
                + " with the strength value of " + attacker.strength + ". \n"
                + name + " now has the health value of " + health + ".";
    }

    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        if(strength < 10 || strength > 20){
            throw new IllegalArgumentException("Invalid Strength");
        }
        this.strength = strength;
    }
    public boolean isAlive(){
        return health > 0;
    }
    public String toString(){
        return name + " has a health of " + health + " and has the strength of " + strength;
    }
}
