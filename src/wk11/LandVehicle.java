package wk11;

public abstract class LandVehicle extends Vehicle {

    private int numWheels;
    public int getNumWheels(){
        return numWheels;
    }
    public void setNumWheels(int numWheels){
        this.numWheels = numWheels;
    }

    public LandVehicle(){}

    public LandVehicle(String name, String make, String model, String color, String vin) {
        super(name, make, model, color, vin);

    }

    public LandVehicle(String name, String make, String model, String color, String vin, int numWheels) {
        super(name, make, model, color, vin);
        setNumWheels(numWheels);
    }

    public abstract int getMaxLoadWeight();
    public abstract int getMaxPassengers();
}
