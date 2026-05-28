// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        
        double ran = Math.random();  // random value between 0 and less than 1
        double rounded = Math.round(ran * 10) + 1;  // produces values betwen 1 & 10
        int wholeNumber = (int) rounded;
        IO.println(rounded);
       
        while(true){
        System.out.println("");
        int guess = Integer.parseInt(IO.readln("Enter a number between 1 and 10"));
        if(guess == wholeNumber){
            IO.println("Congrats, you correctly guessed the number of " + wholeNumber);
            break;
        }
        IO.println("Inccorect guess. Please try again");
        }
        }
}