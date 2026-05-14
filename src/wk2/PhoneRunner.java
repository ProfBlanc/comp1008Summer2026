package wk2;

public class PhoneRunner {
    //main+tab
    static void main() {
        Phone android = new Phone();
        android.color = "black";
        android.ram = 8;
        android.screenResolution = 2048;
        android.storage = 512;

        IO.println(android.color);
    }
}