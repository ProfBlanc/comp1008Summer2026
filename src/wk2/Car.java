package wk2;

public class Car {

    boolean engineOn;
    int speed;
    String name;

    public void turnOn(){
        engineOn = true;
    }
    public void turnOff(){
        engineOn = false;
    }
    public int accelerate(int speedToAccelerateBy){

        int diff = Math.abs(speed - speedToAccelerateBy);

        speed += speedToAccelerateBy;
        return diff;
    }

    public int decelerate(int speedToSlowDownBy){
        return accelerate(speedToSlowDownBy * -1);
    }

}
