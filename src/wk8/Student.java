package wk8;

import java.util.ArrayList;

public class Student {
    /*
        Student Number
        Name
        Status: either full-time or part-time
        arraylist of grades

        Restrictions:
        student number is 9 digits
        name is at least 5 chars
        status is only 1 of 2 values (see above)
        grades are a whole-number value
        between 0-100 and there must be between 1 and 5 grades

        Testing the behavior of Student class

        - How many instance variables should be
        initiated when creating a student object?
            all 4
        if user does not inialize all 4 => not correctly using Student class

        -What happens if user inputs a  student number that
        has 7 digits? 10 digits? => NO GOOD, given error

     */

    private String name;
    private long studentID;
    public enum Statuses {FULL_TIME, PART_TIME}
    private Statuses status;
    private ArrayList<Integer> grades;

    /**
     *
     * @param name name of Student
     * @param studentID ID of Student
     * @param status status of Student
     * @param grades grades of Student
     * @exception IllegalArgumentException if name isn't 5 chars, studentID isn't 9 nines.....more explanations
     */
    public Student(String name, long studentID, Statuses status, ArrayList<Integer> grades) {
        setName(name);
        setStudentID(studentID);
        setStatus(status);
        setGrades(grades);
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        if(grades.isEmpty() || grades.size() > 5)
            throw new IllegalArgumentException("grades must be between 1 and 5 entries");

        for(int grade: grades){
            if(grade < 0 || grade > 100)
                throw new IllegalArgumentException("grades must be between 0 and 100. Grade: " + grade + " is illegal");
        }

        this.grades = grades;
    }

    //add single grade method   =>      optional work

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if(name == null || name.isEmpty())
            throw new IllegalArgumentException("name cannot be null or empty");
        else if (name.length() < 5) {
            throw new IllegalArgumentException("name must be at least 5 characters");
        }

        this.name = name;
    }

    public Statuses getStatus() {
        return status;
    }

    public void setStatus(Statuses status) {
        if(status == null)
            throw new IllegalArgumentException("status cannot be null");

        this.status = status;
    }

    public long getStudentID() {
        return studentID;
    }

    /**
     * Sets the student ID
     * @param studentID a nine-digit number
     * @exception IllegalArgumentException if number is not nine digits
     */
    public void setStudentID(long studentID) {

        //if(String.valueOf(studentID).length() != 9) # -12345678
        if(studentID <= 99999999)
            throw new IllegalArgumentException("studentID must be 9 characters");

        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name +
                ", studentID=" + studentID +
                ", status=" + status +
                ", grades=" + grades +
                '}';
    }
}
