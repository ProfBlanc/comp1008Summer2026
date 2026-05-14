package wk2;

public class StringFormattingExample {

    static void main() {
        String item;
        int quantity;
        float price, total;

        item = IO.readln("Enter item name: ");
        quantity = Integer.parseInt(IO.readln("Enter quantity: "));
        price = Float.parseFloat(IO.readln("Enter price: "));

        total = price * quantity;

        String formattedText = String.format("%-15s %5d $%8.2f $%8.2f",
                item, quantity, price, total);
        IO.println(formattedText);

    }
}
