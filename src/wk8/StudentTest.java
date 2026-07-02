package wk8;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test   //Annotation  => this method has a special meaning  => not a regular method
    public void testDefaultConstructorWithAllValidValuesHardCoded() {
        //System.out.println("Hello World");

        ArrayList<Integer> grades = new ArrayList<Integer>();
        grades.add(80);
        grades.add(50);
        grades.add(100);
            Student s = new Student("John Smith", 123456789,
                    Student.Statuses.FULL_TIME, grades);
            IO.println(s);


    }
    @Test
    public void test1() {
       // System.out.println("Cool Beans");
    }

}