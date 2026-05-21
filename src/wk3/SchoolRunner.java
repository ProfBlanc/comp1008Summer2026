package wk3;

public class SchoolRunner {
//main+tab
    static void main() {

        //initializing, instantiating, creating an object
        School georgianCollege = new School();
        georgianCollege.setName("Georgian College");
        // 1965 a literal value
        // what's a literal value: value NOT attached to a  variable
        // 3 categories: 1) text  2) whole numbers  3) decimal
        short yearFounded = 1965;
        georgianCollege.setYearFounded( (short) 1965 );
        georgianCollege.setYearFounded(yearFounded);
        georgianCollege.setNumCoursesOffered((byte)50);
        georgianCollege.enrollStudents(15);
        IO.println(georgianCollege.getPopulation());


School empty = new School("", (short)0, (byte)0, 0);
IO.println(empty.getName());
    }
}
