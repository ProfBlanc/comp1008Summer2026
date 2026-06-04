package wk5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Week5 {

    static void main() {
        example4();

    }

    static void example1(){
        //Ask the user for a whole number
        //determine if the user has entered a whole number
        //using regex
        //[a-z]
        String text = IO.readln("Enter a whole number: ");
        String regex = "[+-]?\\d+";
        //String.matches()
        IO.println(text.matches(regex));


    }
    static void example2(){
        //force user to input a valid price
        /*
            $1
            $10
            $123.45
            $0.99
            $55.5

            NOT valid
            0.987
            123.456
            12.34.56
         */
        String price = IO.readln("Enter a valid price: ");
        String regex = "^\\$\\d+(\\.\\d{1,2})?$";
        IO.println(price.matches(regex));


    }
    static void example3(){

        String text = "i love apples and peaches! bob feeds charlie fruit for his health";
        String regex = "[aieou]";  // matches all vowels

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

       while(matcher.find()){
           IO.println(matcher.group());  //output the string matched
       }

    }
    static void example4(){
        String text = "My phone number is 705-123-4567. My cell number is 416-987-6543";
        //extract all 10-digit phone numbers (with hyphens), and output them
        //using objects Pattern and Matcher, methods find() and group()
        String regex = "(\\d{3}-){2}\\d{4}";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);
        while(m.find()){
            IO.println(m.group());
        }

    }
    static void example5(){}
}
