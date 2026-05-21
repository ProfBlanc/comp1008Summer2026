package wk3;

/**
 * This is an awesome example of a School class
 * @author Prof Blanc
 * @since May 21, 2026
 */
public class School {

    /*
    create fields
        name
        yearFounded
        numCoursesOffered
        population
     */
    /** Stores the name of the school */
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

    /**
     * Retrieve name of school value
     * @return name of school
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     * @param name Name of the school. 3 chars min
     */
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
    public School(String name, short yearFounded, byte numCoursesOffered) {
//        this.name = name;
//        this.yearFounded = yearFounded;
//        this.numCoursesOffered = numCoursesOffered;
//        this.population = population;
        setName(name);
        setYearFounded(yearFounded);
        setNumCoursesOffered(numCoursesOffered);
    }
    public School(String name){
        setName(name);
    }
    public School(byte numCoursesOffered, short yearFounded, String name){
        //DRY: Don't Repeat Yourself
        this(name, yearFounded, numCoursesOffered);

        /*
            this.   => refers to a field
                this.name, this.population

            this() => refers to a constructor
         */
    }
    public School(short yearFounded, byte numCoursesOffered, String name){
        this(name, yearFounded, numCoursesOffered);
    }
    //alt+7: display class structure
}
