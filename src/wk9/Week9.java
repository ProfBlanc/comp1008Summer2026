package wk9;

import java.io.*;
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
            example11();
        }
        catch (IOException e){
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
    static void example8() throws IOException{

        PrintWriter pw = new PrintWriter("src/wk9/test3.txt");
        pw.println("First Line");
        pw.println("Second Line");
        pw.println("Third Line");
        pw.println(4);  //String.valueOf(4);
        pw.close();

        Scanner file = new Scanner(new File("src/wk9/test3.txt"));
        //execute operations
        while(true){
            if(file.hasNextInt()){
                IO.println("INT found: " + file.nextInt());
            }
            else if(file.hasNextLine()){
                IO.println("skipping");
                file.nextLine();
            }
            else{
                break;
            }
        }

        file.close();
    }
    static void example9() throws IOException{

        BufferedWriter bw = new BufferedWriter(
                new FileWriter("src/wk9/test4.txt")
        );
        //bw.write("First Line");
        bw.append("First Line");

        bw.newLine();
        //bw.write("Second Line");
        bw.append("Second Line");
        bw.newLine();
        bw.close();

    }
    static void example10() throws IOException{
        BufferedReader br = new BufferedReader(
                new FileReader("src/wk9/test4.txt")
        );
        String line;
        while((line = br.readLine()) != null){
            IO.println(line);
        }
    }
    static void example11() throws IOException{
        //CSV file => text files with special formatting
        String header = "ID,Name,Age";
        ArrayList<String> data = new ArrayList<>();
        data.add("12345,John,20");
        data.add("12345,Jen,21");
        data.add("12345,Mary,22");
        data.add("12345,Bob,23");
        data.add("12345,Frank,24");

        Path path = Path.of("src", "wk9", "contacts.csv");
        if(!Files.exists(path)){
            Files.createFile(path);
        }
        Files.writeString(path, header + "\n", StandardOpenOption.APPEND);
        Files.write(path, data, StandardOpenOption.APPEND);

    }
    static void example12(){}
    static void example13(){}
    static void example14(){}
    static void example15(){}

}
