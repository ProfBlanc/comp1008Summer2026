package wk4;

public class Week4{


public static void main(String[] args) {

	example1();
	
}

static void example1(){


    //String is technicall a collection data type
    // collection of characters
    //??? then why don't we have to create an array to create a String
    ///ans: javac helps programmers
    String name = "Ben";
    String name1 = new String("Ben");
    char[] name2 = {'B', 'e', 'n'}; 
    //String is a class, it is reference data type.
    Person p = new Person();
    p.name = "Blanc";
    name = "Benny";
    String name3 = new String(name2);
    String name4 = new String();

}
static void example2(){

    String name = "comp1008";
        char first = name.charAt(0);
        System.out.println(first);
        int numChars = name.length();
        for(int i = 0; i < numChars; i++){
            System.out.println(name.charAt(i));
        }
        /*
index               0       1       2       3       4       5       6       7
char                c       o       m       p       1       0       0       8
        */

}
static void example3(){

            String text = "Hello everyone! How are you doing?";
           // int index = text.indexOf("e");
            //int index = text.lastIndexOf("e");
            int index = text.indexOf("z");
            System.out.println(index);
            text = "   co  ol     ";
            System.out.println(text.length());
            System.out.println(text.trim().length());

}
static void example4(){

            String text = "Hello everyone! How are you doing?";
            //substring()  generating multiple charAt() requests
            String hello = text.substring(0,5);
            System.out.println(hello);
            String ever = text.substring(6,10);
            System.out.println(ever);

}
static void example5(){

                                        
            String text = "Hello";
            //text[0] = "Y";
            text = "Yello";
            text += "w";
}
static void example6(){

            String text = "Hello everyone! How are you doing?";
            text = text.toUpperCase(); //toLowerCase();
            boolean answer = text.toLowerCase().contains("h");
            System.out.println(answer);

}
static void example7(){

        double v1 = 12.34;
        int v2 = (int)v1;
        String s1 = "98";
        StringBuilder s2 = new StringBuilder("98.76");
        int v3 = Integer.parseInt(s1);
        float v4 = Float.parseFloat(s2.toString());
        double v5 = Double.parseDouble(s2.toString());

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4);

}
static void example8(){

       int n1 = 10;
       int n2 = 20;
       int n3 = 50;
       
       double avg = (n1 + n2 + n3) / (double)3;
       System.out.println(avg);


}
static void example9(){

       int rows = 5, cols = 5;
       
       for(int i = 0; i < rows; i++){
           
           for(int j = 0; j < cols; j++){
               System.out.print("*");
           }
           System.out.println();
       }
       

}
static void example10(){
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
