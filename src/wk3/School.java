package wk3;

public class School {

    /*
    create fields
        name
        yearFounded
        numCoursesOffered
        population
     */
    private String name;
    private short yearFounded;
    private byte numCoursesOffered; //-128 to 127, total 256
    private int population;
    /*
    create methods
        getName()
        setName(name): enforce at least 3 chars
        //get and set for yearFounded & numCoursesOffered
        enrollStudents(numberOfStudents) => increase population by param
     */
    //alt+insert
    //right-click, Generate...


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 3){
            this.name = name;
        }
    }

    public byte getNumCoursesOffered() {
        return numCoursesOffered;
    }

    public void setNumCoursesOffered(byte numCoursesOffered) {
        if(numCoursesOffered >= 5)
            this.numCoursesOffered = numCoursesOffered;
    }

    public int getPopulation() {
        return population;
    }
/*
    public void setPopulation(int population) {
        this.population = population;
    }
*/
    public void enrollStudents(int numStudents){
        if(numStudents > 0){
            population += numStudents;
        }
    }
    public short getYearFounded() {
        return yearFounded;
    }

    public void setYearFounded(short yearFounded) {
        if(yearFounded >= 1800)
            this.yearFounded = yearFounded;
    }

    //alt+insert
    //right-click, Generate...
    public School(){}
    public School(String name, short yearFounded, byte numCoursesOffered, int population) {
        this.name = name;
        this.yearFounded = yearFounded;
        this.numCoursesOffered = numCoursesOffered;
        this.population = population;
    }
}
