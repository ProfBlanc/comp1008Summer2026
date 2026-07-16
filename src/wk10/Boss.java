package wk10;

public class Boss extends Fighter {

    private double healthMultiplier;

    public double getHealthMultiplier() {
        return healthMultiplier;
    }

    public void setHealthMultiplier(double value) {
        if (value < 1.5 || value > 3) {
            throw new IllegalArgumentException("invalid health mulitplier");
        }
        healthMultiplier = value;
        setHealth(getHealth() * healthMultiplier);
    }


    public Boss() {
    }

    public Boss(String name, double health, double strength, double multiplier) {
        super(name, health, strength);
        setHealthMultiplier(multiplier);

    }
}


