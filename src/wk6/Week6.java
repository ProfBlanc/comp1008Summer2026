package wk6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Week6 {

    static void main() {
        example4();
    }

    static void example1(){

        //arraylist of doubles
        ArrayList<Double> nums = new ArrayList<>();

        double d1 = 1;

        nums.add(1.0);
        nums.add(2d);
        nums.add(3D);
        //double         Double
        double third = nums.get(2);  //unboxing
        Double second = nums.get(1);

        double mystery = second;        //unboxing
        second = 10d;                   //boxing

       Iterator<Double> iterator  = nums.iterator();

       while(iterator.hasNext()){
           IO.println(iterator.next());
       }
       IO.println("*".repeat(20));

       for(int i = 0; i < nums.size(); i++){
           IO.println(nums.get(i));
       }
    }
    static void example2(){
        //ask the user to enter 5 first names
        //ensure that the names are unique
        //output the names

        HashSet<String> names = new HashSet<>();
        while(names.size() < 5) {
            names.add(IO.readln("Enter a first name: "));
        }

        for(String name : names){
            IO.println(name);
        }

    }
    static void example3(){

        //ask the user for their favourite
        //sport to watch during a specific season

        //create a HashSet of seasons                       DONE
        //iterate this hashset of seasons and
        // ask user for their fav sport to watch
        //add Season and Sport to a HashMap

        HashMap<String, String> seasonSport = new HashMap<>();
        HashSet<String> seasons = new HashSet<>();
        seasons.add("Spring");
        seasons.add("Winter");
        seasons.add("Summer");
        seasons.add("Fall");
        Iterator<String> iterator = seasons.iterator();

        while(iterator.hasNext()){

            String currentSeason = iterator.next();
            String answer = IO.readln("Enter your fav sport to watch during " + currentSeason);
            seasonSport.put(currentSeason, answer);

        }

        for(String currentSeason : seasons){
            IO.println("In " + currentSeason + ", your fav sport is: " +  seasonSport.get(currentSeason));
        }

    }
    static void example4(){
        try {
            int num = Integer.parseInt(IO.readln("Enter a number: "));
            IO.println(num);
        }
/*
        catch (NumberFormatException e){
            IO.println("Could not convert number");
        }
*/
        catch(Exception e){
            IO.println(e.getClass().getName());
            IO.println(e.getMessage());

        }
        finally {
            IO.println("This block will run no matter what");
        }
    }
    static void example5(){}
}
