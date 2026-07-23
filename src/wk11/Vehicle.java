package wk11;

public abstract class Vehicle {

    private String name, make, model, color, vin;

    public abstract String getMaintenance(int numKilometers);

    public Vehicle(){}

    public Vehicle(String name, String make, String model, String color, String vin) {
        setColor(color);
        setMake(make);
        setModel(model);
        setVin(vin);
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }
}
