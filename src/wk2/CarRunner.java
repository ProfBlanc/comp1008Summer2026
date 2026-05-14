package wk2;

public class CarRunner {

    static void main() {

        Car c = new Car();

        c.name = "";
        c.speed = 0;

        // ask the user for a car name
        String name = IO.readln("Enter a car name: ");
        //ask the user for a value to accelerate
        //Convert.ToDATATYPE    Convert.ToInt32();
        //Integer.parseInt();
        int accelerationSpeed = Integer.parseInt(IO.readln("Enter an acceleration speed: "));

        //ask the user for a deceleration value
        int decelerationSpeed = Integer.parseInt(IO.readln("Enter a deceleration speed: "));

        c.name = name;
        c.accelerate(accelerationSpeed);
        IO.println(c.speed);
        c.decelerate(decelerationSpeed);
        IO.println(c.speed);
    }
}
