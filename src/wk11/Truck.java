package wk11;

//what is Trucks parent?        LandVehicle
//what is Trucks grandparent?   Vehicle
//great grandparent             Object
//Objec     Vehicle     LandVehicle     Truck
public class Truck extends LandVehicle implements GasPowered, Moveable {


    @Override
    public boolean isRunningLow() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public boolean runningFast() {
        return false;
    }

    @Override
    public void fillTank(double gasAmount) {

    }

    @Override
    public int getMaxLoadWeight() {
        return 0;
    }

    @Override
    public int getMaxPassengers() {
        return 0;
    }

    @Override
    public void setSpeed(int speed) {

    }

    @Override
    public int getSpeed() {
        return 0;
    }

    @Override
    public String getMaintenance(int numKilometers) {
        return "";
    }
}
