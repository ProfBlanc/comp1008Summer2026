package wk2.practice_task;

public class Student {

    private int number;
    private String name;

    public Student(int number, String name){
        /*
        this.number = number;
        this.name = name;
        */
        setName(name);
        setNumber(number);
    }
    public int getNumber(){
        return number;
    }
    public String getName(){
        return name;
    }
    public void setNumber(int number){
        if(number > 100000000){
            this.number = number;
        }
    }
    public void setName(String name){
        this.name = name;
    }

    public String displayInfo(){
        return String.format("Name is %s, number is %d%n",
                name, number);
    }

}
