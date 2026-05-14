import java.util.Scanner;

public class First {

    //main+tab
    static void main() {
        //sout+tab
        System.out.println("Hello World");
        IO.println("Woah, I like this syntax");
        //get user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value");
        String text = input.nextLine();
        IO.println("User inputted " + text);
    }

}
