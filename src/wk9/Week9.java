package wk9;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Week9 {

    public static void main(String[] args) {
        //example5();
        try{
            example7();
        }
        catch (Exception e){
            IO.println("Error! " + e.getMessage());
        }
    }

    static void example1(){

        Path path = Path.of("."); // by default. CWD is project root
        IO.println (path.toAbsolutePath());


    }
    static void example2(){

        Path path = Path.of("src", "wk9", "notes.txt");
        File file = path.toFile();

        IO.println (path.toAbsolutePath());
        IO.println (path.getFileName());
        IO.println (file.getName());
        IO.println (file.getParent());
        IO.println (file.getPath());




    }
    static void example3(){
        Path path = Path.of("src", "wk9", "notes.txt");

        // Files    =>      class with static methods.

       // Files.readString(path);     // pass a path object
        //Files.readAllLines(path);   //surround these methods in try-catch statements

            IO.println(Files.isDirectory(path));
            IO.println(Files.isRegularFile(path));
            IO.println(Files.isReadable(path));
            IO.println(Files.isWritable(path));
            IO.println(Files.isExecutable(path));

        try{
            String content = Files.readString(path);
            List<String> lines = Files.readAllLines(path);

            IO.println(content);
            IO.println("*".repeat(20));
            for(String line : lines){
                IO.println(line);
            }
        }
        catch(IOException ex){
            IO.println (ex.getMessage());
        }

    }
    static void example4(){
        //write data to a text file named test1.txt in project root => wk9 folder
        // content = "I love java\nHow about you?"

        //step 1: create a ____ object
        Path path = Path.of("src", "wk9", "test1.txt");

        //step 2: create a String object with desired content
        String content = "I love java\nHow about you?\n";

        //step 3: attempt to write data
        try{
            Files.writeString(path, content);
        }
        catch(IOException e){
            IO.println (e.getMessage());
        }


    }
    static void example5(){
        //write data to a text file named test1.txt in project root => wk9 folder
        // content = "I love java\nHow about you?"

        //step 1: create a ____ object
        Path path = Path.of("src", "wk9", "test2.txt");

        //step 2: create a String object with desired content
        String content = "I love java\nHow about you?\n";
        ArrayList<String> lines = new ArrayList<>();
        for(int i = 1; i <= 5; i++){
            lines.add("Line " + i);
        }

        //step 3: attempt to write data
        try{
            if(!Files.exists(path)){
                Files.createFile(path);
            }
            Files.writeString(path, content, StandardOpenOption.APPEND);
            Files.write(path, lines, StandardOpenOption.APPEND);
        }
        catch(IOException e){
            IO.println ("ERROR" + e.getMessage());
        }


    }

    static void example6() throws IOException{
        //Scanner object can be used to manipulate files

        Path path = Path.of("src", "wk9", "test2.txt");

        Scanner file = new Scanner(path.toFile());
        //hasNextFloat/Int/Double/Byte
        while(file.hasNextLine()){
            IO.println(file.nextLine());
        }

    }
    static void example7() throws IOException{
        Path path = Path.of("src", "wk9", "numbers.txt");
        Scanner file = new Scanner(path.toFile());
        while(true){
            if(file.hasNextInt()){
                IO.println("INT value found: " + file.nextInt());
            } else if (file.hasNextDouble()) {
                IO.println("DOUBLE value found: " + file.nextDouble());

            } else if (file.hasNextLine()) {
                IO.println("Line value found, skipping ");
                IO.println(String.format("'%s'", file.nextLine()));
            }
            else{
                break;
            }
        }
    }
    static void example8(){}
    static void example9(){}
    static void example10(){}

}
