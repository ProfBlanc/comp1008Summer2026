package wk8;

import java.util.ArrayList;

public class Week8 {

    public static void main(String[] args) {
        example2();
    }
    static void example2(){

        ArrayList<Integer> grades = new ArrayList<Integer>();
        grades.add(80);
        grades.add(50);
        grades.add(100);

        try {

            Student s = new Student("John", 123456789,
                    Student.Statuses.FULL_TIME, grades);
            IO.println(s);
        }
        catch (Exception e) {
            IO.println(e.getMessage());
        }
    }
    static void example1(){
        IO.println("Hello");

        String value = String.valueOf(-12345678);
        IO.println(value);
        IO.println(value.length());

    }
}

// Vacation lay-over
//
