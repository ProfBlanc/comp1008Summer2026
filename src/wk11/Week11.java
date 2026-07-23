package wk11;

public class Week11 {
    static void main() {

        example2();
    }

    static void example2(){

       Truck t1 = new Truck();
       Vehicle v1 = new Truck();
       LandVehicle lv1 = new Truck();
       Moveable m1 = new Truck();



    }

    static void example1(){

        String answer = IO.readln("Enter an odd number: ");
        try{
            int number = Integer.parseInt(answer);
            if(number % 2 != 1){
                throw new NumberNotOddException(number + " is not odd");
            }
        }
        catch (NumberFormatException  e){
            IO.println("Invalid whole number entered");
        }
        catch (NumberNotOddException e){
            IO.println(e.getMessage());
        }

    }
}
