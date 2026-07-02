package wk8;

import org.junit.Before;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {

    private Person p;

    @Before
    public void setUp(){
        p = new Person("John Smith", 50);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Mary Mary", "Jack Jack", "Jen Jen"})
    public void testSetName(String name){
        p.setName(name);
        assertEquals(name, p.getName());
    }

    @ParameterizedTest
    @ValueSource(ints = {20, 30, 40, 50, 60})
    public void testSetAge(int age){
        p.setAge(age);
        assertEquals(age, p.getAge());
    }

    @ParameterizedTest
    @CsvSource({"Ben Ben,60", "Joe Joe,70", "Frank Frank, 80"})
    public void testBothSetNameAndSetAge(String name, int age){
        p.setName(name);
        p.setAge(age);
        assertEquals(name, p.getName());
        assertEquals(age, p.getAge());
    }

}