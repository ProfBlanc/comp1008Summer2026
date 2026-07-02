package wk8;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    private Student s;
    private ArrayList<Integer> grades = new ArrayList<>();


    @Before
    public void setUp() {

        grades.add(80);
        grades.add(50);
        grades.add(100);

    }

    @Test   //Annotation  => this method has a special meaning  => not a regular method
    public void testConstructorWithAllValidValuesHardCoded() {
        //System.out.println("Hello World");

        s = new Student("John Smith", 123456789,
                Student.Statuses.FULL_TIME, grades);

        //Assertions  => Test the behavior of a function:
        // Execution of method
        // Expected value
        // Actual Value
        //Assumption is expected = actual

        assertEquals("John Smith", s.getName());
        assertNotEquals("Ben", s.getName());
        assertTrue(s.getName().length() >= 5);
        assertFalse(String.valueOf(s.getStudentID()).length() < 9);

    }
    @Test
    public void testConstructorWithInValidFirstNameHardCoded() {

        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> {s = new Student("John", 1323456789, Student.Statuses.FULL_TIME, grades);}
        );

        assertEquals("name must be at least 5 characters", ex.getMessage());
    }
    @Test
    public void testConstructorWithNullFirstName() {

        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> {s = new Student(null, 1323456789, Student.Statuses.FULL_TIME, grades);}
        );

        assertEquals("name cannot be null or empty", ex.getMessage());
    }
    @Test
    public void testConstructorWithEmptyFirstName() {

        IllegalArgumentException ex = assertThrows(
                IllegalArgumentException.class,
                () -> {s = new Student("", 1323456789, Student.Statuses.FULL_TIME, grades);}
        );

        assertEquals("name cannot be null or empty", ex.getMessage());
    }

}