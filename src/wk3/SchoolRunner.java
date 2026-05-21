package wk3;

public class SchoolRunner {
//main+tab
    static void main() {
        example2();
       }
   static void example2(){

        //ask the user for a school
            //name, year founded, number of courses, population
       //create 3 objects using 3 unique constructor of School
       String name = IO.readln("Enter school name: ");
       String strYearFounded = IO.readln("Enter year founded: ");
       String strNumCourses = IO.readln("Enter num courses: ");
       String strPopulation = IO.readln("Enter population: ");

       short yearFounded = Short.parseShort(strYearFounded);
       byte numCourses = Byte.parseByte(strNumCourses);
       int population = Integer.parseInt(strPopulation);

       School s1 = new School(name, yearFounded, numCourses);
       School s2 = new School(name);
       School s3 = new School(numCourses, yearFounded, name);

       s1.enrollStudents(population);
       s2.enrollStudents(population * 2);
       s3.enrollStudents(population * 3);
   }
   static void example1(){
       String text;
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


       School empty = new School("", (short)0, (byte)0);
       IO.println(empty.getName());

   }
}
